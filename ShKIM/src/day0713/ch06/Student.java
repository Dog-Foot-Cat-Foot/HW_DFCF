package day0713.ch06;

public class Student {

	// 멤버 변수
	// static 변수는 인스턴스 생성과 상관 없이 먼저 생성된다
	// 공통으로 사용하는 변수를 static 예약어를 사용하여 변수로 선언함
	// public static int serialNum = 1000;  // 일련번호
	
	// 접근 제어자를 private로 변경
	private static int serialNum = 1000;  // 일련번호
	
	public int studentID;		// 아이디
	public String studentName;  // 학생 이름
	public int grade;			// 학년
	public int money;			// 학생이 가지고 있는 돈
	public String address;		// 주소
	
	
	// ========메서드=========
	
	// 생성자
	Student(){
		serialNum++;			// 학생이 생성될 때마다 증가
		studentID = serialNum;  // 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	// 생성자
	// studentName, money를 매개변수로 받아서 인스턴스를 생성한다
	public Student(String studentName, int money) {
		this();
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메서드
	// 반환형: 없음
	// 매개변수: Bus형 데이터
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메서드
	// 반환형: 없음
	// 매개변수: Subway형 데이터
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 학생의 현재 정보를 출력하는 메서드
	public void showInfo() {
		// studentName, money의 데이터 출력
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// serialNum의 get() 메서드
	public static int getSerialNum() {
		int i = 10;
		
		// 클래스 메서드에서는 인스턴스 변수를 사용할 수 없다
		// 인스턴스 변수는 인스턴스가 생성될 때 만들어지기 때문이다
		// 오류: Cannot make a static reference to the non-static field studentName
		// studentName = "김석진";
		
		return serialNum;
	}
	
	// serialNum의 set() 메서드
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	/*
	 * static 변수
	 * 정적 변수라 하며, 프로그램이 실행되어 메모리에 올라갔을 때
	 * 딱 한 번 메모리 공간이 할당된다.
	 * 인스턴스 생성과 상관없이 먼저 생성되고 그 값을 모든 인스턴스가 공유한다.
	 * 클래스 변수(class variable)이라 한다.
	 * 
	 * static 메서드 (=클래스 메서드, class method)
	 * static 변수를 위한 메서드
	 * 지역 변수와 클래스 변수는 사용할 수 있지만, 인스턴스 변수는 사용할 수 없다
	 * 
	 * 일반 메서드에서는 클래스 변수를 사용할 수 있다
	 * 일반 메서드는 인스턴스가 생성될 때 호출되는 메서드이고,
	 * 클래스 변수는 이미 만들어진 변수이기 때문에 일반 메서드에서도 클래스 변수를 호출할 수 있기 때문이다
	 * 
	 * ====변수 유효 범위 정리==========================================================
	 * - 지역 변수(로컬 변수)
	 * 함수 내부 선언, 함수 내부에서만 사용, 스택
	 * 함수가 호출될 때 생성되고 함수가 끝나면 소멸함
	 * 
	 * - 멤버 변수(인스턴스 변수)
	 * 클래스 멤버 변수로 선언
	 * 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능, 힙
	 * 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨
	 * 
	 * - static 변수(클래스 변수)
	 * static 예약어를 사용하여 클래스 내부에 선언
	 * 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능, 데이터 영역
	 * 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨
	 * ==========================================================================
	 */
	
}
