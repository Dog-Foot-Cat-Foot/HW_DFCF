package day0727.ch14;

public class Ex04_AutoCloseTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> try-with-resources문 사용
		//	try( A a = new A(); B b = new B()){ ~ } catch(Exception e) { ~ }
		//	사용할 리소스 선언
		//	리소스를 여러 개 생성해야 한다면 세미 콜론(;)으로 구분한다.
		//------------------------------------------
		try(AutoCloseObj obj = new AutoCloseObj()){		// <1>
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
		
		
		/* =========================================
		 * try-with-resources문
		 * close() 메서드를 명시적으로 호출하지 않아도 try 블록 내에서 열린 리소스를 자동으로 닫도록 만들 수 있다.
		 * 문법을 사용하려면 해당 리소스가 AutoCloseable 인터페이스를 구현해야 한다.
		 * 
		 * AutoCloseable 인터페이스
		 * close() 메서드가 있고, 이를 구현한 클래스는 close()를 명시적으로 호출하지 않아도 close() 메서드 부분이 호출된다.
		 * =========================================
		 */

	}

}
