package day0720.ch10;

public class Ex01_CalculatorTest {

	public static void main(String[] args) {
		
		// ------------------------------------------
		// <1> int형 변수 선언과 동시에 10 초기화
		// <2> int형 변수 선언과 동시에 5 초기화
		// <3> CompleteCalc형 변수 선언과 동시에 생성한 CompleteCalc 인스턴스의 메위주 대입
		// ------------------------------------------
		int num1 = 10;		// <1>
		int num2 = 5;		// <2>
		
		CompleteCalc calc = new CompleteCalc();
		
		// ------------------------------------------
		// <1> 15
		// <2> 5
		// <3> 15
		// <4> 2
		// <5> Calc 인터페이스를 구현하였다.
		// <6> 디폴트 메서드 호출, 정수 계산기를 구현한다.
		// ------------------------------------------
		System.out.println(calc.add(num1, num2));		// <1>
		System.out.println(calc.substract(num1, num2));	// <2>
		System.out.println(calc.times(num1, num2));		// <3>
		System.out.println(calc.divide(num1, num2));	// <4>
		calc.showInfo();								// <5>
		calc.description();								// <6>
		
		// ------------------------------------------
		// Calc 인터페이스형 변수 선언과 동시에 생성한 CompleteCalc 인스턴스의 메위주 대입
		// ------------------------------------------
		Calc calc2 = new CompleteCalc();
		
		// ------------------------------------------
		// <1> int형 배열 선언과 동시에 데이터 대입
		// <2> 인터페이스 이름으로 직접 참조하여 정적 메서드 호출, 15
		// ------------------------------------------
		int[] arr = {1, 2, 3, 4, 5};					// <1>
		System.out.println(Calc.total(arr));			// <2>
		
		
		/* ==========================================
		 * 인터페이스를 구현한 클래스가 있을 때 
		 * 그 클래스는 해당 인터페이스형으로 묵시적 형 변환이 이루어지며,
		 * 형 변환되었을 때 사용할 수 있는 메서드는 인터페이스에서 선언한 메서드뿐이다.
		 * 
		 * 정적 메서드
		 * 정적 메서드를 사용할 때는 인터페이스 이름으로 직접 참조하여 사용한다.
		 * ==========================================
		 */
		
		
	}

}
