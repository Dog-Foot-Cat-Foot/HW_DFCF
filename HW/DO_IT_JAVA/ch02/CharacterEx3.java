package com.heewon.ch02;

public class CharacterEx3 {

	public static void main(String[] args) {

		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66; 에러남, char형은 음수값을 표현할 수 없다.  
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println((char)a2);
		
		
		// 자바는 유니코드 표현 인코딩방법 UTF-8, UTF-16 두 가지 있음.
		 // UTF-8이 메모리 낭비가 적고 전송속도가 빠르며, 인터넷에서 많이 사용
		
	}

}
