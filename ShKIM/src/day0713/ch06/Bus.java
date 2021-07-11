package day0713.ch06;

public class Bus {
	
	// 멤버 변수
	int busNumber;		// 버스 번호
	int passengerCount; // 승객 수
	int money;			// 버스 수입
	
	// 메서드
	// 생성자
	// busNumber 데이터를 매개변수로 받아 
	// 멤버 변수 busNumber의 데이터를 초기화하며 인스턴스를 생성한다
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승객이 버스에 탄 경우를 구현한 메서드
	// 메서드 호출 시 매개변수로 받은 데이터를 생성된 인스턴스의 money 멤버 변수에 더한다
	// passengerCount 멤버 변수 데이터를 1 증가시킨다
	public void take(int money) {
		this.money += money;	// 버스 수입 증가
		passengerCount++;		// 승객 수 증가
	}
	
	// 버스 정보를 출력하는 메서드
	public void showInfo() {
		// busNumber, passengerCount, money의 멤버 변수 데이터 출력
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount 
				+ "명이고, 수입은 " + money + "입니다.");
	}

}
