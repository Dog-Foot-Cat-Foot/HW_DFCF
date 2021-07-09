package day0709.ch03;

public class Ex04_OperationEx4 {

	public static void main(String[] args) {
		
		// int형 변수 fatherAge 에 데이터 45 초기화, int형 변수 motherAge 에 데이터 47 초기화
		int fatherAge = 45;
		int motherAge = 47;
		
		// char형 변수 ch 선언
		char ch;
		// 변수 ch에 
		// fatherAge > motherAge 관계 연산, 45 > 47, false 리턴
		// false 가 리턴되어 'F' 선택됨
		// 'F' 데이터가 변수 ch에 대입됨, ch = 'F';
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch); // F
		
		/*
		 * 조건 연산자 (= 삼항 연산자)
		 * 연산자 : 조건식 ? 결과1 : 결과2;
		 * 기능 : 조건식이 true이면 결과1, false이면 결과2 가 선택됨
		 */

	}

}
