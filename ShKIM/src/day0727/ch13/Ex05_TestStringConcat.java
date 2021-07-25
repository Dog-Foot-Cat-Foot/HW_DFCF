package day0727.ch13;

public class Ex05_TestStringConcat {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> StringConcatImpl형 concat1 변수 선언, StringConcatImpl 객체화하여 리턴된 메위주 대입
		// <2> concat1의 makeString() 메서드 호출
		//	Hello, World
		//------------------------------------------
		// 클래스에서 인터페이스 구현하기
		// makeString() 메서드를 수행하려면 StringcConcat 인터페이스를 
		// 구현한 StringConcatImpl 클래스를 인스턴스로 생성해야 한다.
		//------------------------------------------
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl concat1 = new StringConcatImpl();	// <1>
		concat1.makeString(s1, s2);							// <2>
		
		//------------------------------------------
		// <1> StringConcat 인터페이스형 concat2 변수에 람다식 대입
		// <2> concat2 변수로 makeString() 메서드 호출
		//	Hello, World
		//------------------------------------------
		// 람다식으로 인터페이스 구현하기
		//------------------------------------------
		StringConcat concat2 = (s, v) -> System.out.println(s + ", " + v);
		concat2.makeString(s1, s2);
		
		
		//------------------------------------------
		// 익명 객체를 생성하는 람다식
		//------------------------------------------
		// 람다식으로 메서드를 구현해서 호출하면 컴퓨터 내부에서는 아래처럼 
		// 익명 클래스가 생성되고 이를 통해 익명 객체가 생성되는 것이다.
		//------------------------------------------
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		//------------------------------------------
		// 람다식에서 사용하는 지역 변수
		//------------------------------------------
		// <1> main() 함수의 지역 변수
		// <2> 람다식 역시 익명 내부 클래스가 생성되므로 
		//	외부 메서드의 지역 변수를 사용하면 변수는 final 변수, 즉 상수가 된다.
		//	Local variable i defined in an enclosing scope must be final or effectively final
		//------------------------------------------
		int i = 100;		// <1>
		StringConcat concat4 = (s, v) -> {
			// i = 200;		// <2>
			System.out.println(i);
			System.out.println(s + ", " + v);
		};
		concat4.makeString(s1, s2);
		
	}

}
