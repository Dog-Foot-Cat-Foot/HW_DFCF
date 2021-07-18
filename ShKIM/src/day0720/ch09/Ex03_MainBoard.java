package day0720.ch09;

public class Ex03_MainBoard {

	public static void main(String[] args) {

		// ------------------------------------------
		// <1> Player형 player 선언하여 생성한 Player 인스턴스의 메위주 대입
		// <2> Player인스턴스의 play() 메서드 호출
		// === 뉴비 등장 ===
		// 천천히 달린다.
		// Jump할지 모르는데
		// Turn할지 모르는데
		// ------------------------------------------
		Player player = new Player();	// <1>
		player.play(1);					// <2>

		// ------------------------------------------
		// <1> AdvancedLevel형 player 선언하여 생성한 AdvancedLevel 인스턴스의 메위주 대입
		// <2> upgradeLevel() 메서드 호출
		// <3> AdvancedLevel인스턴스의 play() 메서드 호출
		// === 모험가 등장 ===
		// 빨리 달린다.
		// 높이 Jump!
		// 높이 Jump!
		// Turn할지 모르는데
		// ------------------------------------------
		AdvancedLevel aLevel = new AdvancedLevel();	// <1>
		player.upgradeLevel(aLevel);				// <2>
		player.play(2);								// <3>

		// ------------------------------------------
		// <1> SuperLevel형 player 선언하여 생성한 SuperLevel 인스턴스의 메위주 대입
		// <2> upgradeLevel() 메서드 호출
		// <3> SuperLevel인스턴스의 play() 메서드 호출
		// === 고인물 등장 ===
		// 엄청 빨리 달린다.
		// 매우 높이 Jump!
		// 매우 높이 Jump!
		// 매우 높이 Jump!
		// 한 바퀴 Turn
		// ------------------------------------------		
		SuperLevel sLevel = new SuperLevel();		// <1>
		player.upgradeLevel(sLevel);				// <2>
		player.play(3);								// <3>

	}

}
