package day0713.ch06;

// 생년월일 BirthDay 클래스
class BirthDay {
	
	// 멤버 변수
	int day;
	int month;
	int year;
	
	// 태어난 연도를 지정하는 메서드
	public void setYear(int year) {
		// bDay.year = year; 와 같음
		// 생성된 인스턴스의 맴버 변수에 매개변수로 받은 데이터 대입
		this.year = year;
	}
	
	// this 출력 메서드
	public void printThis() {
		// System.put.println(bDay); 와 같음
		// 생성된 인스턴스의 정보 출력
		System.out.println(this);
	}
	
	/*
	 * this 예약어
	 * 생성된 인스턴스 스스로를 가리키는 예약어이다
	 * 생성된 인스턴스 자신을 가리키는 역할을 한다
	 */
	
}

public class Ex01_ThisExample {

	public static void main(String[] args) {
		
		// BirthDay형 참조변수 bDay 선언과 동시에 BirthDay 객체 메모리 위치 주소값 대입
		BirthDay bDay = new BirthDay();
		// bDay 변수의 2000 데이터를 매개변수로 전달하며 setYear() 메서드를 호출
		bDay.setYear(2000);
		// bDay 변수 객체 정보 출력
		System.out.println(bDay); // 클래스 이름@메모리 주소
		// bDay의 printThis() 메서드 호출
		bDay.printThis(); 		// this 출력, 클래스 이름@메모리 주소

	}

}
