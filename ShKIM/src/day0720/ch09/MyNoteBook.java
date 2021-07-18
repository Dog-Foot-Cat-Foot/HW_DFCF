package day0720.ch09;

//------------------------------------------
// NoteBook 추상 클래스를 상속받는 MyNoteBook 클래스 선언
//------------------------------------------
public class MyNoteBook extends NoteBook {

	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
	
}
