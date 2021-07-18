package day0720.ch09;

//------------------------------------------
// Computer 추상 클래스를 상속받은 DeskTop 클래스는 추상 메서드를 구현해야 한다
// 혹은 DeskTop 클래스 또한 추상 클래스로 선언해야 한다
// The type DeskTop must implement the inherited abstract method Computer.typing()
//------------------------------------------
public class DeskTop extends Computer {

	//------------------------------------------
	// 추상 메서드의 몸체 코드 작성
	//------------------------------------------
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
}
