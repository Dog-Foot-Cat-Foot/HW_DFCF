package com.heewon.ch03;

public class OperationEx3 {

	public static void main(String[] args) {

		// 관계연산자(> < >= <= == +=)는 대입연산자(=)보다 우선순위가 높다.
		// 따라서 괄호가 따로 없어도 됨.
		
		
		// 논리연산자는  
		// && 논리곱 - 둘다 참이어야 참
		// || 논리합 - 둘 중 하나만 참이면 참.
		// ! 부정, 단항 연산자 - 참은 거짓으로, 거짓은 참으로.
		
		
		 // 삼항연산자: 조건? 참값: 거짓값
		 // 조건식: 대소비교 <,>,  동등비교 <=,>= ...
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10); // 둘다 참이어야 실행
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) > 10) || ( ( i = i + 2 ) < 10); // 둘 중 하나라도 참이면 참.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		 // 앞의 내용이 참이면 뒤의 것은 실행조차 되지 않는다! 값을 출력해보면 i가 증가조차 하지 않음.
		
		// 단락 회로 평가에 유의!
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(0 == b);
		System.out.println(-1 == a);
		System.out.println("------------------------------");
		
		
		
		//객체의 대등연산자 처리.
		System.out.println(" 홍: " + System.identityHashCode("홍"));
		System.out.println(" 홍 == 홍 " + ( "홍" == "홍"));
		
		System.out.println("------------------------------");
		
			
		boolean b1 = (a > b);
		System.out.println( b1 );
		
		System.out.println(  (5>3) && (5>2));
		System.out.println(  (5>3) || (5>2));
		System.out.println(  !(5>3) );
		
		
		//참고
		boolean x = true;
		boolean x1 = true;
		//	System.out.println(x+x1); //불리언은 수치형태를 갖지 못하므로 안됨.
		
		
		
		System.out.println("------------------------------");

		
		int num2 = 10;
		int num3 = 20;
		
		boolean flag = (num2>0) && (num3 > 0);
		System.out.println(flag);
		
		flag = (num2 < 0) || (num3 > 0);
		System.out.println(flag);
		
		
		// 복합대입 연산자 
		
		// += 
		
		
		
		
		
		
		
		
		 System.out.println("============= 산술연산자 =============");
			System.out.println("+ " + (3+3) );
			System.out.println("+ " + 3+3 ); //묶지 않으면 문자화 되어버린다. 33이 되어버림.
			System.out.println("* " + (3*3) );
			System.out.println("/ " + (3/3) );
		//  System.out.println("/ " + (3/0) ); // 0으로 나눌 수 없음. 오류
			System.out.println("/ " + (0/3) );
			System.out.println("% " + (92%3) );
			
		
		
		
		
		
		
		
		
		
	}

}
