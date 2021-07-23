package day0727.ch12;

public class Ex02_GenericMethod {

	//------------------------------------------
	// 제네릭 메서드 선언
	// 자료형 매개변수: <T, V>
	// 반환형: double
	// 매개변수: Point<T, V> p1, Point<T, V> p2
	//------------------------------------------
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		//------------------------------------------
		// <1> double형 left 변수 선언, p1.getX() 리턴형을 (Number)로 강제 형 변환하여
		//	doubleValue() 메서드 호출, 리턴값을 left 변수에 대입
		// <2> double형 width 변수 선언, right - left 데이터 대입
		// <3> width * height 데이터 리턴
		//------------------------------------------
		double left = ((Number) p1.getX()).doubleValue();		// <1>
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;		// <2>
		double height = bottom - top;
		
		return width * height;				// <3>
	}
	
	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> Point<Integer, Double>형 p1 변수 선언, Integer, Double형으로 0, 0.0 데이터 대입하는 
		//	생성자호출하여 Point 인스턴스 생성, 메위주 리턴
		// <2> Point<Integer, Double>형 p2 변수 선언, 10, 0 데이터 대입하는
		//	생성자호출하여 Point 인스턴스 생성, 메위주 리턴,
		//	컴파일러는 선언된 자료형을 보고 생성되는 인스턴스의 
		//	자료형을 유추할 수 있으므로 <> 다이아몬드 연산자에는 자료형을 명시하지 않아도 된다.
		//------------------------------------------
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);		// <1>
		Point<Integer, Double> p2 = new Point<>(10, 10.0);					// <2>
		
		//------------------------------------------
		// <1> double형 rect 변수 선언, makeRectangle() 메서드 호출하여 리턴 받은 데이터 대입
		// <2> rect 데이터 출력, 100.0
		//------------------------------------------
		double rect = Ex02_GenericMethod.<Integer, Double>makeRectangle(p1, p2);		// <1>
		System.out.println("두 점으로 만들어진 사각형의 넓이는 : " + rect + "입니다.");	// <2>

		
		/* =========================================
		 * 제네릭 메서드
		 * public <자료형매개변수> 반환형 메서드이름(자료형매개변수 ...) { }
		 * 반환형 앞에 사용하는 <자료형매개변수>는 여러 개일 수 있으며, 메서드 내에서만 유효하다.
		 * 제네릭 클래스가 아니더라도 내부에 제네릭 메서드를 구현할 수 있다.
		 * =========================================
		 */
		
	}

}
