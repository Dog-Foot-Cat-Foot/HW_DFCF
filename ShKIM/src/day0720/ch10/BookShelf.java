package day0720.ch10;

//------------------------------------------
// Shelf 클래스를 상속받고 Queue 인터페이스를 구현한 BookShelf 클래스 선언
//------------------------------------------
public class BookShelf extends Shelf implements Queue {

	//------------------------------------------
	// 배열에 요소 추가
	//------------------------------------------
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	//------------------------------------------
	// 맨 처음 요소를 배열에서 삭제하고 반환
	//------------------------------------------
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	//------------------------------------------
	// 배열 요소 개수 반환
	//------------------------------------------
	@Override
	public int getSize() {
		return getCount();
	}
	
}
