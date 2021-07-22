package chapter_06;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) { // 지하철 노선 번호를 매개변수로 받는 생성자 
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // 승객이 지하철에 탄 경우를 구현한 메서드 
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() { // 지하철 정보를 출력하는 메서드 
		System.out.println(lineNumber + "의 승객은" + passengerCount + 
							"명이고, 수입은" + money + "입니다.");
	}
}
