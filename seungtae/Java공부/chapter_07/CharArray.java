package chapter_07;

public class CharArray {

	public static void main(String[] args) {
		// 알파벳 문자와 아스키 코드 값 출력하기 
		
		// 26개의 데이터를 저장할 수 있는 char형 배열변수 알파벳 선언  
		char[] alphabets = new char[26]; 
		// 인덱스번호 0번에 들어갈 데이터 
		// char형 변수ch에 데이터 'A' 저장 
		char ch ='A';
		
		// 변수 알파벳.길이 동안만큼 돌아갈 반복문 (인덱스번호)
		// ch++ 증감식을 써주지 않으면 모든 반복문에 A,65 만 나옴 
		for(int i=0; i<alphabets.length; i++, ch++) {
			// 인덱스 0번에 저장한 'A'를 아스키값 65로 저장해서 1씩 증가 
			alphabets[i] = ch; 
		}
		
		// 배열길이 만큼 반복문 
		for(int i=0; i<alphabets.length; i++) {
			// (int)alphabets[i]에 int를 붙여준 이유는 
			// 각 값에 아스키코드가 저장되는 이것을 int형으로 변환해서 각 아스키코드값에 해당한는 번호로 되돌려준다. 
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
		
	}

}
