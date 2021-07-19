package day0720.ch10;

//------------------------------------------
// Scheduler 인터페이스를 구현한 PriorityAllocation 클래스 선언
// 고객 등급이 높은 고객의 전화부터 대기열에서 가져와 업무 능력이 높은 상담원 우선 배분
//------------------------------------------
public class PriorityAllocation implements Scheduler {
	
	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져온다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분한다.");
	}

}
