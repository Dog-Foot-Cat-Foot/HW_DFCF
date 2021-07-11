package day0713.ch07;

public class Ex06_BookArray2 {

	public static void main(String[] args) {
		
		// 길이가 5인 Book형 배열 선언
		Book[] library = new Book[5];
		
		// Book 인스턴스를 생성하여 0~4번째 배열 요소에 메모리 위치 주소값 대입
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");
		
		// 배열 길이만큼 반복 수행
		for(int i = 0; i < library.length; i++) {
			// library 참조 변수로 i번째에 저장된 메모리 위치 주소값 접근하여
			// Book 인스턴스의 showBookInfo() 메서드 호출
			library[i].showBookInfo();
		}
		
		// 배열 길이만큼 반복 수행
		for(int i = 0; i < library.length; i++) {
			// library 참조 변수의 i 번째 배열 요소 데이터 출력
			// 객체 배열이므로 각 배열 요소에 저장된 인스턴스의 메모리 위치 주소값이 출력된다
			System.out.println(library[i]);  // 클래스명@메모리 주소
		}

	}

}
