package day0709.ch04;

public class Ex07_DoWhileExample {

	public static void main(String[] args) {
		
		// int형 변수 num, sum 에 각각 1, 0 데이터 초기화
		int num = 1;
		int sum = 0;
		
		// do-while문은 1회 무조건 수행
		do {
			// sum = sum + num;
			sum += num;
			// num = num + 1;
			num++;
		} while(num <= 10);  
		// num <= 10 이 true인 경우 반복 수행
		// 11 <= 10 인 경우 false
		
		// sum의 데이터 출력
		System.out.println("1부터 10까지의 합은 " + sum + "입니다."); // 55

		/*
		 * do-while문
		 * do { 수행문1; } while(조건식);
		 * 블록 안의 문장을 무조건 한 번 수행한 후에 조건식을 검사함
		 * 한 번 수행한 후 조건식이 true인 경우 반복 수행, false인 경우 반복 수행 종료
		 * 수행문을 반드시 한 번 이상 수행해야 하는 경우에 적합
		 */
		
	}

}
