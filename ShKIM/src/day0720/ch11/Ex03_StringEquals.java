package day0720.ch11;

public class Ex03_StringEquals {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형 변수 str1 선언하여 String 객체의 메위주를 대입
		// <2> String형 변수 str2 선언하여 String 객체의 메위주를 대입
		// <3> str1과 str2의 메모리 위치 주소 비교하여 출력, false
		// <4> str1과 str2의 equals() 호출하여 같은 문자열인지 비교하여 출력, true
		//------------------------------------------
		String str1 = new String("abc");		// <1>
		String str2 = new String("abc");		// <2>
		
		System.out.println(str1 == str2);		// <3>
		System.out.println(str1.equals(str2));	// <4>
		
		//------------------------------------------
		// <1> Integer형 변수 i1 선언하여 Integer 객체의 메위주 대입 
		// <2> Integer형 변수 i2 선언하여 Integer 객체의 메위주 대입 
		// <3> i1과 i2의 메모리 위치 주소 비교하여 출력, false
		// <4> i1과 i2의 equals() 호출하여 같은 문자열인지 비교하여 출력, true
		//------------------------------------------
		Integer i1 = new Integer(100);			// <1>
		Integer i2 = new Integer(100);			// <2>
		
		System.out.println(i1 == i2);			// <3>
		System.out.println(i1.equals(i2));		// <4>
		
	}

}
