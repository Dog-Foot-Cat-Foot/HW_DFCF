package day0713.ch07;

public class Ex09_ObjectCopy3 {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		//---------------------------------------------------
		// 디폴트 생성자로 bookArray2 배열 인스턴스 생성
		//---------------------------------------------------
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//---------------------------------------------------
		// bookArray1 배열 요소를 새로 생성한 bookArray2 배열 인스턴스에 복사
		// <1> bookArray2의 i번째 요소의 Book 인스턴스의
		// bookName, author 멤버 변수에 데이터 대입한다
		// 각 대입되는 데이터는 bookArray1의 i번째 요소의 Book 인스턴스의
		// bookName, author 멤버 변수의 데이터이다.
		//---------------------------------------------------
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());	// <1>
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		//---------------------------------------------------
		// bookArray2 배열 요소 값 출력
		//---------------------------------------------------
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		//---------------------------------------------------
		// bookArray1 첫 번째 배열 요소 값 수정
		//---------------------------------------------------
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==bookArray1==");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==bookArray2==");
		//---------------------------------------------------
		// bookArray1 배열 요소 값과 다른 내용이 출력됨
		//---------------------------------------------------
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		/* ===================================================
		 * 깊은 복사(deep copy)
		 * 반복문을 사용하건 System.arraycopy() 메서드를 사용하건 
		 * 객체 배열을 복사하면 항상 인스턴스 주소가 복사된다.
		 * 인스턴스를 따로 관리하고 싶다면 직접 인스턴스를 만들고 그 값을 복사해야 한다
		 * 복사할 배열에 인스턴스를 따로 생성한 후 요소 값을 복사하면 
		 * 서로 다른 인스턴스를 가리키므로 기존 배열의 요소 값이 변경되어도 영향을 받지 않는다
		 * ===================================================
		 */

	}

}
