package day0727.ch14;

public class Ex05_AutoCloseObjTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> 강제로 예외를 발생시켜 catch 블록이 수행되도록 구현
		//------------------------------------------
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();			// <1>
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
		
		//------------------------------------------
		// 실행 결과
		// 리소스가 close() 되었습니다.
		// 예외 부분입니다.
		//------------------------------------------
		// try-with-resources문을 사용하면 close() 메서드를 명시적으로 호출하지 않아도
		// 정상 종료된 경우와 예외가 발생한 경우 모두 리소스가 잘 해제된다.
		//------------------------------------------

	}

}
