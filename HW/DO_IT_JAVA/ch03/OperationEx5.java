package com.heewon.ch03;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B10000101;  //5 를 이진수로 나타냄 (8비트)
		 
		System.out.println(num << 2);   //왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num >> 2);   //오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num >>> 2);  //오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num);
		
		num = num << 2;  //왼쪽으로 2비트 이동한 값을 다시 num애 대입
		System.out.println(num);
	}
}


//복합대입.
// 대입+ 연산자 : +=, -=, *=, /=, %= ...
// 쉬프트 복합: >>=, <<=, >>>=, 
// 논리비트 복합: &=, |=, ^=




 // 연산자 우선순위  중요
 //0. 일차식 ( ) [ ]
 //1. 단항연산자가 가장 높다. ! ++ -- + -				중요
 //2.  산술연산자 			% /  + -				중요
 //3. 비트이동   			<< >>
 //4. 관계연산자 			<  >   <=  >=  == !=    중요
 //5. 논리연산자 			& ^ | 비트 합차곱, && || 논리곱 논리합
 //6. 조건연산자 			? :
 //7. 대입연산자 			=  +=  -= *=  %=  /=