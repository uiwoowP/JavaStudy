package quiz;
import java.util.Scanner;


 // default를 가장 마지막에 사용할 필요는 없음
 // 최근 버전의 자바에서는 ,로 케이스 구문안에 들어가는 case 선언 가능 
 // 반복되는 코드를 최대한 줄이는 것이 좋음
public class B05_MonthToSeason_Answer {
	
	public static void main(String[] args) {
//		System.out.print("월을 입력(숫자)");
		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
		
		String seasonName;
		
//		switch (month) {
//			default:
//				seasonName = "없는 달";
//				break;
//			case 12: case 1: case 2: case 11:
//				seasonName = "겨울";
//				break;
//			case 3: case 4:
//				seasonName = "봄";
//				break;
//			case 5: case 6: case 7: case 8:
//				seasonName = "여름";				
//				break;
//			case 9: case 10:
//				seasonName = "가을";
//		}
//		System.out.printf("%d월은 %s입니다. \n", month, seasonName);
//	
//	
//	if (month >= 3 && month <= 4) {
//		seasonName = "봄";
//	} else if (month >= 5 && month <= 8) {
//		seasonName = "여름";
//	} else if (month == 9 || month == 10) {
//		seasonName = "가을";
//	} else if (month == 11 || month == 12 || month == 1 || month == 2) {
//		seasonName = "겨울";
//	} else {
//		seasonName = "없는 달";
//	}
//	System.out.printf("%d월은 %s입니다. \n", month, seasonName);
	
	System.out.print("월을 입력(영어): ");
	
	
	// "문자열" .toLowerCase() : 어떤 문자열을 모두 소문자로 바꿔준다
	//monthName = monthName.toLowerCase();
	
	// 비교시 소문자 또는 대문자로 통일한 후에 비교하면
	// 대소문자 상관없이 비교가 가능하다
//	switch (monthName.toLowerCase()) {
//		case "sep": case "oct": 
//			seasonName = "Fall";
//			break;
//		case "nov": case "dec": case "jan": case " feb":
//			seasonName = "Winter";
//			break;
//		case "mar": case "apr":
//			seasonName = "Spring";
//			break;
//		case "may": case "jun": case "jul": case "aug":
//			seasonName = "Summer";
//			break;
//		default:
//			seasonName = "Invalid month";
//			break;
//	}
//	
//	System.out.printf("%s는 %s입니다. \n", 
//			monthName.toUpperCase(), seasonName);
	
	// (문자열뿐만 아니라 대문자로 시작하는 모든 타입들) 비교시에는 equals()
	
	String monthName = sc.next();
	if (monthName.equalsIgnoreCase("jan") || monthName.equalsIgnoreCase("feb") || monthName.equalsIgnoreCase("dec")) {
		seasonName = "Winter";
	} else if (monthName.equalsIgnoreCase("mar") || monthName.equalsIgnoreCase("apr")) {
		seasonName = "Spring";
	} else if (monthName.equalsIgnoreCase("jun") || monthName.equalsIgnoreCase("jul") || monthName.equalsIgnoreCase("aug")) {
		seasonName = "Summer";
	} else if (monthName.equalsIgnoreCase("sep") || monthName.equalsIgnoreCase("nov")) {
		seasonName = "Fall";
	} else {
		seasonName = "";
	}
	
	System.out.printf("%s는 %s 입니다. \n", monthName.toUpperCase(), seasonName);
	}
}
