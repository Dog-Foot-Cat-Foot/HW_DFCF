package day0720.ch09;

//------------------------------------------
//PlayerLevel 추상 클래스를 상속받는 AdvancedLevel 클래스 선언
//------------------------------------------
public class AdvancedLevel extends PlayerLevel {

	// ------------------------------------------
	// 추상 메서드 구현
	// ------------------------------------------
	@Override
	public void run() {
		System.out.println("빨리 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump!");
	}

	@Override
	public void turn() {
		System.out.println("Turn할지 모르는데");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== 모험가 등장 ===");
	}

}
