package quiz;

public class B13_RandomScores {
	
	/*
	 
	 	1. 100개의 점수를 랜덤으로 생성하여 배열에 저장
	 	   (점수는 0 ~ 100점)
	 	   
	 	2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 	   (단, 60점 미만인 점수는 X로 표시)
	 	   
	 	3. 모든 점수의 평균 점수를 출력 (소수 둘째 자리까지 출력)
	 	
	 	4. 생성된 랜덤 점수중 가장 높은 점수와 가장 낮은 점수를 출력
	 
	 */
	
	public static void main(String[] args) {
		
		int scores [] = new int[100];
		
		// 1.
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)((Math.random() * 100) + 1);
	
		}
		
		// 2. 
		for (int i = 0; i < scores.length; ++i) {
				if (scores[i] < 60) {
					System.out.print("X" + "\t");
				} else {
					System.out.print(scores[i] + "\t");
				}
				
				if (i % 10 == 9) {
					System.out.println();
				}
		}
		
		// 3.
		int total = 0;
		
		for (int i = 0; i < scores.length; ++i) {
			total += scores[i];
		}
		System.out.printf("총 평균점수는 %.2f 입니다", (double) total / scores.length);
		
		System.out.println();
		
		// 4.
		
		int minScore = 100;
		int maxScore = 0;
		
		for (int i = 0; i < scores.length; ++i) {
			
			minScore = minScore > scores[i] ? scores[i] : minScore;
			maxScore = maxScore < scores[i] ? scores[i] : maxScore;
			
			//minScore = Math.min(minScore, scores[i]);
			//maxScore = Math.max(maxScore, scores[i]);
			
		}
		
		System.out.printf("최저 점수는 : %d, 최고 점수는 : %d 입니다", minScore, maxScore);
	}
}
