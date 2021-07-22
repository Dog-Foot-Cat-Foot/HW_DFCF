package chapter_05_7;

public class Student {
	// 변수 선언 
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() { // private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드 
		return studentName;
	}
	
	public void setStudentName(String studentName) { // 매개변수로 studentName 입력 받기 
		this.studentName = studentName;
	} // private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드 
}
