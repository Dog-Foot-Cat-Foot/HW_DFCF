package com.heewon.ch02;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F; // float형으로 대입되는 값에는 더블형과 구분을 위해 식별자 F를 써준다.
		
		System.out.println(dnum);
		System.out.println(fnum);
	}
}

 // float 형은 부호비트 1, 지수부 8비트 , 가수부 23비트 (숫자값)
// double형은 부호비트 1, 지수부 11비트, 가수부 52비트 
 // 자바에서 실수는 더블형이 기본이다! 플롯형에 비해 더 정밀하게 더블형이 표현가능.


