package chapter_05;

public class Student_144p {

		//멤버변수 선언 
		int studentID;  // 학번 
		String studentName; // 학생이름 
		int grade;	// 학년 
		String address; // 사는 곳  
		
		// 메서드 
		public String getStudentName() {
			return studentName;
		}
		
		// main 함수 
		public static void main(String[] args) {
			Student_144p studentHan = new Student_144p(); // Student 클래스 생성 
			studentHan.studentName = "한승태";
			
			System.out.println(studentHan.studentName);
			System.out.println(studentHan.getStudentName());
			
		}
}
