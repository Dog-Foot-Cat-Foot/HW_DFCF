package chapter_07_4;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 성적 출력하기 
		
		// Student 객체 생성 
		// han1 변수에 학번과 이름을 받아 데이터 저장 
		Student han1 = new Student(1001,"한승태");
		// 각 배열에 과목명과 점수를 입력받아 저장 
		han1.addSubject("국어", 100);
		han1.addSubject("영어", 90);
		
		// Student 객체 생성 
		// han2 변수에 학번과 이름을 받아 데이터 저장 
		Student han2 = new Student(1002,"한승혁");
		// 각 배열에 과목명과 점수를 입력받아 저장 
		han2.addSubject("국어", 80);
		han2.addSubject("영어", 80);
		han2.addSubject("과학", 100);
		
		// 학생 정보를 출력하는 메서드 호출 
		han1.showStudentInfo();
		System.out.println("====================");
		han2.showStudentInfo();
	}

}
