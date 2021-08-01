package day0727.ch15;

import java.io.Console;

public class Ex04_ConsoleTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// console 변수 선언, console 클래스를 객체화하여 저장
		//------------------------------------------
		Console console = System.console();
		
		//------------------------------------------
		// <1> name 변수 선언, 문자열을 읽어서 저장
		// <2> job 변수 선언, 문자열을 읽어서 저장
		// <3> char형 배열 pass 변수 선언, 사용자에게 문자열을 보여 주지 않고 읽는다.
		// <4> strPass 변수 선언, pass를 매개변수로 String 객체화하여 저장
		//------------------------------------------
		System.out.println("이름 : ");
		String name = console.readLine();		// <1>
		System.out.println("직업 : ");
		String job = console.readLine();		// <2>
		System.out.println("비밀번호 : ");
		char[] pass = console.readPassword();	// <3>
		String strPass = new String(pass);		// <4>
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
		
		/* =========================================
		 * Console 클래스
		 * 직접 콘솔 창에서 자료를 입력받을 때 사용, 이클립스와는 연동되지 않는다.
		 * =========================================
		 */

	}

}
