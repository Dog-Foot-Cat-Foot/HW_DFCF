package day0720.ch10;

//------------------------------------------
// Scheduler 인터페이스를 구현한 LeastJob 클래스 선언
// 현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
//------------------------------------------
public class LeastJob implements Scheduler {
	
	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져온다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당한다.");
	}

}
