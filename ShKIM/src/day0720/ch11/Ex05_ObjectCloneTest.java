package day0720.ch11;

//------------------------------------------
// 원점을 의미하는 Point 클래스 선언
//------------------------------------------
class Point {
	
	//------------------------------------------
	// x, y의 값을 담을 int형 변수 선언
	//------------------------------------------
	int x;
	int y;
	
	//------------------------------------------
	// 매개변수로 받은 x,  y의 값을 멤버 변수에 대입할 생성자 선언
	//------------------------------------------
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//------------------------------------------
	// toString() 메서드 오버라이딩, x와 y의 데이터를 리턴한다.
	//------------------------------------------
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

//------------------------------------------
// 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언
//------------------------------------------
class Circle implements Cloneable {
	
	//------------------------------------------
	// Point형 변수 point 선언, 원점
	// int형 변수 radius 선언, 반지름
	//------------------------------------------
	Point point;
	int radius;
	
	//------------------------------------------
	// 매개변수로 받은 radius의 값을 반지름에 대입하고
	// Point 인스턴스 생성하여 point 변수에 메위주 대입
	//------------------------------------------
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}
	
	//------------------------------------------
	// toString() 메서드 오버라이딩, 원점과 반지름의 데이터를 리턴한다
	//------------------------------------------
	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}
	
	//------------------------------------------
	// clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
	//------------------------------------------
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class Ex05_ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//------------------------------------------
		// <1> Circle형 변수를 사용하여 생성한 Circle 인스턴스의 메위주 대입
		// <2> clone() 메서드를 사용해 circle 인스턴스를 copyCircle에 복제함
		//------------------------------------------
		Circle circle = new Circle(10, 20, 30);						// <1>
		Circle copyCircle = (Circle)circle.clone();					// <2>
		
		//------------------------------------------
		// <1> circle 정보 출력, 원점은 x = 10, y = 20이고, 반지름은 30입니다.
		// <2> copyCircle 정보 출력, 원점은 x = 10, y = 20이고, 반지름은 30입니다.
		// <3> circle의 실제 인스턴스 주소 출력, 1991294891
		// <4> copyCircle의 실제 인스턴스 주소 출력, 399931359
		//------------------------------------------
		System.out.println(circle);									// <1>
		System.out.println(copyCircle);								// <2>
		System.out.println(System.identityHashCode(circle));		// <3>
		System.out.println(System.identityHashCode(copyCircle));	// <4>

	}

}
