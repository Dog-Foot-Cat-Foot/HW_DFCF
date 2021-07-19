package day0720.ch11;

//------------------------------------------
// Student 클래스 선언
//------------------------------------------
class Student {
	
	//------------------------------------------
	// <1> int형 변수, 학생 아이디
	// <2> String형 변수, 학생 이름
	//------------------------------------------
	int studentId;			// <1>
	String studentName;		// <2>
	
	//------------------------------------------
	// 학생 아이디와, 학생 이름을 초기화하는 생성자
	//------------------------------------------
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	//------------------------------------------
	// toString() 메서드 오버라이딩
	//------------------------------------------
	public String toString() {
		return studentId + "," + studentName;
	}
	
}

public class Ex02_EqualsTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> Student형 변수 선언, Student 인스턴스 생성 후 메위주 대입
		// <2> Student형 변수 선언, studentKim 변수의 메위주 대입
		// <3> Student형 변수 선언, Student 인스턴스 생성 후 메위주 대입
		//------------------------------------------
		Student studentKim = new Student(100, "김석진");		// <1>
		Student studentKim2 = studentKim;						// <2>
		Student studentJin = new Student(100, "김석진");		// <3>
		
		//------------------------------------------
		// <1> studentKim 변수와 studentKim2 변수 == 비교, studentKim과 studentKim2의 주소는 같습니다.
		// <2> studentKim 변수와 studentKim2 변수 equals 비교, studentKim과 studentKim2는 동일합니다.
		// <3> studentKim 변수와 studentJin 변수 == 비교, studentKim과 studentJin의 주소는 다릅니다.
		// <4> studentKim 변수와 studentJin 변수 equals 비교, studentKim과 studentJin의 동일하지 않습니다.
		//------------------------------------------
		if(studentKim == studentKim2) {					// <1>
			System.out.println("studentKim과 studentKim2의 주소는 같습니다.");
		} else {
			System.out.println("studentKim과 studentKim2의 주소는 다릅니다.");
		}
		
		if(studentKim.equals(studentKim2)) {			// <2>
			System.out.println("studentKim과 studentKim2는 동일합니다.");
		} else {
			System.out.println("studentKim과 studentKim2는 동일하지 않습니다.");
		}
		
		if(studentKim == studentJin) {					// <3>
			System.out.println("studentKim과 studentJin의 주소는 같습니다.");
		} else {
			System.out.println("studentKim과 studentJin의 주소는 다릅니다.");
		}
		
		if(studentKim.equals(studentJin)) {				// <4>
			System.out.println("studentKim과 studentJin의 동일합니다.");
		} else {
			System.out.println("studentKim과 studentJin의 동일하지 않습니다.");
		}
		
		/* ========================================
		 * equals() 메서드
		 * 두 인스턴스의 주소 값을 비교하여 boolean 값(true/false)을 반환해 주는 것이다.
		 * 물리적 동일성(인스턴스의 메모리 주소가 같음)뿐 아니라 
		 * 논리적 동일성(논리적으로 두 인스턴스가 같음)을 구현할 때도 equals() 메서드를 재정의하여 사용
		 * 
		 * ==
		 * 단순히 물리적으로 같은 메모리 주소인지 여부를 확인할 수 있다.
		 * ========================================
		 */
		
	}

}
