package baek;
import java.util.Scanner;


public class B_14681 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minutes = sc.nextInt();
		sc.close();
		
		if (minutes < 45) {
			hour--;
			minutes = 60 - (45 - minutes);
			if (hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + minutes);
		}
		else {
			System.out.print(hour + " " + (minutes - 45));
		}
		
	}

}
