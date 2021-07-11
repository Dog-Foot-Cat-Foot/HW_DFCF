package day0713.ch04;

public class Ex09_NestedLoop {

	public static void main(String[] args) {
		
		// int형 변수 dan, times 선언
		int dan;
		int times;
		
		// 2단부터 9단까지 반복하는 외부 반복문
		// dan 변수를 데이터 2로 초기화
		// dan <= 9, 10 <= 9 인 경우 반복 수행 종료
		// dan = dan + 1
		for(dan = 2; dan <= 9; dan++) {
			// 각 단에서 1~9를 반복하는 내부 반복문
			// times 변수를 데이터 1로 초기화
			// times <= 9, 10 <= 9 인 경우 반복 수행 종료
			// times = times + 1
			for(times = 1; times <= 9; times++) {
				// dan, times, dan*times의 데이터 출력
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			// 내부 반복문 수행 종료 후 실행됨, 한 줄 개행
			System.out.println();
		}
		
		/*
		 * 중첩된 반복문
		 * 어떤 반복문을 먼저 수행해야 하는지 확인
		 * 내부 반복문을 수행하기 전에 초기화해야 할 값을 잘 초기화했는지 확인
		 */

	}

}
