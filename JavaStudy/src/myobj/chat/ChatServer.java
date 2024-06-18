package myobj.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedList;

public class ChatServer {
	int count = 0;
	ServerSocket ss;
	MessageShare ms = new MessageShare();
	
	public ChatServer(int port) {
		try {
			ss = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		while (true) {
			try {
				Socket s = ss.accept();
				Client client = new Client(s);
				System.out.printf("연결을 기다리는 중... (현재 접속자 %d명)\n", count);
				ms.addClient(client);
				
				// 연결될때마다 연결된 클라이언트의 메세지를 기다리는 쓰레드
				new ListeningThread(s).start();
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	
	public static void main(String[] args) {
		new ChatServer(9000).start();
		
	}
	
	class ListeningThread extends Thread {
		
		Socket s;
		Client client;
		
		public ListeningThread(Socket s) {
			this.s = s;
			this.client = new Client(s);
			
		}
		
		@Override
		public void run() {
			System.out.println("듣기 쓰레드 시작됨... ");
			try (
					InputStreamReader isr = new InputStreamReader(s.getInputStream());
					BufferedReader in = new BufferedReader(isr);
					) {
				while (true) {
					String message = in.readLine();
					System.out.printf("\"%s\"로부터 도착한 메세지: %s\n",
							client.getId(),
							message);
					// MessageShare에 등록된 모든 클라이언트들에게 메세지 전달
					ms.sendMessageAll(message);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class MessageShare {
	LinkedList<Client> allClients = new LinkedList<>();
	
	void sendMessageAll(String message) {
		for (Client client : allClients) {
			client.sendMessage(message);
		}
	}
	
	void addClient(Client client) {
		allClients.add(client);
	}
	
	void removeClient(Client client) {
		allClients.remove(client);
	}
}


