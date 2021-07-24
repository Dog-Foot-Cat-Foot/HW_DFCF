package day0727.ch13;

//------------------------------------------
// 외부 클래스
//------------------------------------------
class OutClass {
	
	//------------------------------------------
	// <1> int형 num 변수 선언, 10 데이터 대입, 인스턴스 변수
	// <2> static int형 sNum 변수 선언, 20 데이터 대입, 정적 변수
	// <3> 내부 클래스 자료형 변수를 먼저 선언
	//------------------------------------------
	private int num = 10;			// <1>
	private static int sNum = 20;	// <2>
	private InClass inClass;		// <3>
	
	//------------------------------------------
	// 외부 클래스 디폴트 생성자, 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	//------------------------------------------
	public OutClass() {
		inClass = new InClass();
	}
	
	//------------------------------------------
	// 인스턴스 내부 클래스
	//------------------------------------------
	class InClass {
		
		//------------------------------------------
		// <1> 내부 클래스의 인스턴스 변수
		// <2> 인스턴스 내부 클래스에 정적 변수 선언 불가능, 오류가 발생하므로 주석 처리
		//	The field sInNum cannot be declared static in a non-static inner type, unless initialized with a constant expression
		//------------------------------------------
		// 인스턴스 내부 클래스는 외부 클래스를 생성한 이후에 사용해야 하기 때문에
		//	클래스의 생성과 상관없이 사용할 수 있는 정적 변수나 정적 메서드는 인스턴스 내부 클래스에서 선언할 수 없다.
		//------------------------------------------
		int inNum = 100;			// <1>
		// static int sInNum = 200;	// <2>
		
		//------------------------------------------
		// inTest() 메서드 선언
		// 외부 클래스의 인스턴스 변수와 정적 변수를 출력한다.
		//------------------------------------------
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		//------------------------------------------
		// stTest() 정적 메서드 선언 불가, 오류가 발생하므로 주석 처리함
		//	The method sTest cannot be declared static; static methods can only be declared in a static or top level type
		//------------------------------------------
		// static void sTest() {}
	
	}
	
	//------------------------------------------
	// 정적 내부 클래스 선언
	//------------------------------------------
	static class InStaticClass {
		
		//------------------------------------------
		// <1> 정적 내부 클래스의 인스턴스 변수
		// <2> 정적 내부 클래스의 정적 변수
		//------------------------------------------
		int inNum = 100;			// <1>
		static int sInNum = 200;	// <2>
		
		//------------------------------------------
		// inTest() 인스턴스 메서드 선언
		// <1> 외부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
		//	Cannot make a static reference to the non-static field num
		// <2> inNum, sInNum, sNum 출력
		//------------------------------------------
		void inTest() {
			// num += 10;		// <1>
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");	// <2>
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		//------------------------------------------
		// sTest() 정적 메서드 선언
		// <1> 외부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
		//	Cannot make a static reference to the non-static field num
		// <2> 내부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
		//	Cannot make a static reference to the non-static field inNum
		// <3> sNum, sInNum 출력
		//------------------------------------------
		static void sTest() {
			// num += 10;		// <1>
			// inNum += 10;		// <2>
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");	// <3>
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
		
	}
	
	//------------------------------------------
	// usingClass() 메서드 선언
	// 내부클래스의 inTest() 메서드를 호출한다.
	//------------------------------------------
	public void usingClass() {
		inClass.inTest();
	}

}

public class Ex01_InnerTest {

	public static void main(String[] args) {
	
		//------------------------------------------
		// <1> OutClass형으로 outClass 변수 선언, OutClass 인스턴스 생성 후 리턴된 메위주 대입
		// <2> outClass 변수로 usingClass() 메서드 호출, 내부 클래스 기능 호출
		// 출력 : OutClass num = 10(외부 클래스의 인스턴스 변수)
		// OutClass sNum = 20(외부 클래스의 정적 변수)
		//------------------------------------------
		OutClass outClass = new OutClass();		// <1>
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();					// <2>
		
		//------------------------------------------
		// <1> 외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
		// <2> 정적 내부 클래스 일반 메서드 호출
		// <3> 정적 내부 클래스 정적 메서드 호출
		//------------------------------------------
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();	// <1>
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();					// <2>
		System.out.println();
		System.out.println("정적 내부 클래스 정적 메서드 호출");
		OutClass.InStaticClass.sTest();		// <3>
		
		
		/* =========================================
		 * 내부 클래스(inner class)
		 * 클래스 내부에 선언한 클래스이다.
		 * 외부 클래스가 밀접한 관련이 있는 경우 선언하며, 
		 * 그 밖의 다른 클래스와 협력할 일이 없는 경우 선언해서 사용한다
		 * 
		 * 인스턴스 내부 클래스(instance inner class)
		 * 인스턴스 변수를 선언할 때와 같은 위치에 선언하며,
		 * 외부 클래스 내부에서만 생성하여 사용하는 객체를 선언할 때 쓴다.
		 * 인스턴스 내부 클래스는 외부 클래스 생성 후 생성된다.
		 * 따라서, 외부 클래스를 먼저 생성하지 않고 인스턴스 내부 클래스를 사용할 수 없다.
		 * =========================================
		 */
		
	}

}
