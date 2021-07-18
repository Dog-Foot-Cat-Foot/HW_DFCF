package day0713.ch07;

public class Ex04_CharArray {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// <1> 길이가 26인 char형 배열 선언
		// <2> char형 변수 선언과 동시에 'A' 데이터 대입
		//---------------------------------------------------
		char[] alphabets = new char[26];	// <1>
		char ch = 'A';						// <2>
		
		System.out.println(alphabets[0] == 0);
		
		//---------------------------------------------------
		// alphabets 배열 길이만큼 반복
		// 초기화식: i = 0
		// 조건식: i < alphabets.length
		// 증감식: i++, ch++
		// <1> 0~25번째 배열 요소에 ch++ 데이터 초기화
		//---------------------------------------------------
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;		// <1>
		}
		
		//---------------------------------------------------
		// alphabets 배열 길이만큼 반복
		// <1> alphabets 배열의 0~26번째 배열 요소의 데이터 출력
		// int형으로 변환하여 출력
		//---------------------------------------------------
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]); // <1>
		}

	}

}
