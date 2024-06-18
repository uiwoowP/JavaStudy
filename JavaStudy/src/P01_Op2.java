import java.util.ArrayList;


public class P01_Op2 {
	
	public static void main(String [] args ) {
	int gameScore = 150;
	
	int lastScore1 = ++gameScore; //gameScore에 1만큼 더한 값을 lastScore1로 보냄
	System.out.println(lastScore1);
	
	int lastScore2 = gameScore++; //값을 lastScore로 보낸후 gameScore에 1만큼 더한 값을 보냄 
	System.out.println(lastScore2);
	
	int lastScore3 = --gameScore; // gameScore에 1만큼 뺀 값을 lastScore3로 보냄
	System.out.println(lastScore3);
	
	/*
	 * &&  = and ?
	 * || = or ?
	 * ! = not ? 
	 */
	
	int num1 = 10;
	int num2 = 20;
	
	boolean flag = (num1 > 0) && (num2 > 0);
	System.out.println(flag);

	//타입은 한번 선언하면 다음에는 안해도 되는가요?
	//원시 타입의 불리언은 getClass()로 출력 불가
	
	flag = (num1 < 0) && (num2 < 0);
	System.out.println(flag);
	
	
	}
}
