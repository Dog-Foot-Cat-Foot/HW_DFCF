package day0713.ch03;

public class Ex01_OperationEx1 {

	public static void main(String[] args) {
		
		//--------------------------------------------------
		// <1> int형 변수 mathScore 를 데이터 90으로 초기화
		// <2> int형 변수 engScore 를 데이터 70으로 초기화
		//--------------------------------------------------
		int mathScore = 90;		// <1>
		int engScore = 70;		// <2>
		
		//--------------------------------------------------
		// int형 변수 totalScore 선언과 동시에 
		// matchScore 데이터, engScore 데이터 더한 값
		// (int)90 + (int)70 = (int)160
		// 데이터 (int)160 대입함
		//--------------------------------------------------
		int totalScore = mathScore + engScore;
		System.out.println(totalScore); // 출력: 160
		
		//--------------------------------------------------
		// double형 변수 avgScore 선언과 동시에
		// totalScore의 데이터 (int)160 을 (double)2.0으로 나눔
		// 형변환: (double)160.0 / (double)2.0 = (double)80.0
		// 데이터 (double)80.0 대입
		//--------------------------------------------------
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore); // 출력: 80.0
		
		/*
		 * 산술 연산자
		 */

	}

}
