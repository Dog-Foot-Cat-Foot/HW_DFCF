package day0713.ch02;

public class Ex04_CharacterEx2 {

	public static void main(String[] args) {
		
		// 문자형 변수 ch1 선언과 동시에 '한' 데이터 대입
		char ch1 = '한';
		// \uD55C 는 유니코드 리터럴 형태로 '한' 이라는 글자의 유니코드 값임
		// 문자형 변수 ch2 선언과 동시에 유니코드 이스케이프 시퀀스 형식 데이터 대입
		char ch2 = '\uD55C';
		
		// ch1 데이터 출력
		System.out.println(ch1); // 출력: 한
		
		// ch2 데이터 출력
		System.out.println(ch2); // 출력: 한
	}

}
