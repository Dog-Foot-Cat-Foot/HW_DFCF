package day0720.ch09;

public class Ex04_Constant {

	// ------------------------------------------
	// <1> int형 변수 선언하여 10 데이터 초기화
	// <2> int형 final 변수 선언하여 100 데이터 초기화
	// ------------------------------------------
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		
		// ------------------------------------------
		// <1> Ex04_Constant형 변수 선언하여 생성한 인스턴스의 메위주 대입
		// <2> cons의 멤버 변수 num에 데이터 50 대입
		// <3> cons의 final 변수 NUM에 데이터 200 대입, 상수에 값을 대입하여 오류
		// The final field Ex04_Constant.NUM cannot be assigned
		// <4> num 데이터 출력
		// <5> NUM 데이터 출력
		// ------------------------------------------
		Ex04_Constant cons = new Ex04_Constant();	// <1>
		cons.num = 50;								// <2>
		// cons.NUM = 200;							// <3>
		
		System.out.println(cons.num);				// <4> 50
		System.out.println(cons.NUM);				// <5> 100
		
		
		/* ============================================
		 * 상수를 의미하는 final 변수
		 * 상수를 선언할 때는 일반 변수와 구별하기 위해 대문자로 쓰는 경우가 많다.
		 * 
		 * 재정의할 수 없는 final 메서드
		 * 
		 * 상속할 수 없는 final 클래스
		 * 보안과 관련이 있거나 기반 클래스가 변하면 안 되는 경우 클래스를 final로 선언한다
		 * 대표적으로 String 이나 Integer 클래스가 있다.
		 * ============================================
		 */

	}

}
