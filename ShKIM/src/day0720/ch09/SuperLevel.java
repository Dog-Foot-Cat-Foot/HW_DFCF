package day0720.ch09;

//------------------------------------------
//PlayerLevel 추상 클래스를 상속받는 SuperLevel 클래스 선언
//------------------------------------------
public class SuperLevel extends PlayerLevel {

	// ------------------------------------------
	// 추상 메서드 구현
	// ------------------------------------------
	@Override
	public void run() {
		System.out.println("엄청 빨리 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 Jump!");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 Turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== 고인물 등장 ===");
	}

}
