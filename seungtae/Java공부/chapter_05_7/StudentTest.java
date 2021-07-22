package chapter_05_7;

public class StudentTest {

	public static void main(String[] args) {
		Student studentHan = new Student();
		// studentHan.studentName = "한승태"; // 오류발생 
		// student클래스 파일에서 studentName의 접근제어자가 private이기 때문에 외부에서 사용불가.
		studentHan.setStudentName( "한승태");
		//위 처럼 setStudentName() 메서드를 활용해 private 변수에 접근 가능. 
		
		
		System.out.println(studentHan.getStudentName());
	}

}
