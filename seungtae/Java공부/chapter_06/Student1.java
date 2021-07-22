package chapter_06;

public class Student1 { 
	// 인스턴스 변수 선언 
	// public 있으면 다른 패키지 같은 패키지 어디서든 수입하여 사용가능하다.
	// public 없으면 같은 패키지 내에서만 사용가능하다. 
	public static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() { // 생성자 
		serialNum++;	// 학생이 생길때마다 증가 
		studentId = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여 
	}
	
	public String getStudent() { // 학생의 이름을 외부로 리턴하는 메서드 
		return studentName; 
	}
	
	public void setStudentName(String name) { // 학생의 이름을 지정하는 메서드 
		studentName = name;
	}
	

}
