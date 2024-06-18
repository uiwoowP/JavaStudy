package scheduler;
import java.io.IOException;

public class SchedulerTest {
	/*
	 	
	 	인터페이스는 구현된 클래스를 사용하는 클라이언트 코드와 
	 	기능을 제공하는 코드 사이의 약속
	 	
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 가장높은 고객에게 할당 ");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if (ch =='L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
