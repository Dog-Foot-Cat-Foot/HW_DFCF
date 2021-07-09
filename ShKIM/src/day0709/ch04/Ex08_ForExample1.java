package day0709.ch04;

public class Ex08_ForExample1 {

	public static void main(String[] args) {

		// int형 변수 i, sum 선언
		int i;
		int sum;

		// for문
		// 초기화식: 변수 i에 데이터 1 대입, 변수 sum에 데이터 0 대입
		// 조건식: i <= 10 이 true인 경우 반복 수행, 11 <= 10 인 경우 수행 종료
		// 증감식: i++, 수행문 실행 후 i = i+1 문장 실행
		for (i = 1, sum = 0; i <= 10; i++) {
			sum += i;  // sum = sum + i;
		}
		
		// sum 데이터 출력
		System.out.println("1부터 10까지의 합은 " + sum + "입니다."); // 55
		
		/*
		 * for문
		 * for(초기화식; 조건식; 증감식){ 수행문; }
		 * 초기화식: for문이 시작할 때 딱 한 번만 수행
		 * 조건식: 언제까지 반복 수행할 것인지 구현, true인 경우 반복 수행, false인 경우 for문 수행 종료
		 * 증감식: 반복 횟수나 for문에서 사용하는 변수 값을 1만큼 늘리거나 줄임
		 * 초기화식, 조건식, 증감식은 생략 가능
		 */

	}

}
