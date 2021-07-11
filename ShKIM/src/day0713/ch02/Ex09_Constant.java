package day0713.ch02;

public class Ex09_Constant {

	public static void main(String[] args) {
		
		// final 예약어를 사용하여 int형 MAX_NUM 상수 선언과 동시에 데이터 100 대입(초기화)
		// 상수(constant)란 항상 변하지 않는 값을 말한다
		// 상수 이름은 대문자를 주로 사용한다.
		final int MAX_NUM = 100;
		// final 예약어를 사용하여 int형 MIN_NUM 상수 선언
		final int MIN_NUM;
		
		// MIN_NUM 상수에 데이터 0 대입
		// 사용하기 전에 초기화해야 한다. 초기화하지 않으면 오류 발생~
		MIN_NUM = 0;
		
		// 상수 MAX_NUM, MIN_NUM의 데이터 출력
		System.out.println(MAX_NUM); // 출력: 100
		System.out.println(MIN_NUM); // 출력: 0
		
		// 상수는 한 번 대입한 값을 변경할 수 없으므로 오류!
		// MAX_NUM = 1000;
	}

}