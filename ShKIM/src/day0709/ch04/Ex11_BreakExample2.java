package day0709.ch04;

public class Ex11_BreakExample2 {

	public static void main(String[] args) {
		
		// int형 변수 sum, num에 데이터 0 초기화
		int sum = 0;
		int num = 0;
		
		// for문
		// 초기화식: num = 0
		// 조건식: 생략
		// 증감식: num = num + 1
		for(num = 0; ; num++) {
			// sum = sum + num;
			sum += num;
			// sum >= 100 이 true인 경우. 즉, sum의 데이터가 100 이상인 경우 수행문 실헹
			if(sum >= 100)
				break;  // 반복문 for문을 종료한다.
		}
		
		// 변수 num, sum 의 데이터 출력
		System.out.println("num : " + num); // 14
		System.out.println("sum : " + sum); // 105
		
		/*
		 * break문
		 * 반복문에서 break문을 사용하면 그 지점에서 더 이상 수행문을 반복하지 않고 반복문을 빠져나온다
		 * 프로그램 실행 중에 반복문을 중단할 때 사용한다
		 * 반복문이 중접된 경우, break문을 사용하면 
		 * 모든 반복문을 빠져나오는 것이 아닌 break문을 감싸고 있는 반복문만 빠져나온다
		 */

	}

}
