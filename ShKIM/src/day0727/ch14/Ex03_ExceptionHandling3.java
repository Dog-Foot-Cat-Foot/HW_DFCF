package day0727.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03_ExceptionHandling3 {

	public static void main(String[] args) {

		//------------------------------------------
		// FileInputStream형 변수 fis 선언 후 null로 초기화
		//------------------------------------------
		FileInputStream fis = null;
		
		//------------------------------------------
		// try-catch-finally문
		// try { 예외가 발생할 수 있는 부분 } catch(처리할 예외 타입 e) { 예외를 처리하는 부분 } finally { 항상 수행되는 부분 }
		//------------------------------------------
		// <1> try-catch문을 사용해 FileNotFoundException 예외 처리
		// <2> catch 문에서 강제로 return 함
		//------------------------------------------
		try {
			fis = new FileInputStream("a.txt");	// <1>
		} catch (FileNotFoundException e) {		
			System.out.println(e);
			return;				// <2>
		} finally {
			if(fis != null) {
				//------------------------------------------
				// <1> 파일 입력 스트림 닫기
				//	예외를 처리하지 않는다면 컴파일 오류가 뜬다
				//	Unhandled exception type IOException
				//------------------------------------------
				try {
					fis.close();			// <1>
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			//------------------------------------------
			// catch 문에서 강제로 return 하여도 finally문은 반드시 실행된다.
			//------------------------------------------
			System.out.println("항상 수행된다.");
		}
		
		System.out.println("여기도 수행된다.");
		
		
		/* =========================================
		 * try-catch-finally문
		 * try 블록이 수행되면 finally 블록은 어떤 경우에도 반드시 수행된다.
		 * try, catch문에 return문이 있어도 수행된다.
		 * 
		 * 리소스(resource)
		 * 시스템에서 사용하는 자원을 말한다. 예) 파일, 네트워크, 데이터베이스 연결 등
		 * 사용한 시스템 리소스는 사용 후 반드시 close() 메서드로 닫아 주어야 한다.
		 * =========================================
		 */
		
	}

}
