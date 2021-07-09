package day0709.ch04;

public class Ex10_ContinueExample {

	public static void main(String[] args) {
		
		// int형 변수 total 에 데이터 0 대입
		int total = 0;
		// int형 변수 num 선언
		int num;
		
		// for문 
		// 초기화식: num = 1
		// 조건식: num <= 100 이 true인 경우 반복 수행, num = 101이면 수행 종료
		// 증감식: num = num + 1
		for(num = 1; num <= 100; num++) {
			// 조건식 num % 2 == 0 이 true 인 경우 수행문 실행
			// 즉, num의 데이터가 짝수인 경우에만 수행문 실행됨
			if(num % 2 == 0) 
				continue;   // 이 후 문장을 실행하지 않고 for문의 증감식 실행
			total += num;	// total = total + num; num의 데이터가 홀수인 경우 실행됨
		}
		
		// total 데이터 출력
		System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다."); // 2500
		
		/*
		 * continue문
		 * 반복문과 함께 쓰이며, 반복문 안에서 continue문을 만나면 이후의 문장을 수행하지 않고
		 * for문의 처음으로 돌아가 증감식을 수행함
		 * 반복문 수행 시 특정 조건에서는 수행하지 않고 건너뛰어야 할 때 사용한다
		 */
		
	}

}
