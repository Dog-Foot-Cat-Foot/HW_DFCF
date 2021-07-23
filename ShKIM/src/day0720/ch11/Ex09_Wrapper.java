package day0720.ch11;

public class Ex09_Wrapper {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> Integer형 num1 변수 선언, Integer 인스턴스 생성 시 100을 데이터로 넘겨줌, 생성된 메위주 리턴
		// <2> int형 num2 변수 선언, 200 데이터 대입
		// <3> int형 sum 변수 선언, Integer형 num1 이 num1.intValue()로 변환(언박싱)되어 연산
		//	100 + 200 의 데이터 300 대입
		// <4> Integer형 num3 변수 선언, int형 num2 가 
		//	valueOf(num2)로 변환(오토박싱)되어 200 데이터를 넘겨받은 Integer 클래스의 메위주 리턴
		//------------------------------------------
		Integer num1 = new Integer(100);	// <1>
		int num2 = 200;						// <2>
		int sum = num1 + num2;				// <3>
		Integer num3 = num2;				// <4>
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		System.out.println(num3);
		
		
		/* =========================================
		 * Wrapper 클래스기본
		 * 기본 자료형처럼 사용할 수 있는 클래스
		 * 
		 * 오토박싱과 언박싱
		 * 오토박싱(autoboxing): 기본형을 객체형으로 바꾸는 것, int -> Integer
		 * 언박싱(unboxing): 객체형을 기본형으로 꺼내는 것, Integer -> int
		 * 자바5부터는 변환 없이 사용할 수 있으며 컴파일러가 변경하는 것이다.
		 * =========================================
		 */
		
	}

}
