package day0720.ch11;

public class Ex07_StringTest2 {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형 변수 선언, String 클래스의 value 변수에 "abc" 저장하여 메위주 리턴
		// <2> String형 변수 선언, String 클래스의 value 변수에 "android" 저장하여 메위주 리턴
		// <3> javaStr 변수의 데이터 출력, java
		// <4> javaStr의 실제 인스턴스 주소 출력, 815992954
		// <5> javaStr 문자열과 androidStr 문자열을 연결하여 javaStr에 대입
		//		문자열 변경이 아닌 두 문자열이 연결된 새로운 문자열 생성
		// <6> javaStr 변수의 데이터 출력, javaandroid
		// <7> javaStr의 실제 인스턴스 주소 출력, 868737467
		//------------------------------------------
		String javaStr = new String("java");			// <1>
		String androidStr = new String("android");		// <2>
		System.out.println(javaStr);					// <3>
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));	// <4>
		
		javaStr = javaStr.concat(androidStr);			// <5>
		
		System.out.println(javaStr);					// <6>
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr)); // <7>
		
		/* =========================================
		 * String 클래스의 value 변수는 final로 선언되어 있다
		 * final은 문자열을 변경할 수 없다는 뜻이다.
		 * 문자열은 불변(immutable)한다
		 * =========================================
		 */

	}

}
