package day0713.ch05;

public class Ex02_StudentTest {
	
	//---------------------------------------------------
	// main() 함수는 자바 가상 머신(Java Virtual Machine: JVM) 이 프로그램을 시작하기 위해 호출하는 함수
	// 클래스 내부에 만들지만, 클래스의 메서드는 아니다
	//---------------------------------------------------
	public static void main(String[] args) {
		
		//---------------------------------------------------
		// <1> new 예약어로 Student 클래스의 생성자를 호출하여 인스턴스 생성
		// Student 객체참조형 변수 studentKim 에 생성된 인스턴스의 메모리 위치 주소값 대입
		// <2> studentKim 변수의 메모리 위치 주소값을 통해 studentName 멤버변수 접근하여
		// studentName의 멤버 변수에 "김석진" 라는 문자열의 메모리 위치 주소값 대입
		// 오류: The field Student.studentName is not visible
		// studentName 변수의 접근 제어가 default -> private로 변경되어 외부 클래스 직접 접근 불가함
		// <3> setStudentName() 메서드를 호출하여 private 변수 간접 접근
		//---------------------------------------------------
		Student studentKim = new Student();		// <1>
		// studentKim.studentName = "김석진";		// <2>
		studentKim.setStudentName("김석진");		// <3>
		
		//---------------------------------------------------
		// <1> studentKim 변수로 Student 객체에 접근하여 studentName 멤버 변수의 데이터 출력
		// <2> studentKim 변수로 Student 객체에 접근하여 getStudentName() 메서드 호출하여
		// 리턴 받은 데이터를 출력
		//---------------------------------------------------
		// System.out.println(studentKim.studentName);	 // <1>
		System.out.println(studentKim.getStudentName()); // <2>
		
		
		/* ===========================================================
		 * new 예약어로 클래스 생성하기
		 * 클래스형 변수이름 = new 생성자;
		 * 클래스가 생성된다는 것은 클래스를 실제 사용할 수 있도록 메모리 공간(힙 메모리)을 할당 받는다는 뜻
		 * 인스턴스: 실제로 사용할 수 있도록 생성된 클래스를 말한다. 즉, 클래스가 메모리 공간에 생성된 상태이다
		 * 		객체라고도 한다.
		 * ===========================================================
		 */
		
	}

}
