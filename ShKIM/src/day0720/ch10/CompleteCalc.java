package day0720.ch10;

// ------------------------------------------
// Calculator 추상 클래스를 상속 받는 CompleteCalc 클래스 선언
// ------------------------------------------
public class CompleteCalc extends Calculator {

	// ------------------------------------------
	// 추상 메서드 구현
	// ------------------------------------------
	@Override
	public int times(int num1, int num2) {
		return num1 + num2;
	}
	
	// ------------------------------------------
	// <1> num2 가 0 이 아니면 num1/num2 데이터 리턴
	// <2> num2 가 0 이면 오류 리턴
	// ------------------------------------------
	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;		// <1>
		} else {	
			return Calc.ERROR;		// <2>
		}
	}
	
	// ------------------------------------------
	// CompleteCalc에서 추가로 구현한 메서드
	// ------------------------------------------
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였다.");
	}
	
	// ------------------------------------------
	// 디폴트 메서드 재정의하기
	// 하위 클래스에서 디폴트 메서드를 재정의할 수 있다.
	// ------------------------------------------
	@Override
	public void description() {
		super.description();
	}
	
}
