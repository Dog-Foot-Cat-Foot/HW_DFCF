package day0727.ch15;

import java.util.Scanner;

public class Ex03_ScannerTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// scanner 변수 선언, System.in을 매개변수로 받아 Scanner 객체화하여 저장
		// 표준 입력(콘솔 입력)으로부터 자료를 읽어 들이는 기능을 사용할 수 있다.
		//------------------------------------------
		Scanner scanner = new Scanner(System.in);
		
		//------------------------------------------
		// <1> name 변수 선언, nextLine() 메서드로 String형을 읽어들여서 저장
		// <2> job 변수 선언, nextLine() 메서드로 String형을 읽어들여서 저장
		// <3> num 변수 선언, nextInt() 메서드로 int형를 읽어들여서 저장
		//------------------------------------------
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("직업 : ");
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		
		/* =========================================
		 * Scanner 클래스
		 * java.util 패키지에 있는 입력 클래스로 문자뿐 아니라 정수, 실수, 등 다른 자료형도 읽을 수 있다.
		 * 
		 * 대표 생성자
		 * Scanner(File source) : 파일을 매개변수로 받아 Scanner를 생성한다.
		 * Scanner(InputStream source) : 바이트 스트림을 매개변수로 받아 Scanner를 생성한다
		 * Scanner(String source) : String을 매개변수로 받아 Scanner를 생성한다.
		 * 
		 * 메서드
		 * boolean nextBoolean() : boolean 자료를 읽는다
		 * byte nextByte() : 한 바이트 자료를 읽는다
		 * short nextShort() : short 자료형을 읽는다
		 * int nextInt() : int 자료형을 읽는다
		 * long nextLong() : long 자료형을 읽는다
		 * float nextFloat() : float 자료형을 읽는다
		 * double nextDouble() : double 자료형을 읽는다
		 * String nextString() : 문자열 String을 읽는다
		 * =========================================
		 */

	}

}
