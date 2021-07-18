package day0720.ch09;

public abstract class PlayerLevel {
	
	//------------------------------------------
	// 추상 메서드 선언
	//------------------------------------------
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//------------------------------------------
	// 재정의 하면 안되므로 final로 선언 (템플릿 메서드)
	// run() -> count만큼 jump() -> turn()
	//------------------------------------------
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

}
