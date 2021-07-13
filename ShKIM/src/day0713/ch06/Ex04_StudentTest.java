package day0713.ch06;

public class Ex04_StudentTest {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// 클래스 변수와 클래스 메서드는 인스턴스가 생성되지 않아도 사용할 수 있다
		//---------------------------------------------------
		System.out.println(Student.getSerialNum()); // 1000
		
		//---------------------------------------------------
		// <1> Student형 참조 변수 studentKim에 Student 인스턴스 생성하여 메모리 주소값 대입
		// <2> studentKim 참조 변수를 통해 studentName 멤버 변수 대입
		// <3> serialNum 데이터 출력
		// <4> 클래스 이름으로 serialNum 변수 데이터 출력
		// <5> static 메서드
		// <6> serialNum 데이터 1 증가
		//---------------------------------------------------
		Student studentKim = new Student();				// <1>
		studentKim.setStudentName("김석진");				// <2>
		// System.out.println(studentKim.serialNum); 	// <3> 1000
		// System.out.println(Student.serialNum); 		// <4> 1001
		System.out.println(Student.getSerialNum()); 	// <5> 1001
		// studentKim.serialNum++;						// <6>
		
		System.out.println(studentKim.studentName + " 학번: " + studentKim.studentID); 
		// 김석진, 1001
		
		//---------------------------------------------------
		// <1> Student형 참조 변수 studentPark에 Student 인스턴스 생성하여 메모리 주소값 대입
		// <2> studentPark 참조 변수를 통해 studentName 멤버 변수 대입
		// <3> 클래스 이름으로 serialNum 변수 데이터 출력
		// <4> static 메서드
		// <5> serialNum 데이터 출력
		// 동일한 serialNum 을 출력한다.
		// 두 개의 참조 변수가 동일한 변수의 메모리를 가리키기 있기 때문이다
		//---------------------------------------------------
		Student studentPark = new Student();		// <1>
		studentPark.setStudentName("박지민");			// <2>
		// System.out.println(Student.serialNum); 	// <3> 1002
		System.out.println(Student.getSerialNum()); // <4> 1002
		
		System.out.println(studentPark.studentName + " 학번: " + studentPark.studentID); 
		// 박지민, 1002
		
		// System.out.println(studentKim.serialNum);  // <5> 1001
		// System.out.println(studentPark.serialNum); // <5> 1001
		
		/* ===================================================
		 * static 변수 
		 * 같은 클래스에서 생성된 인스턴스들이 같은 값을 공유할 수 있으므로,
		 * 인스턴스 간에 공통으로 사용할 값이 필요한 경우 유용하게 사용할 수 있다
		 * 
		 * 클래스 변수
		 * static 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼저 생성된다
		 * 인스턴스가 아닌 클래스 이름으로도 참조하여 사용할 수 있다.
		 * 보통 클래스 이름과 함께 사용한다 
		 * 
		 * static 메서드
		 * static 변수처럼 인스턴스 참조 변수가 아닌 클래스 이름으로 직접 호출 가능
		 * ===================================================
		 */

	}

}
