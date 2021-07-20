package day0720.ch11;

public class Ex06_StringTest1 {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형 변수 str1 선언하여 String 인스턴스의 메위주 대입
		// <2> String형 변수 str2 선언하여 String 인스턴스의 메위주 대입
		// <3> str1과 strt2의 메모리 위치 주소 비교하여 출력, false 
		// <4> str1과 str2의 문자열 비교하여 출력, true
		//------------------------------------------
		String str1 = new String("abc");		// <1>
		String str2 = new String("abc");		// <2>
		
		System.out.println(str1 == str2);		// <3>
		System.out.println(str1.equals(str2));	// <4>
		
		//------------------------------------------
		// <1> String형 변수 str3 선언하여 "abc" 대입
		// <2> String형 변수 str4 선언하여 "abc" 대입
		// <3> str3와 str4의 메모리 위치 주소 비교하여 출력, true
		// <4> str3와 str3의 문자열 비교하여 출력, true
		//------------------------------------------
		String str3 = "abc";					// <1>
		String str4 = "abc";					// <2>
		
		System.out.println(str3 == str4);		// <3>
		System.out.println(str3.equals(str4));	// <4>

	}

}
