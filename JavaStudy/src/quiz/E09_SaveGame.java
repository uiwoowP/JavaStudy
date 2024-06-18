package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E09_SaveGame {
	/*
	 
 	컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
 	프로그램 종료시 여태까지의 전적을 파일에 저장해주세요
 	
 	프로그램 실행시에는 파일에 저장되어있는 전적데이터를 읽어 예전 기록이
 	계속해서 이어지도록 만들어보세요
 	
 */
	
	public static String[] RCP = {"바위", "가위", "보"};
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] loadGame() {
		int[] arr = new int[2];
		try (
				FileInputStream fin = new FileInputStream("myfiles/RCP.game");
				DataInputStream din = new DataInputStream(fin);
				) {
			arr[0] = din.readInt();
			arr[1] = din.readInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return arr;
		
	}
	
	public static void saveGame(int usrScore, int comScore) {
		try (
				FileOutputStream fout = new FileOutputStream("myfiles/RCP.game");
				DataOutputStream dout = new DataOutputStream(fout);
				) {
			dout.writeInt(usrScore);
			dout.writeInt(comScore);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		int usrScore = 0;
		int comScore = 0;
		int[] scores = new int[2];
		
		while (true) {
			
			int usrIn = 0;
			try {
				System.out.println("가위바위보 게임입니다.");
				System.out.println("원하는 메뉴의 숫자를 입력해 주세요");
				System.out.println("1. 새로운 게임 시작 | 2. 이전 게임 이어서하기");
				usrIn = sc.nextInt();
				
				if (usrIn > 2 || usrIn < 0 || usrIn == 0) {
					System.out.println("1 또는 2를 입력해주세요!!");
					continue;
				} else if (usrIn == 2) {
					scores = loadGame();
					usrScore = scores[0];
					comScore = scores[1];
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력할 수 있습니다!!");
				continue;
			} finally {
				sc.nextLine();
			}
	
			int usr = 0;
			try {
				System.out.println("### 가위바위보 게임 시작 ###");
				System.out.println("---- 무엇을 내시겠습니까? ----");
				System.out.println("1.바위 | 2.가위 | 3.보");
				System.out.println("--------------------------");
				 usr = sc.nextInt();
				 
				if (usr < 0 ||  usr > 3 || usr == 0) {
					System.out.println("1 ~ 3 사이의 숫자를 입력하세요.");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력할 수 있습니다.");
			} finally {
				sc.nextLine();
			}
			
			int com = (int)(Math.random() * 3) + 1;
			System.out.println("======================================================");
			if (usr == 1 && com == 1) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 비겼습니다.\n", RCP[usr - 1], RCP[com - 1]);
				continue;
			} else if (usr == 1 && com == 2) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 사용자 승리! \n", RCP[usr - 1], RCP[com - 1]);
				usrScore++;
			} else if (usr == 1 && com == 3) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 컴퓨터 승리! \n", RCP[usr - 1], RCP[com - 1]);
				comScore++;
			}
			
			if (usr == 2 && com == 2) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 비겼습니다.\n", RCP[usr - 1], RCP[com - 1]);
				continue;
			} else if (usr == 2 && com == 3) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 사용자 승리! \n", RCP[usr - 1], RCP[com - 1]);
				usrScore++;
			} else if (usr == 2 && com == 1) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 컴퓨터 승리! \n", RCP[usr - 1], RCP[com - 1]);
				comScore++;
			}
			
			if (usr == 3 && com == 3) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 비겼습니다.\n", RCP[usr - 1], RCP[com - 1]);
				continue;
			} else if (usr == 3 && com == 1) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 사용자 승리! \n", RCP[usr - 1], RCP[com - 1]);
				usrScore++;
			} else if (usr == 3 && com == 2) {
				System.out.printf("사용자 [%s]! 컴퓨터 [%s]! 컴퓨터 승리! \n", RCP[usr - 1], RCP[com - 1]);
				comScore++;
			}
			System.out.println("======================================================");
			
			System.out.printf("사용자 현재 점수: < %s > 점 || 컴퓨터 현재 점수: < %s > 점\n", usrScore, comScore);
			
			int menu;
			while (true) {
				try {
					System.out.println("==== 숫자를 입력하세요 ====");
					System.out.println("1.계속하기 | 2. 저장하고 끝내기");
					menu = sc.nextInt();
					
					if (menu < 1 || menu > 2) {
						System.out.println("1 혹은 2 를 입력해 주세요");
						continue;
					} else if (menu == 1) {
						System.out.println("====게임을 계속 진행합니다.====");
						break;
					} else if (menu == 2) {
						System.out.println("게임을 저장합니다.");
						saveGame(usrScore, comScore);
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("1 또는 2를 입력하세요");
				} finally {
					sc.nextLine();
				}
			}
			
			if (menu == 2) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			
		}
		
	}

}
