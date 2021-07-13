package day0713.ch07;

public class Ex05_BookArray {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// Book 클래스형으로 객체 배열 생성
		// Book 인스턴스 주소 값을 담을 공간이 5개 만들어지는 것이지
		// Book 인스턴스 5개가 생성되는 것이 아니다
		//---------------------------------------------------
		Book[] library = new Book[5];
		
		//---------------------------------------------------
		// library 배열 길이만큼 반복 수행
		// <1> library 배열의 0~4번째 배열 요소 출력
		//---------------------------------------------------
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // <1> null
		}

	}

}
