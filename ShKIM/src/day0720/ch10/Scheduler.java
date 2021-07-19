package day0720.ch10;

//------------------------------------------
// Scheduler 인터페이스 선언
//------------------------------------------
public interface Scheduler {
	
	//------------------------------------------
	// 추상 메서드 선언
	//------------------------------------------
	public void getNextCall();
	public void sendCallToAgent();
	
}
