package day0727.ch14;

//------------------------------------------
// AutoCloseable 인터페이스를 구현한 AutoCloseObj 클래스 선언
//------------------------------------------
public class AutoCloseObj implements AutoCloseable {
	
	//------------------------------------------
	// close() 메서드 구현
	// AutoCloseable 인터페이스는 반드시 close() 메서드를 구현해야 한다.
	//------------------------------------------
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}
}
