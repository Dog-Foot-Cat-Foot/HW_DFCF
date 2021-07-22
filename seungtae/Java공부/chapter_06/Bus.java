package chapter_06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { // 버스의 번호를 매개변수로 받는 생성자 
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // 승객이 버스에 탄 경우를 구현한 메서드 
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() { // 버스 정보를 출력하는 메서드 
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + 
							"명이고, 수입은" + money + "입니다.");
	}
}
