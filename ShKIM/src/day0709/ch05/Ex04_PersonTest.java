package day0709.ch05;

public class Ex04_PersonTest {

	public static void main(String[] args) {
		// Person()을 생성자라 한다
		Person personLee = new Person();

		// new 예약어를 사용하여 Person() 디폴트 생성자를 호출하여 객체 생성 후
		// Person 클래스형의 객체 참조 변수 personKim 에 생성된 인스턴스의 메모리 위치 주소값 대입
		Person personKim = new Person();
		// personKim 참조 변수로 name 멤버 변수에 "김석진" 데이터 대입
		personKim.name = "김석진";
		// personKim 참조 변수로 weight 멤버 변수에 (float) 75.7 데이터 대입
		personKim.weight = 75.7f;
		// personKim 참조 변수로 height 멤버 변수에 (float) 183.4 데이터 대입
		personKim.height = 183.4f;
		
		// new 예약어를 사용하여 Person("박지민", 175, 60) 을 매개변수로 받는 생성자 호출하여 객체 생성 후
		// Person 클래스형의 객체 참조 변수 personPark 에 생성된 인스턴스의 메모리 위치 주소값 대입
		// 생성된 인스턴스의 멤버 변수 name, weight, height 에는 데이터가 초기화된 상태
		Person personPark = new Person("박지민", 175, 60);
		
		/*
		 * 생성자가 하는 일
		 * 클래스를 처음 만들 때 멤버 변수나 상수를 초기화하는 것
		 */
		
	}

}
