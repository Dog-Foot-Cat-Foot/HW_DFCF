package day0713.ch07;

public class Ex14_StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 50);
		
		Student studentPark = new Student(1002, "Park");
		studentPark.addSubject("국어", 70);
		studentPark.addSubject("수학", 85);
		studentPark.addSubject("영어", 100);
		
		studentKim.showStudentInfo();
		System.out.println("==========================");
		studentPark.showStudentInfo();
		
	}

}
