package day0713.ch06;

public class Student {

	// 멤버 변수
	public String studentName;  // 학생 이름
	public int grade;			// 학년
	public int money;			// 학생이 가지고 있는 돈
	
	
	// 메서드
	// 생성자
	// studentName, money를 매개변수로 받아서 인스턴스를 생성한다
	public Student(String studentName, int money) {
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
	
}
