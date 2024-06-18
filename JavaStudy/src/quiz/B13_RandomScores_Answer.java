package quiz;

public class B13_RandomScores_Answer {
	
	public static void main(String[] args) {
		
		
		int[] scores = new int[100];
		
		// 1.
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 101);
		}
		
		// 2.
		for (int i = 0; i < scores.length; ++i) {

			if (scores[i] < 60) {
				System.out.print("X\t");
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
		System.out.printf("평균점수: %.2f\n", total / (double) scores.length);
		
		// 4.
		int maxScore = 0;
		int minScore = 100;
		
		for (int i = 0; i < scores.length; ++i) {
			
			// # 삼항연산자
			// - 조건 ? 예 : 아니오;
			// - ? 앞의 조건이 참일때는 : 의 왼쪽값을 선택
			// - ? 앞의 조건이 거짓일때는 :의 오른쪽값을 선택
			// 양쪽의 타입이 같아야 함
			maxScore = maxScore > scores[i] ? maxScore: scores[i];
			minScore = minScore < scores[i] ? minScore: scores[i];
			
			//maxScore = Math.max(maxScore, scores[i]);
			//minScore = Math.min(minScore, scores[i]);
			
			// 현재 최고값과 i번째 값을 비교해서 i번째 값이 더 크면
			// 최고값으로 변경한다
//			if (maxScore < scores[i]) {
//				maxScore = scores[i];
//			}
//			// 현재 최저값과 i번째 값을 비교해서 i번째 값이 더 작으면
			// 최저값으로 변경한다
			
//			if (minScore > scores[i]) {
//				minScore = scores[i];
//			}
		}
		System.out.printf("최고점수: %d, 최저점수: %d\n", maxScore, minScore);
		
	}

}
