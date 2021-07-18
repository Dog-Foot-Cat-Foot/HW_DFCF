package day0720.ch10;

// ------------------------------------------
// Calc 인터페이스를 구현한 Calculator 추상 클래스 선언
// ------------------------------------------
public abstract class Calculator implements Calc {
	
	// ------------------------------------------
	// 추상 메서드 구현
	// ------------------------------------------
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	
	/* =========================================
	 * implements 예약어
	 * 인터페이스에서는 선언한 기능을 클래스가 구현할 때 사용하는 예약어이다.
	 * =========================================
	 */
	
}
