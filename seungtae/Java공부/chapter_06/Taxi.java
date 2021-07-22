package chapter_06;

public class Taxi {
	int taxiNum;    // 인스턴스 변수 선언 
	int passengerCount;
	int money;
	
	public Taxi(int taxiNum) { // 택시 번호를 매개변수 받는 생성자 
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) { // 승객이 택시를 탄 경우를 구현한 메서드 
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시번호" + taxiNum + "번의 승객은" + passengerCount + 
							"명이고, 수입은" + money + "입니다.");
	}

	
	
}
