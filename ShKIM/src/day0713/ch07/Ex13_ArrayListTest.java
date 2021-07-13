package day0713.ch07;
//---------------------------------------------------
// ArrayList는 java.util 패키지에 구현되어 있는 클래스로
// ArrayList를 사용하려면 자바 클래스를 선언하기 전에
// import 문장을 반드시 써 줘야 한다.
//---------------------------------------------------
import java.util.ArrayList;

public class Ex13_ArrayListTest {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// <1> ArrayList 선언
		// <2> add() 메서드로 요소 값 추가
		//---------------------------------------------------
		ArrayList<Book> library = new ArrayList<Book>();	// <1>
		
		library.add(new Book("태백산맥", "조정래"));				// <2>
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
		//---------------------------------------------------
		// 배열에 추가된 요소 개수만큼 출력
		//---------------------------------------------------
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=====향상된 for문 사용=====");
		for(Book book : library) {
			book.showBookInfo();
		}
		
		
		/* ===============================================
		 * ArrayList 클래스 사용하기
		 * 객체 배열 클래스로, 객체 배열을 좀 더 쉽게 사용할 수 있다
		 * ===============================================
		 */

	}

}
