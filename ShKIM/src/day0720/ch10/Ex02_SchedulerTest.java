package day0720.ch10;

import java.io.IOException;

//------------------------------------------
// 문자를 입력받는 System.in.read()를 사용하려면 IOException에서 오류를 처리해야 한다.
//------------------------------------------
public class Ex02_SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		//------------------------------------------
		// <1> 할당 방식을 입력받아 ch 변수에 대입
		// <2> Scheduler형 변수 선언하여 null 초기화
		// <3> 입력받은 값이 R, r이면 RoundRobin 클래스 생성
		// <4> 입력받은 값이 L, l이면 LeastJob 클래스 생성
		// <5> 입력받은 값이 P, p이면 PriorityAllocation 클래스 생성
		// <6> 그 외의 문자를 입력한 경우
		//------------------------------------------
		int ch = System.in.read();					// <1>
		Scheduler scheduler = null;					// <2>
		
		if(ch == 'R' || ch == 'r') {				// <3>
			scheduler = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {			// <4>
			scheduler = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {			// <5>
			scheduler = new PriorityAllocation();
		} else {									// <6>
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		//------------------------------------------
		// 어떤 정책인가와 상관없이 인터페이스에 선언한 메서드 호출
		//------------------------------------------
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
