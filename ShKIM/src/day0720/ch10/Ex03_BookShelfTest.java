package day0720.ch10;

public class Ex03_BookShelfTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> Queue형 변수 선언과 동시에 BookShelf 인스턴스 생성, 업캐스팅하여 메위주 대입
		// <2> 순서대로 요소를 추가
		// <3> 입력 순서대로 요소를 꺼내어 출력
		//------------------------------------------
		Queue shelfQueue = new BookShelf();			// <1>
		shelfQueue.enQueue("배고팡");				// <2>
		shelfQueue.enQueue("추웡");
		shelfQueue.enQueue("시끄렁");
		
		System.out.println(shelfQueue.deQueue());	// <3>
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());

	}

}
