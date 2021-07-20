package day0720.ch11;

public class Ex04_HashCodeTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형 변수 str1 선언하여 String 객체의 메위주를 대입
		// <2> String형 변수 str2 선언하여 String 객체의 메위주를 대입
		// <3> abc 문자열의 해시 코드 값 출력, 96354
		// <4> abc 문자열의 해시 코드 값 출력, 96354
		//------------------------------------------
		String str1 = new String("abc");		// <1>
		String str2 = new String("abc");		// <2>
	
		System.out.println(str1.hashCode());	// <3>
		System.out.println(str2.hashCode());	// <4>
		
		//------------------------------------------
		// <1> Integer형 변수 i1 선언하여 Integer 객체의 메위주를 대입
		// <2> Integer형 변수 i2 선언하여 Integer 객체의 메위주를 대입
		// <3> Integer(100)의 해시 코드 값 출력, 100
		// <4> Integer(100)의 해시 코드 값 출력, 100
		//------------------------------------------
		Integer i1 = new Integer(100);			// <1>
		Integer i2 = new Integer(100);			// <2>
		
		System.out.println(i1.hashCode());		// <3>
		System.out.println(i2.hashCode());		// <4>
		
	}

}
