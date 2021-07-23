package day0720.ch11;

public class Ex08_StringBuilderTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형 javaStr 변수 선언, String 클래스의 value 변수에 "Java" 저장하여 메위주 리턴
		// <2> javaStr 변수의 실제 인스턴스 주소 출력, 815992954
		// <3> StringBuilder형 buffer 변수 선언, 
		//	StringBuilder 인스턴스 생성하며 javaStr의 데이터 "Java" 저장하여 메위주 리턴
		// <4> buffer 변수의 실제 인스턴스 주소 출력, 868737467
		//------------------------------------------
		String javaStr = new String("Java");				// <1>
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));		// <2>
		
		StringBuilder buffer = new StringBuilder(javaStr);	// <3>
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));	// <4>
		
		//------------------------------------------
		// <1> buffer 변수로 append() 메서드 호출하여 " and" 데이터 추가
		// <2> buffer 변수로 append() 메서드 호출하여 " android" 데이터 추가
		// <3> buffer 변수로 append() 메서드 호출하여 " programming is fun!!!" 데이터 추가
		// <4> buffer 변수의 실제 인스턴스 주소 출력, 868737467
		//	append() 메서드가 실행될 때마다 메모리가 새로 생성되는 것이 아닌 하나의 메모리에 계속 연결됨
		//------------------------------------------
		buffer.append(" and");								// <1>
		buffer.append(" android");							// <2>
		buffer.append(" programming is fun!!!");			// <3>
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));	// <4>
		
		//------------------------------------------
		// <1> javaStr 변수에 buffer 변수로 toString() 메서드 호출하여 String 클래스로 반환
		// <2> javaStr의 데이터 출력, Java and android programming is fun!!!
		// <3> javaStr 변수의 실제 인스턴스 주소 출력, 55331187
		//------------------------------------------
		javaStr = buffer.toString();						// <1>
		System.out.println(javaStr);						// <2>
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));	// <3>

		
		/* =========================================
		 * StringBuffer, StringBuilder 클래스
		 * 내부에 변경 가능한 char[]를 변수로 가지고 있다.
		 * 문자열을 연결하면 기존에 사용하던 char[] 배열이 확장되므로 추가 메모리를 사용하지 않는다.
		 * StringBuffer 클래스: 문자열이 안전하게 변경되도록 보장됨. 멀티스레드 프로그램인 경우 사용.
		 * StringBuilder 클래스: 문자열이 안전하게 변경되도록 보장되지 않음. 실행 속도가 좀 더 빠름.
		 * =========================================
		 */
	}

}
