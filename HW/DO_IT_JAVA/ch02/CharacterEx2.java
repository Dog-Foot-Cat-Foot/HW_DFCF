package com.heewon.ch02;

public class CharacterEx2 {

	public static void main(String[] args) {

		char ch1 = '한'; // 문자는 싱글쿼트, 문자열은 더블쿼트
		char ch2 = '\uD55C'; // 유니코드값을 직접사용할 수도 있다. 16진수로 나타냄.
				 //유니코드의 Escape Sequence 형식
		 //유니코드의 리터럴 형태로 쓴 것.
		
		System.out.println(ch1);
		System.out.println(ch2);
	
		
		char ch3 = '글';
		char ch4 = '\uAE00';
		System.out.println(ch3);
		System.out.println((char)ch4);
		System.out.println("\uAE00:" + ch3);
		System.out.println("\\uAE00:" + ch4);   
		//역슬래시 두번을 연속으로 치면 역슬래시 뒤에 문자열을 해석하여 출력이 아니라 문자열 그대로 출력한다!
		
		
	}

}
