package day0713.ch05;

// public: 접근 제어자
// class: 클래스를 만드는 예약어
// Student: 클래스 이름, 대문자로 시작함
public class Student {
	
	//---------------------------------------------------
	// 멤버 변수(member variable)
	// 클래스의 속성(property), 특성(attribute)
	// <1> 학번
	// <2> 학생 이름
	// <3> private 선언 학생 이름
	// <4> 학년
	// <5> 사는 곳 
	// <6> Subject형 참조변수 선언(국어 성적 관리)
	// <7> Subject형 참조변수 선언(수학 성적 관리)
	//---------------------------------------------------
	int studentID;		 		// <1>
	// String studentName;      // <2>
	private String studentName; // <3>
	int grade;			 		// <4>
	String address;		 		// <5>
	
	/* Subject 클래스로 분리 
	int koreaScore;		 // 국어 성적
	int mathScore;		 // 수학 성적
	String koreaSubject; // 국어 과목
	String mathSubject;  // 수학 과목
	*/
	
	Subject korean;		 // <6>
	Subject math; 		 // <7>
	
	//---------------------------------------------------
	// 멤버 함수(member function): 멤버 변수를 사용하여 클래스 기능을 구현한 것, 메서드(method)
	// 함수 반환형: void
	// 함수명: showStudentInfo
	// 매개변수: 없음
	// 기능: 학생의 이름과 주소를 출력
	//---------------------------------------------------
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); // 이름, 주소 출력
	}
	
	//---------------------------------------------------
	// 메서드(method) : 클래스 내부에서 사용하는 멤버 함수를 말하며 함수에 객체 지향 개념이 포함된 용어이다
	// 함수 반환형: String
	// 함수명: getStudentName
	// 매개변수: 없음
	// 기능: studentName을 반환
	// private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드
	//---------------------------------------------------
	public String getStudentName() {
		return studentName;
	}
	
	//---------------------------------------------------
	// 함수 반환형: void (없음)
	// 함수명: setStudentName
	// 매개변수: String name
	// 기능: 매개변수로 받은 String형 데이터를 studentName 멤버 변수에 대입함
	// private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드
	//---------------------------------------------------
	public void setStudentName(String name) {
		studentName = name;
	}
	
	/* ====================================================
	 * 메서드 이름 명명: 해당 클래스를 사용하느 코드의 입장에서 짓는 것이 좋다
	 * 클래스 이름: 대문자로 시작
	 * public 클래스: 자바 파일에서 하나만 있어야 함, public 클래스 이름과 자바 파일 이름은 같아야 함
	 * 패키지 이름: 모두 소문자
	 * 
	 * 접근 제어자(access modifier)
	 * 클래스 내부의 변수나 메서드, 생성자에 대한 접근 권한을 지정할 수 있는 예약어를 말한다
	 * 
	 * get(), set() 메서드
	 * 보통 private로 선언한 변수를 외부 코드에서 사용하려고 선언하는 메서드
	 * 값을 얻는 get() 메서드를 getter, 값을 지정하는 set() 메서드를 setter라 부른다
	 * 
	 * 정보 은닉(information hiding)
	 * 객체 지향에서 클래스 내부에서 사용할 변수나 메서드를 private으로 선언해서 외부에서 접근하지 못하도록 하는 것을 말한다
	 * 객체 지향 프로그래밍의 특징 중 하나이다
	 * 
	 * 접근 제어자 정리
	 * public: 외부 클래스 어디에서나 접근할 수 있다
	 * protected: 같은 패키지 내부와 상속 관계의 클래스에서만 접근할 수 있고 그 외 클래스에서는 접근할 수 없다
	 * 아무것도 없음: default, 같은 패키지 내부에서만 접근할 수 있다
	 * private: 같은 클래스 내부에서만 접근할 수 있다
	 * ====================================================
	 */
	
}
