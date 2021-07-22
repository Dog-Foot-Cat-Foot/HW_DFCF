package chapter_06;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 han = new Student2(); // 객체 생성 
		han.setStudentName("한승태");    // 이름 지정 
		// 학번을 가져오기 위해 get 메서드를 클래스이름으로 호출
		// serialNum을 직접 참조하지 않고 getSerialNum()메서드를 호출하여 참조 
		System.out.println(Student2.getSerialNum()); 
		// han.serialNum++; static 변수에 증감연산자  
		System.out.println(han.studentName + "학번:" + han.studentId);
		
		
		Student2 han1 = new Student2(); // 객체 생성 
		han1.setStudentName("한승혁");	// 이름 지정 
		// 학번을 가져오기 위해 get 메서드를 클래스이름으로 호출
		System.out.println(Student2.getSerialNum());  
		System.out.println(han1.studentName + "학번:" + han1.studentId);
	}

}
