package day0720.ch09;

//------------------------------------------
// Computer 추상 클래스를 선언받은 NoteBook 추상 클래스 선언
// 추상 메서드 하나만 구현하여 NoteBook 또한 추상 클래스가 된다
//------------------------------------------
public abstract class NoteBook extends Computer {

	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}
	
}
