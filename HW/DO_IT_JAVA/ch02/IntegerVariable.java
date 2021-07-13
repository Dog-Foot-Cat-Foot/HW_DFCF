package com.heewon.ch02;

public class IntegerVariable {

	public static void main(String[] args) {

	short sVal = 10; // 2바이트로 정수를 표현하는 자료형. 유효범위  -2의15승 ~ 2의15승-1 
	byte bVal = 20; // 1바이트는 8비트. 바이트 단위의 정보를 저장할때 주로 사용. -128~ 127
	 System.out.println(sVal + bVal);
		// 정수값 연산시 4바이트 기본단위.  정수는 모두 int형으로 내부적으로 변환된뒤 결과값이 나온다.
	}

}
