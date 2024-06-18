package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E09_SaveGame_Answer {
	
	public static void main(String[] args) {
		
		File saveFile = new File("myfiles/rspgame.sav");
		
		int win, draw, lose;
		
		if (!saveFile.exists()) {
			win = 0;
			draw = 0;
			lose = 0;
		} else {
			try (
					FileInputStream fin = new FileInputStream(saveFile);
					DataInputStream din = new DataInputStream(fin);
					) {
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
			} catch (IOException e) {
				e.printStackTrace();
				win = 0;
				draw = 0;
				lose = 0;
			}
			
		}
		System.out.printf("게임 시작전 불러들인 전적: %d승 %d무 %d패\n",
				win, draw, lose);
		
		// char타입으로 이모지 값을 활용할 수 있다
		char[] shapes = {0x270C, 0x270A, 0x270B};
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; ++i) {
			System.out.println("가위(0), 바위(1), 보(2) > ");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3);
			
			if (user == com) {
				System.out.printf("무승부입니다! (user:%s vs com: %s)\n",
						shapes[user], shapes[com]);
				++draw;
			} else if ((user + 1) %3 == com) {
				System.out.printf("당신의 패배입니다! (user:%s vs com: %s)\n",
						shapes[user], shapes[com]);
				++lose;
			} else {
				System.out.printf("당신의 승리입니다! (user:%s vs com: %s)\n",
						shapes[user], shapes[com]);
				++win;
			}

		}
		
		System.out.printf("게임이 10번 진행되고 난 후의 전적: %d승 %d무 %d패\n",
				win, draw, lose);
		try (
				FileOutputStream fout = new FileOutputStream(saveFile);
				DataOutputStream dout = new DataOutputStream(fout);
				) {
			
			dout.writeInt(win);
			dout.writeInt(draw);
			dout.writeInt(lose);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
