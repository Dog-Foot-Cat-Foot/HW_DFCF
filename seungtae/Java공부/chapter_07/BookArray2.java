package chapter_07;

public class BookArray2 {

	public static void main(String[] args) {
		// 객체 배열 만들기(3)
		
		// Book클래스형 객체배열 생성 
		Book[] library = new Book[5];
		
		// 책이름과 저자로 생성된 메서드를 사용하여 각각의 인덱스 번호에 데이터 저장 
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("데미안","헤르만");
		library[2] = new Book("어떻게 살 것인가?","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생텍쥐페리");
		
		// 반복문을 사용하여 배열의 길이만큼 반복 
		for(int i = 0; i<library.length; i++) {
			// 배열의 정보를 출력하는 메서드 호출 
			library[i].showBookInfo();
		}
		// 반복문을 사용하여 배열의 길이만큼 반복 
		for(int i = 0; i<library.length; i++) {
			// 각 배열 인덱스번호에 저장된 메모리 위치 주소값 출력 
			System.out.println(library[i]);
		}


	}

}
