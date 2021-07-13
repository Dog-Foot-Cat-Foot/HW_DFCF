package day0713.ch03;

public class Ex02_OperationEx2 {

	public static void main(String[] args) {
		
		//--------------------------------------------------
		// <1> int형 변수 gameScore 를 데이터 150 초기화
		// <2> int형 변수 lastScore1 선언과 동시에
		// gameScore 데이터 1 증가, gameScore = 151
		// gameScore 데이터 151 대입
		//--------------------------------------------------
		int gameScore = 150;			// <1> 		
		int lastScore1 = ++gameScore;	// <2>
		
		System.out.println(lastScore1); // 출력: 151
		System.out.println(gameScore);  // 출력: 151
		
		//--------------------------------------------------
		// int형 변수 lastScore2 선언과 동시에
		// gameScore 데이터 1 감소, gameScore = 150
		// gameScore 데이터 150 대입
		//--------------------------------------------------
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); // 출력: 150
		System.out.println(gameScore);  // 출력: 150
		
		// ===== 위치 변경 (변수명 뒤에 증가/감소 연산자가 나오는 경우) =========
		
		//--------------------------------------------------
		// int형 변수 lastScore3 에
		// gameScore 데이터 150 대입하여 ; 으로 문장이 끝난 후
		// gameScore 데이터 1 증가, gameScore = 151
		//--------------------------------------------------
		int lastScore3 = gameScore++;
		System.out.println(lastScore3);  // 출력: 150
		System.out.println(gameScore);   // 출력: 151
		
		//--------------------------------------------------
		// int형 변수 lastScore4 에
		// gameScore 데이터 151 대입하여 ; 으로 문장이 끝난 후
		// gameScore 데이터 1 감소, gameScore = 150
		//--------------------------------------------------
		int lastScore4 = gameScore--;
		System.out.println(lastScore4); // 출력: 151
		System.out.println(gameScore);  // 출력: 150
		
		/* ==================================================
		 * 증가/감소 연산자는 위치에 절대 유의해야함!!
		 * 변수명 앞에 나오면 ; 문장이 끝나기 전에 증가/감소 연산
		 * 변수명 뒤에 나오면 ; 문장이 끝난 후 증가/감소 연산
	 	 * +) 자바에서는 문장 끝에 ;(세미 콜론)을 사용한다
	 	 * ==================================================
		 */
		
		//--------------------------------------------------
		// 번외 문제
		//--------------------------------------------------
		
		//--------------------------------------------------
		// <1> --x 감소 연산, x = 9
		// 9 + 5 + 9 = 14 + 9 = 23 y는 23 대입, 문장 끝
		// x-- 감소 연산, x = 8
		//--------------------------------------------------
		int x = 10;
		int y = x-- + 5 + --x; // <1>
		
		System.out.println(x); // 8
		System.out.println(y); // 23
		
	}

}
