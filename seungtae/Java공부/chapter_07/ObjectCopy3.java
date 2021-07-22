package chapter_07;

public class ObjectCopy3 {

	public static void main(String[] args) {
		// 객체 배열의 깊은 복사 
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥" , "조정래");
		bookArray1[1] = new Book("데미안" , "헤르만");
		bookArray1[2] = new Book("어떻게 살 것인가" , "유시민");
		
		// 디폴트 생성자로 bookArray2 배열 인스턴스 생성 
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// bookArray1 배열 요소를 새로 생성한 bookArray2 배열 인스턴스에 복사 
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// bookArray1 첫 번째 배열 요소 값 수정 
		bookArray1[0].setBookName("노답자바");
		bookArray1[1].setAuthor("저자없어");
		
		System.out.println("==BookArray1 정보==");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); // bookArray1 배열 요소 값 출력 
		}
		
		System.out.println("==BookArray2 정보==");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); // bookArray2 배열 요소 값 출력 
		}
	}

}

// 반복문을 사용하건 System.arraycopy() 메서드를 사용하건 객체 배열을 복사하면 항상 인스턴스 주소가 복사된다. 
// 그러나 인스턴스를 따로 분리하고 싶다면 직접 인스턴스를 만들고 그 값을 복사해야 한다.
// 이를 "깊은 복사"라고 한다. 
