package chapter_07;

public class alone1 {

	public static void main(String[] args) {
		// 나 혼자 코딩 
		// 알파벳 소문자를 2글자씩 13줄(13행 2열)로 출력하는 프로그램을 이차원 배열로 구현해 보시오
		
		// char형 이차원 배열 13행 2열 선언 
		char[][] alphabets = new char[13][2];
		// 들어갈 데이터 선언 
		char ch = 'a';
		
		// 행을 세는 반복문 
		for(int i=0; i<alphabets.length; i++) {
			// 열을 세는 반복문 
			for(int j=0; j<alphabets[i].length; j++) {
				// 배열변수안에 'a' 저장한 변수 ch 대입 
				alphabets[i][j] = ch;
				// 이차원 배열 출력 
				System.out.print(alphabets[i][j]);
				// 증감연산자로 아스키 값 1씩 증가 
				ch++;
			}
			System.out.println();
		}
		

	}

}

