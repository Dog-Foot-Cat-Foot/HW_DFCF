package day0727.ch14;

//------------------------------------------
// Exception 클래스를 상속 받은 IDFormatException 클래스 선언
//------------------------------------------
public class IDFormatException extends Exception {
	
	//------------------------------------------
	// 생성자의 매개변수로 예외 상황 메시지를 받는다.
	//------------------------------------------
	public IDFormatException(String message) {
		super(message);
	}

}
