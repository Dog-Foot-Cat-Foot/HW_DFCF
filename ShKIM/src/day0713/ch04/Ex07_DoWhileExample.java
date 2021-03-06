package day0713.ch04;

public class Ex07_DoWhileExample {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// <1> int형 변수 num 1 데이터 초기화
		// <2> int형 변수 sum 에 0 데이터 초기화
		//---------------------------------------------------
		int num = 1;	// <1>
		int sum = 0;	// <2>
		
		//---------------------------------------------------
		// do-while문은 1회 무조건 수행
		// num <= 10 이 true인 경우 반복 수행
		// 11 <= 10 인 경우 false
		//---------------------------------------------------
		do {
			sum += num;
			num++;
		} while(num <= 10);  
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다."); // 55

		
		/* ====================================================
		 * do-while문
		 * do { 수행문1; } while(조건식);
		 * 블록 안의 문장을 무조건 한 번 수행한 후에 조건식을 검사함
		 * 한 번 수행한 후 조건식이 true인 경우 반복 수행, false인 경우 반복 수행 종료
		 * 수행문을 반드시 한 번 이상 수행해야 하는 경우에 적합
		 * ====================================================
		 */
		
	}

}
