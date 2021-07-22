package chapter_03;

public class practice_89p {

	public static void main(String[] args) {
		// 연습문제
		
		//Q2 
		int num;
		num = -5 + 3 * 10 / 2;   // 연산자 우선 순위 기억 !
		System.out.println(num);
		
		//Q3
		int num1 = 10;
		System.out.println(num1); // 10 
		System.out.println(num++); // 10먼저 집어넣고 +1 num1 = 11 
		System.out.println(num); // 11 
		System.out.println(--num); // num1 값에서 -1 후 대입 
		
		//Q4
		int num2 = 10;
		int num3 = 20;
		boolean result;
		
		result = ((num2>10) && (num3>10)); 
		// num2 false  num3 true &&는 두 조건식이 모두 true가나와야 결과 값 참을 리
		System.out.println(result);
		
		result = ((num2>10) || (num3>10));
		// || 두 조건식중에 하나만 참이여도 참을 리
		System.out.println(result);
		System.out.println(!result);
		
		//Q6
		int num4 = 8;
		
		System.out.println(num4 += 10); // num4 = num4 + 10 이랑 같은 뜻 
		System.out.println(num4 -= 10); // num4 = num4 - 10 이랑 같은 뜻 
		
		//Q7
		int num5 = 10;
		int num6 = 20;
		
		int result5 = (num5 >= 10) ? num6 + 10 : num6 - 10; 
		// 조건식이 참인 경우 num6 + 10 결과값 출력 false인 경우 num6 - 10 결과값 출
		System.out.println(result5); // 30 
		
		
		

	}

}
