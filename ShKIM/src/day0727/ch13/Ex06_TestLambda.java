package day0727.ch13;

//------------------------------------------
// 함수형 인터페이스
//------------------------------------------
interface PrintString {
	void showString(String str);
}

public class Ex06_TestLambda {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> PrintString 인터페이스형 lambdaStr 변수 선언, 람다식 대입
		// <2> lambdaStr 변수로 showString() 메서드 호출
		//	변수를 사용해 람다식 구현부 호출
		//	hello lamda_1
		// <3> showMyString() 메서드 호출하며 매개변수로 람다식을 대입한 변수 전달
		//	hello lamda_2
		//------------------------------------------
		// 람다식을 변수에 대입하면 이를 매개변수로 전달할 수 있다.
		// 이때 전달되는 매개변수의 자료형은 인터페이스형이다.
		//------------------------------------------
		PrintString lambdaStr = s -> System.out.println(s);	// <1>
		lambdaStr.showString("hello lamda_1");				// <2>	
		showMyString(lambdaStr);							// <3>
		
		//------------------------------------------
		// 반환 값으로 쓰이는 람다식
		//------------------------------------------
		// <1> 변수로 람다식 반환받기
		// <2> 메서드 호출
		//	hello world
		//------------------------------------------
		PrintString reStr = returnString();
		reStr.showString("hello ");

	}
	
	//------------------------------------------
	// showMyString(PrintString p) 메서드 선언, 매개변수를 인터페이스형으로 받음
	//------------------------------------------
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
	
	//------------------------------------------
	// 람다식을 반환하는 메서드 선언
	// 메서드의 반환형을 람다식의 인터페이스형으로 선언하면 구현한 람다식을 반환할 수 있다.
	//------------------------------------------
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}

}
