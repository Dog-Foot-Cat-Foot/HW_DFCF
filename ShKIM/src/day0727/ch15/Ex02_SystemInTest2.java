package day0727.ch15;

import java.io.IOException;

public class Ex02_SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		//------------------------------------------
		// <1> int형 변수 i 선언
		// <2> while문에서 read() 메서드로 한 바이트를 반복해서 읽는다.
		// <3> 읽어 들인 내용을 화면에 출력한다
		//------------------------------------------
		int i;		// <1>
		try {
			while((i = System.in.read()) != -1) {	// <2>
				System.out.print((char)i);			// <3>
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
