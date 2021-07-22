package chapter_07;

public class ObjectCopy1 {

	public static void main(String[] args) {
		// 객체 배열 복사하기 
		
		Book[] bookArray1 = new Book[3]; // Book형 배열 생성 
		Book[] bookArray2 = new Book[3]; // Book형 배열 생성
		
		// 변수 bookArray1 데이터 저장 
		bookArray1[0] = new Book("태백산맥" , "조정래");
		bookArray1[1] = new Book("데미안" , "헤르만");
		bookArray1[2] = new Book("어떻게 살 것인가" , "유시민");
		// (복사할 배열 , 복사할 첫 위치 , 대상 배열 , 붙여 넣을 첫 위치 , 복사할 요소 개수 ) 
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
// 결국 두 변수는 같은 메모리 위치 주소값을 가지고 있기 때문에 그대로 복사 