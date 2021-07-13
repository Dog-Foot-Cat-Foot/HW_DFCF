package day0713.ch07;

public class Ex08_ObjectCopy1 {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// Book형 객체 배열 선언과 동시에 
		// new 예약어로 길이가 3인 Book형 객체 배열을 생성하여
		// 생성한 메모리 위치 주소값을 대입한다
		//---------------------------------------------------
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		//---------------------------------------------------
		// <1> bookArray1 배열의 0~2번째 배열 요소에 
		// new 예약어로 생성한 인스턴스의 주소를 대입한다
		// <2> System 객체의 arraycopy() 메서드 호출하여 배열 0번째부터 3개의 배열 요소 복사
		//---------------------------------------------------
		bookArray1[0] = new Book("태백산맥", "조정래");		// <1>
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);	// <2>
		
		//---------------------------------------------------
		// for문, bookArray2의 배열 요소 개수만큼 반복 수행
		// <1>bookArray2의 i번째 배열요소에 들어있는 메모리 주소값으로 
		// Book 인스턴스의 showBookInfo() 메서드 호출
		//---------------------------------------------------
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();	// <1>
		}
		
		//---------------------------------------------------
		// bookArray1 배열의 0 번째 요소 bookName, author 인스턴스 변수 데이터 수정
		//---------------------------------------------------
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==bookArray1==");
		//---------------------------------------------------
		// for문의 bookArray1의 배열 길이만큼 반복 수행
		// <1> bookArray1의 i 번째 요소에 들어있는 메위주로 Book 인스턴스의 showBookInfo() 메서드 호출
		//---------------------------------------------------
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();	// <1>
		}
		
		System.out.println("==bookArray2==");
		//---------------------------------------------------
		// for문의 bookArray2의 배열 길이만큼 반복 수행
		// <1> bookArray2의 i번째 요소에 들어있는 메위주로 Book 인스턴스의 showBookInfo() 메서드 호출 
		// bookArray1의 데이터와 동일하게 출력된다
		//---------------------------------------------------
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();	// <1>
		}

		
		/* ===================================================
		 * 얕은 복사(shallow copy)
		 * bookArray1의 배열 요소를 변경했는데 bookArray2의 배열 요소도 변경된 이유
		 * 객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니고 인스턴스의 주소 값이기 때문이다
		 * 객체 배열을 복사할 때 인스턴스를 따로 생성하는 게 아니라 기존 인스턴스의 주소 값만 복사한다
		 * 즉, 두 배열의 서로 다른 요소가 같은 인스턴스를 기리키고 있다
		 * ===================================================
		 */
	}

}
