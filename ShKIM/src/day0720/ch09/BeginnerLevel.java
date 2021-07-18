package day0720.ch09;

//------------------------------------------
// PlayerLevel 추상 클래스를 상속받는 BeginnerLevel 클래스 선언
//------------------------------------------
public class BeginnerLevel extends PlayerLevel {
	
	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void run() {
		System.out.println("천천히 달린다.");
	}
	
	@Override
	public void jump() {
		System.out.println("Jump할지 모르는데");
	}
	
	@Override
	public void turn() {
		System.out.println("Turn할지 모르는데");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("=== 뉴비 등장 ===");
	}

}
