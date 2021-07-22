package chapter_06;

public class Student {
	// 인스턴스 변수 선언 
	public String studenName; // 학생이름 
	public int grade; // 학년 
	public int money; // 가지고 있는 돈 
	
	public Student(String studentName, int money) { // 학생 이름과 돈을 매개변수로 받는 생성자 
		this.studenName = studentName;	
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 학생이 버스를 타면 1000원을 지불하는 기능을 구현한 메서드 
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // 학생이 지하철을 타면 1500원을 지불하는 기능을 구현한 메서드 
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) { // 학생이 택시를 타면 1만원 지불하는 기능을 구현한 메서드 
		taxi.take(9000);
		this.money -= 9000;
	}
	
	public void showInfo() {
		System.out.println(studenName + "님의 남은 돈은" + money + "입니다.");
	} // 학생의 현재 정보를 출력하는 메서드 
}
