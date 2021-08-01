package day0727.ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05_FileInputStreamTest1 {

	public static void main(String[] args) {
		
		//------------------------------------------
		// FileInputStream형 fis 변수 선언
		//------------------------------------------
		FileInputStream fis = null;
		
		//------------------------------------------
		// <1> input.text 파일을 매개변수로 FileInputStream 객체화하여 변수 fis에 저장
		//	읽으려는 파일이 없으면 FileNotFoundException 예외 발생
		// <2> IOException 예외 처리
		//	FileNotFoundException의 상위 예외 클래스이다.
		//------------------------------------------
		try {
			fis = new FileInputStream("input.txt");	// <1>
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {		// <2>
			System.out.println(e);
		} finally {
			//------------------------------------------
			// <1> 열린 스트림 닫음
			// <2> IOException 예외 처리
			// <3> NullPointerException 예외 처리
			//------------------------------------------
			try {
				fis.close();			// <1>
			} catch (IOException e) {	// <2>
				System.out.println(e);
			} catch (NullPointerException e) {	// <3>
				System.out.println(e);
			}
		}
		//------------------------------------------
		// 예외 처리하여 프로그램이 정상 수행되어 end까지 출력된다
		//------------------------------------------
		System.out.println("end");
		
		
		/* ======================================
		 * FileInputStream
		 * FileInputStream은 파일에서 바이트 단위로 자료를 읽어 들일 때 사용하는 스트림 클래스이다.
		 * 
		 * 생성자
		 * FileInputStream(String name) : 파일 이름 name(경로 포함)을 매개변수로 받아 입력 스트림을 생성한다. 
		 * FileInputStream(File f) : File 클래스 정보를 매개변수로 받아 입력 스트림을 생성한다.
		 * ======================================
		 */
		
	}

}
