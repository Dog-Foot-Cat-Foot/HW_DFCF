package day0713.ch06;

public class Ex03_TakeTrans {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// Student형 studentKim 참조 변수 선언과 동시에 
		// "Kim", 5000 데이터를 매개변수로 받는 생성자를 호출하여
		// 생성한 Student 인스턴스의 메모리 위치 주소값 대입
		//---------------------------------------------------
		Student studentKim = new Student("Kim", 5000);
		Student studentPark = new Student("Park", 10000);
		
		//---------------------------------------------------
		// <1> Bus형 bus100 참조 변수 선언과 동시에
		// new 예약어로 생성한 Bus 인스턴스의 메위주 대입
		// <2> studentKim 참조 변수로 Student 인스턴스의 takeBus() 메서드 접근
		// bus100의 데이터를 매개변수로 전달
		// <3> studentKim 참조 변수로 showInfo() 메서드 접근
		// <4> bus100 참조 변수로 showInfo() 메서드 접근
		//---------------------------------------------------
		Bus bus100 = new Bus(100);	// <1>
		studentKim.takeBus(bus100);	// <2>
		studentKim.showInfo();		// <3>
		bus100.showInfo();			// <4>
		
		//---------------------------------------------------
		// <1> Subway형 subwayGreen 참조 변수 선언과 동시에
		// "2호선" 데이터를 매개변수로 받는 생성자를 호출하여
		// 생성한 Subway 인스턴스의 메모리 위치 주소값 대입
		// <2> studentPark 참조 변수로 Subway 인스턴스의 takeSubway() 메서드 접근
		// subwayGreen의 데이터를 매개변수로 전달
		// <3> studentPark 참조 변수로 showInfo() 메서드 접근
		// <4> subwayGreen 참조 변수로 showInfo() 메서드 접근
		//---------------------------------------------------
		Subway subwayGreen = new Subway("2호선");	// <1>
		studentPark.takeSubway(subwayGreen);	// <2>
		studentPark.showInfo();					// <3>
		subwayGreen.showInfo();					// <4>

	}

}
