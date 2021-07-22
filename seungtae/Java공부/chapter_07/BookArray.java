package chapter_07;

public class BookArray {

	public static void main(String[] args) {
		// 객체 배열 만들기(2)	
		
		//  Book클래스형으로 객체 배열 선언 
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			// 메모리 위치 주소값이 저장되어있음 
			// 데이터가 저장되어 있지 않기 때문에 null 값이 저장되어있음 
			// 즉 인스턴스를 생성하면 그 인스턴스를 가리키는 주소값이 있다. 
			// 주소값에 데이터가 없으므로 null값 저장 
		}

	}

}
