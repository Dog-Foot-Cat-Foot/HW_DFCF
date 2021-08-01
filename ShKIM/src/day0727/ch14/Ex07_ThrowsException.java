package day0727.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex07_ThrowsException {
	
	//------------------------------------------
	// 두 예외를 메서드가 호출될 때 처리되도록 미룬다
	//------------------------------------------
	private Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		//------------------------------------------
		// <1> FileNotFoundException 발생 가능
		// <2> ClassNotFoundException 발생 가능
		//------------------------------------------
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> test 변수 선언, Ex06_ThrowsException 객체화하여 메위주 저장
		// <2> FileNotFoundException 예외 처리
		// <3> ClassNotFoundException 예외 처리
		// <4> Exception 클래스로 그 외 예외 상황 처리
		//------------------------------------------
		// Exception 클래스는 모든 예외 클래스의 최상위 클래스로 다른 catch 블록에 선언한 것 
		// 이외의 예외가 발생하더라도 Exception 클래스로 자동 형 변환된다.
		// Exception 클래스를 기본(default) 예외 처리라고도 한다.
		//------------------------------------------
		// Exception 클래스를 상단에 쓰면 아래와 같은 컴파일 오류가 발생한다.
		// Unreachable catch block for ClassNotFoundException. It is already handled by the catch block for Exception
		// 모든 예외 클래스는 Exception 상위 클래스로 자동 형 변환되어 발생한 오류이다.
		// 기본(default) 예외 처리를 하는 Exception 클래스에 의해 모든 예외가 처리되므로
		// 이 외 예외 처리 문장에는 도달할 일이 없어 컴파일 오류가 발생한다.
		//------------------------------------------
		Ex07_ThrowsException test = new Ex07_ThrowsException();	// <1>
		try {
			test.loadClass("a.text", "java.lang.String");
		} catch (FileNotFoundException e) {			// <2>
			e.printStackTrace();
		} catch (ClassNotFoundException e) {		// <3>
			e.printStackTrace();
		} catch (Exception e) {						// <4>
			e.printStackTrace();
		}
		
		
		/* =========================================
		 * 다중 예외 처리
		 * 여러 catch문을 한꺼번에 사용하는 경우에 각 catch 블록은 각각의 예외 처리를 담당한다.
		 * 컴파일러에 의해 체크되지 않는 경우가 있을 수 있다. 
		 * 어떤 예외가 발생할지 미리 알 수 없지만 모든 예외 상황을 처리하고자 한다면
		 * 맨 마지막 부분에 Exception 클래스를 활용하여 catch 블록을 추가한다.
		 * 예외는 catch문을 선언한 순서대로 검사한다.
		 * =========================================
		 */
		
	}
	
}
