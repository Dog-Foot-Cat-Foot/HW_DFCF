package day0713.ch07;
import java.util.ArrayList;

public class Student {
	
	//---------------------------------------------------
	// 멤버 변수
	// <1> 학생 아이디
	// <2> 학생 이름
	// <3> 과목 정보
	// Subject 클래스형으로 ArrayList 선언
	//---------------------------------------------------
	int studentID;					// <1>
	String studentName;				// <2>
	ArrayList<Subject> subjectList; // <3>
	
	//---------------------------------------------------
	// 생성자
	// 매개변수로 받은 데이터를 studentID, studentName 멤버 변수에 초기화한다
	// subjectList 멤버 변수에 Subject형 ArrayList 배열을 생성하여 메위주를 대입한다
	//---------------------------------------------------
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	//---------------------------------------------------
	// 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
	// <1> Subject 인스턴스 생성
	// <2> 전달받은 매개변수 데이터를 생성한 인스턴스의 name 멤버 변수에 대입
	// <3> 전달받은 매개변수 데이터를 생성한 인스턴스의 scorePoint 멤버 변수에 대입
	// <4> subjectList 배열에 생성한 Subject 인스턴스 메위주 추가
	//---------------------------------------------------
	public void addSubject(String name, int score) {
		Subject subject = new Subject();	// <1>
		subject.setName(name);				// <2>
		subject.setScorePoint(score);		// <3>
		subjectList.add(subject);			// <4>
	}
	
	public void showStudentInfo() {
		int total = 0;
		//---------------------------------------------------
		// 배열 요소 값 출력
		// <1> 총점 더하기
		//---------------------------------------------------
		for(Subject s : subjectList) {
			total += s.getScorePoint();		// <1>
			System.out.println("학생 " + studentName + "의 " + s.getName() 
					+ " 과목 성적은 " + s.getScorePoint() + "입니다.");	
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
	
}
