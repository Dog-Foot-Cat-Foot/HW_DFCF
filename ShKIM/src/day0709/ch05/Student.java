package day0709.ch05;

// public: 접근 제어자
// class: 클래스를 만드는 예약어
// Student: 클래스 이름, 대문자로 시작함
public class Student {
	
	// 멤버 변수(member variable): 클래스의 속성(property), 특성(attribute)
	int studentID;		 // 학번
	String studentName;  // 학생 이름
	int grade;			 // 학년
	String address;		 // 사는 곳
	
	// 멤버 함수(member function): 멤버 변수를 사용하여 클래스 기능을 구현한 것, 메서드(method)
	// 함수 반환형: void
	// 함수명: showStudentInfo
	// 매개변수: 없음
	// 기능: 학생의 이름과 주소를 출력
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); // 이름, 주소 출력
	}
	
	// 메서드(method) : 클래스 내부에서 사용하는 멤버 함수를 말하며 함수에 객체 지향 개념이 포함된 용어이다
	// 함수 반환형: String
	// 함수명: getStudentName
	// 매개변수: 없음
	// 기능: studentName을 반환
	public String getStudentName() {
		return studentName;
	}
	
	// 함수 반환형: void (없음)
	// 함수명: setStudentName
	// 매개변수: String name
	// 기능: 매개변수로 받은 String형 데이터를 studentName 멤버 변수에 대입함
	public void setStudentName(String name) {
		studentName = name;
	}
	
	/*
	 * 메서드 이름 명명: 해당 클래스를 사용하느 코드의 입장에서 짓는 것이 좋다
	 * 클래스 이름: 대문자로 시작
	 * public 클래스: 자바 파일에서 하나만 있어야 함, public 클래스 이름과 자바 파일 이름은 같아야 함
	 * 패키지 이름: 모두 소문자
	 */
	
}
