package day0720.ch09;

public class Ex01_ComputerTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> Cannot instantiate the type Computer
		// <2> Computer형 변수 선언과 동시에 DeskTop 인스턴스 생성하여 업캐스팅 후 메위주 대입
		// <3> Cannot instantiate the type NoteBook
		// <4> Computer형 변수 선언과 동시에 MyNoteBook 인스턴스 생성하여 업캐스팅 후 메위주 대입
		//------------------------------------------
		// Computer c1 = new Computer();		// <1>
		Computer c2 = new DeskTop();		// <2>
		// Computer c3 = new NoteBook();		// <3>
		Computer c4 = new MyNoteBook();		// <4>

		
		/* ==========================================
		 * 추상 클래스는 인스턴스로 생성할 수 없다.
		 * 추상 클래스에서도 형 변환을 사용할 수 있다.
		 * ==========================================
		 */
		
	}

}
