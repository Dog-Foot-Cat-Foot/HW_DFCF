package com.heewon.ch02;

public class TypeInference {
	
	public static void main(String[] args) {
		
		int i = 10; 
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열 대입가능
		
		//str = 3; 오류남. string으로 먼저 사용되었기 때문.
	}
}
