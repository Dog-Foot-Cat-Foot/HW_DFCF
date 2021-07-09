package day0709.ch05;

public class Ex02_StudentTest {
	// main() 함수는 자바 가상 머신(Java Virtual Machine: JVM) 이 프로그램을 시작하기 위해 호출하는 함수
	// 클래스 내부에 만들지만, 클래스의 메서드는 아니다
	public static void main(String[] args) {
		// new 예약어로 Student 클래스를 생성하여 메모리 위치 주소값을 studentAhn 변수에 대입한다
		Student studentAhn = new Student();
		// studentAhn 변수의 메모리 위치 주소값을 통해 studentName 멤버변수 접근하여
		// studentName의 멤버 변수에 "안연수" 라는 문자열의 메모리 위치 주소값 대입
		studentAhn.studentName = "안연수";
		
		// studentAhn 변수로 Student 객체에 접근하여 studentName 멤버 변수의 데이터 출력
		System.out.println(studentAhn.studentName);
		// studentAhn 변수로 Student 객체에 접근하여 getStudentName() 메서드 호출하여
		// 리턴 받은 데이터를 출력
		System.out.println(studentAhn.getStudentName());
	}

}
