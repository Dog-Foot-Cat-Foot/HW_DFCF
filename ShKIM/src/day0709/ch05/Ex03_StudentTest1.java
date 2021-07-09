package day0709.ch05;

public class Ex03_StudentTest1 {

	public static void main(String[] args) {
		
		// new 예약어로 Student 생성자를 호출하여 인스턴스를 생성 후
		// Student 객체 참조형 변수 student1 에 생성된 인스턴스의 메모리 위치 주소값 대입
		Student student1 = new Student();
		// student1 참조 변수에 도트(.) 연산자를 사용하여 접근한 Student 객체의 studentName 멤버 변수에
		// "김석진" String 객체의 메모리 위치 주소값을 대입
		student1.studentName = "김석진";
		// student1 참조 변수의 메모리 위치 주소값으로 Student 객체에 접근하여
		// getStudentName() 메서드 호출하여 리턴받은 데이터 출력
		System.out.println(student1.getStudentName()); // 김석진
		
		// new 예약어로 Student 생성자를 호출하여 인스턴스를 생성 후
		// Student 객체 참조형 변수 student2 에 생성된 인스턴스의 메모리 위치 주소값 대입
		Student student2 = new Student();
		// student2 참조 변수에 도트(.) 연산자를 사용하여 접근한 Student 객체의 studentName 멤버 변수에
		// "박지민" String 객체의 메모리 위치 주소값을 대입
		student2.studentName = "박지민";
		// student2 참조 변수의 메모리 위치 주소값으로 Student 객체에 접근하여
		// getStudentName() 메서드 호출하여 리턴받은 데이터 출력
		System.out.println(student2.getStudentName()); // 박지민
		
		// 참조 변수 데이터 출력
		System.out.println(student1); // 클래스 이름@주소 값
		System.out.println(student2);
		
		/*
		 * 인스턴스 여러 개 생성하기
		 * 인스턴스는 하나 이상 만들 수 있다
		 * 
		 * 참조 변수 사용하기
		 * 도트(.) 연산자로 멤버 변수와 메서드를 사용할 수 있다
		 * 참조 변수.멤버 변수
		 * 참조 변수.메서드
		 * 
		 * 인스턴스와 힙 메모리
		 * 인스턴스는 힙 메모리에 생성되고 지역변수는 스택 메모리에 생성된다
		 * 위에서 생성된 두 인스턴스는 각각 다른 메모리 공간을 차지한다
		 * 멤버 변수를 저장하는 공간이 매번 따로 생긴다는 의미이다
		 * 클래스에 선언한 멤버변수를 다른 말로 인스턴스 변수라고 부른다
		 * 
		 * 해시 코드(hash code): 주소 값, 자바 가상 머신에서 객체가 생성되었을 때 생성된 객체에 할당하는 가상 주소 값이다
		 * 
		 * 객체: 객체 지향 프로그램의 대상, 생성된 인스턴스
		 * 클래스: 객체를 프로그래밍하기 위해 코드로 만든 상태
		 * 인스턴스: 클래스가 메모리에 생성된 상태
		 * 멤버 변수: 클래스의 속성, 특성
		 * 메서드: 멤버 변수를 이용하여 클래스의 기능을 구현
		 * 참조 변수: 메모리에 생성된 인스턴스를 가리키는 변수
		 * 참조 값: 생성된 인스턴스의 메모리 주소 값
		 */
		
		
	}

}
