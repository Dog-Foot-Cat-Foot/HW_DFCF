package day0709.ch02;

public class CharacterEx3 {

	public static void main(String[] args) {
		
		// 정수형 변수 a 선언과 동시에 65 데이터 대입
		int a = 65;
		// 정수형 변수 b 선언과 동시에 -66 데이터 대입
		int b = -66;
		
		// 문자형 변수 a2 선언과 동시에 65 데이터 대입
		char a2 = 65;
		// 문자형 변수 b2 선언과 동시에 -66 데이터 대입
		// char형은 음수 값을 표현할 수 없어서 오류가 발생 (Type mismatch)
		// char b2 = -66;
		
		// 정수형 변수 a의 데이터를 char형으로 형변환하여 출력
		System.out.println((char)a);  // 출력: A
		// 정수형 변수 b의 데이터를 char형으로 형변환하여 출력
		// ? 는 알 수 없는 문자라는 의미이다.
		System.out.println((char)b);  // 출력: ?
		// 문자형 변수 a2의 데이터 출력
		System.out.println(a2);  // 출력: A

	}

}
