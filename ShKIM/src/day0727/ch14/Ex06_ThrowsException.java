package day0727.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex06_ThrowsException {
	
	//------------------------------------------
	// throws 예약어를 사용하여 두 예외를 메서드가 호출될 때 처리되도록 미룬다
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

	//------------------------------------------
	// Add throws declaration : 예외 처리를 미룬다는 뜻이다. 
	//	main() 함수에서 미룬 예외 처리는 main() 함수를 호출하는 자바 가상 머신으로 보내진다.
	//	즉, 예외를 처리하는 것이 아니라 대부분의 프로그램이 비정상 종료된다.
	//------------------------------------------
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException  {
		
		//------------------------------------------
		// <1> test 변수 선언, Ex06_ThrowsException 객체화하여 메위주 저장
		// <2> 메서드를 호출할 때 예외를 처리함
		//------------------------------------------
		Ex06_ThrowsException test = new Ex06_ThrowsException();	// <1>
		test.loadClass("a.text", "java.lang.String");			// <2>
		
		
		
		/* =========================================
		 * Add throws declaration : 예외 처리를 미룬다.
		 * Surround with try/multi-catch : 하나의 catch문에서 여러 예외를 한 문장으로 처리한다.
		 * Surround with try/catch : 각 예외 상황마다 다른 방식으로 처리한다.
		 * 
		 * throws 예약어
		 * 예외를 직접 처리하지 않고 미룰 때 사용하는 예약어이다.
		 * =========================================
		 */
	}
	
}
