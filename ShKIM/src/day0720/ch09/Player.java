package day0720.ch09;

public class Player {
	
	//------------------------------------------
	// PlayerLevel형 멤버 변수 선언
	//------------------------------------------
	private PlayerLevel level;
	
	//------------------------------------------
	// 디폴트 생성자
	// <1> level 변수에 BeginnerLevel 객체 메위주 대입
	// <2> showLevelMessage() 메서드 호출
	// 처음 생성되면 BeginnerLevel로 시작하며 레벨 메시지 출력
	//------------------------------------------
	public Player() {
		level = new BeginnerLevel();	// <1>
		level.showLevelMessage();		// <2>
	}

	//------------------------------------------
	// get() 메서드 선언
	//------------------------------------------
	public PlayerLevel getLevel() {
		return level;
	}
	
	//------------------------------------------
	// <1> 매개변수로 받은 PlayerLevel형 데이터를 level에 대입
	// <2> showLevelMessage() 메서드 호출
	// 레벨 변경 메서드, 현재 자신의 level을 
	// 매개변수로 받은 level로 변경하고 레벨 메시지 출력
	//------------------------------------------
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;				// <1>
		level.showLevelMessage();		// <2>
	}
	
	//------------------------------------------
	// 매개변수로 받은 int형 데이터를 
	// PlayerLevel의 go() 메서드에 매개변수로 전달하며 메서드 호출
	//------------------------------------------
	public void play(int count) {
		level.go(count);
	}
	
}
