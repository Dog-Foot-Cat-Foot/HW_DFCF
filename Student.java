package chapter_07_4;
// 자바의 내장 객체 ArrayList를 사용하기 위해 import
import java.util.ArrayList;

public class Student {
	// Student 클래스 구현 
	
	// 인스턴스변수 선언 
	int studentID;
	String studentName;
	// SUbject자료형을 사용하는 ArrayList 
	ArrayList<Subject> subjectList;
	
	// 학번과 학생이름을 받는 생성자 
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	// 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드 
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	// 학생 정보를 출력하는 메서드 
	public void showStudentInfo() {
		int total = 0;
		// 배열 요소 값 출력 
		// 향상된 반복문으로 배열 길이 모두 출력 
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생" + studentName + "의" + s.getName() + "과목 성적은" + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
	}
	
}
