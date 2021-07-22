package chapter_07;

public class ObjectCopy2 {

	public static void main(String[] args) {
		// 객체 배열의 얕은 복사 
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥" , "조정래");
		bookArray1[1] = new Book("데미안" , "헤르만");
		bookArray1[2] = new Book("어떻게 살 것인가" , "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("노답자바");
		bookArray1[1].setAuthor("저자없어");
		
		System.out.println("==BookArray1 정보==");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==BookArray2 정보==");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

	}

}
// bookArray1의 인덱스번호 0번째 데이터값을 변경했는데 bookArray2 배열의 인덱스번호 0번째도 같이 바뀌었다.
// 둘다 같은 메모리 위치 주소값을 가르키고 있어서 bookArray1의 값을 변경했어도 bookArray2의 값도 같이 바뀐다.