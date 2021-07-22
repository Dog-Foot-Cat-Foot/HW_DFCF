package chapter_06;

public class StudentTest1 {

	public static void main(String[] args) {
		Student1 han = new Student1(); // 객체 생성 
		han.setStudentName("한승태");    // 이름 지정 
		System.out.println(han.serialNum); // 학생이 한명 생성되었기 때문에 +1 
		// han.serialNum++; static 변수에 증감연산자  
		System.out.println(han.studentName + "학번:" + han.studentId);
		
		
		Student1 han1 = new Student1(); // 객체 생성 
		han1.setStudentName("한승혁");	// 이름 지정 
		System.out.println(han1.serialNum); // 학생이 생성되었기 때문에 +1 
		System.out.println(han1.studentName + "학번:" + han1.studentId);
	}

}
