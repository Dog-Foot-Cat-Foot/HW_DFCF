package day0713.ch06;

public class Subway {

	// 멤버 변수
	String lineNumber;		// 지하철 노선
	int passengerCount;		// 승객 수
	int money;				// 수입액
	
	// 메서드
	// 지하철 노선 번호를 매개변수로 받는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객이 지하철에 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 지하철 정보 출력하는 메서드
	public void showInfo() {
		// lineNumber, passengerCount, money 멤버 변수의 데이터 출력
		System.out.println(lineNumber + "의 승객은 " + passengerCount 
				+ "명이고, 수입은 " + money + "입니다.");
	}
	
}
