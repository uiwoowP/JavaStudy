package quiz;
import myobj.omok_answer.Omok;

public class D08_Omok_Answer {
	public static void main(String[] args) {
		Omok omok = new Omok();
		
//		omok.putBlack(3, 7);
//		omok.putBlack(4, 7);
//		omok.putBlack(5, 7);
//		omok.putBlack(6, 7);
//		omok.putBlack(7, 7);
		
//		omok.putWhite(3, 5);
//		omok.putWhite(3, 6);
//		omok.putWhite(3, 7);
//		omok.putWhite(3, 8);
//		omok.putWhite(3, 9);
		
//		omok.putBlack(5, 5);
//		omok.putBlack(6, 6);
//		omok.putBlack(7, 7);
//		omok.putBlack(8, 8);
//		omok.putBlack(9, 9);
		
		omok.putBlack(5, 7);
		omok.putBlack(4, 6);
		omok.putBlack(3, 5);
		omok.putBlack(2, 4);
		omok.putBlack(1, 3);
		
		omok.printBoard();
		
		System.out.println(omok.postCheck(1, 3, omok.BLACK_STONE));
		
		
	
		
		
	}

}
