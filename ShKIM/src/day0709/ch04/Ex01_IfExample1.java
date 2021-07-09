package day0709.ch04;

public class Ex01_IfExample1 {

	public static void main(String[] args) {
		
		// int형 변수 age에 데이터 7 초기화
		int age = 7;
		
		// 조건식 age >= 8 의 리턴값이 true 인 경우 if문 블록 안의 문장을 실행
		// false 인 경우 else문 블록 안의 문장을 실행
		// age >= 8, 7 >= 8의 리턴값은 false 이므로 else문 블록 안의 문장이 실행된다
		if(age >= 8) {
			System.out.println("학교에 다닌다.");
		} else {
			System.out.println("학교에 다니지 않는다.");
		}
		
		/*
		 * if-else 문
		 * 주어진 조건식이 true 인 경우 if문 블록 안의 문장을 실행하고
		 * false 인 경우 else문 블록 안의 문장을 실행한다
		 */

	}

}
