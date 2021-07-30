package day0727.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_ExceptionHandling1 {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> try-catch문 선언
		// <2> a.txt 파일에서 데이터를 읽어 들이기 위해 스트림 객체를 생성
		//	예외를 처리하지 않는다면 컴파일 오류가 뜬다 
		//	Unhandled exception type FileNotFoundException
		// <3> 읽으려는 파일이 없는 경우에 자바 가상 머신에서는 FileNotFoundException 예외 클래스가 생성된다.
		// <4> 어디에서 예외가 발생햇는지 따라 가는 printStackTrace() 메서드
		//	예외 이름과 그 내용을 볼 수 있다
		// <5> 예외 클래스의 toString() 메서드 호출
		//	java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
		//------------------------------------------
		try {			// <1>
			FileInputStream fis = new FileInputStream("a.txt");	// <2>
		} catch (FileNotFoundException e) {		// <3>
			// e.printStackTrace();				// <4>
			System.out.println(e);				// <5>
		}
		
		//------------------------------------------
		// try-catch 문에서 예외 처리되어 아래 문장도 정상 수행된다.
		//------------------------------------------
		System.out.println("여기도 수행됩니다.");	
		
		
		/* =========================================
		 * 컴파일러에 의해 예외가 체크되는 경우
		 * 예외 처리로 프로그램의 예외 상황 자체를 막을 수는 없다.
		 * 하지만 예외 처리를 하면 예외 상황을 알려 주는 메시지를 볼 수 있고, 
		 * 프로그램이 비정상 종료되지 않고 계속 수행되도록 만들 수 있다.
		 * =========================================
		 */

	}

}
