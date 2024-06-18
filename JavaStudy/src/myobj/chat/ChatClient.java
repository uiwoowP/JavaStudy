package myobj.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class ChatClient {
	
	static class ListeningThread extends Thread {
		Client client;
		
		public ListeningThread(Client client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			
			try (
			BufferedReader in = client.getInputStream();
				) {
			while (true) {
				// 서버로부터 무언가 도착하기를 계속 기다리면서 받으면 바로 출력
				System.out.println("\n" + in.readLine() + "\n>> ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 9000);
			Client c = new Client(s);
			
			// 데이터 듣기 쓰레드 (서버에서 부터 메세지를 받아오는 쓰레드)
			new ListeningThread(c).start();
			
			System.out.println("서버에 연결되었습니다!");
			try (
					
					BufferedReader in = new BufferedReader(c.getInputStream());
					PrintStream out = new PrintStream(s.getOutputStream());
					) {
				// 데이터 쓰기 쓰레드 (서버로 채팅을 전송할 쓰레드)
				while (true) {
					System.out.println(">> ");
					String message = in.readLine();
					out.println(message);
				}
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
