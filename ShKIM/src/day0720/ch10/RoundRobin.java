package day0720.ch10;

//------------------------------------------
// Scheduler 인터페이스를 구현한 RoundRobin 클래스 선언
// 상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
//------------------------------------------
public class RoundRobin implements Scheduler {
	
	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져온다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분한다.");
	}
	
}
