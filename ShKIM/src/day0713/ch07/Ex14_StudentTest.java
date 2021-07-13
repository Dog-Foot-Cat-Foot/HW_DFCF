package day0713.ch07;

public class Ex14_StudentTest {

	public static void main(String[] args) {

		//---------------------------------------------------
		// <1> Student형 studentKim 변수 선언과 동시에
		// new 예약어를 사용하여 Student(1001, "Kim") 매개변수가 있는 생성자
		// 호출, 생성된 Student 인스턴스의 메모리 위치 주소값을 변수에 대입
		// <2> 생성된 변수의 메모리 위치 주소값으로 addSubject() 메서드 호출하여
		// 매개변수로 "국어", 100 데이터 넘겨줌
		//---------------------------------------------------
		Student studentKim = new Student(1001, "Kim");	// <1>
		studentKim.addSubject("국어", 100);				// <2>
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
