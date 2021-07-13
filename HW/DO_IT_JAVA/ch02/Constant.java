package com.heewon.ch02;

public class Constant {
	
	public static void main(String[] args) {
		
		
		 // 항상 변하지 않는 값을 상수 라고 한다. 
		 // final 예약어를 사용해서 선언. 상수 이름은 주로 대문자로!
		 //선언과 동시에 값을 지정하는 것이 좋다.
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;          //에러남. 상수로 위에 선언되어 있으므로.
	}
}
 // 상수로 선언 안하고 코딩했을시 값자체를 모두 바꿔 줘야 하지만,
 // 상수로 선언했으면 선언한 부분의 값만 고치면 된다.