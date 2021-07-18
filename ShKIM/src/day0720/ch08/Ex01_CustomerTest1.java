package day0720.ch08;

public class Ex01_CustomerTest1 {

	public static void main(String[] args) {

		//-------------------------------------
		// <1> Customer형 변수 선언과 동시에 Customer() 생성자를 호출, 인스턴스 생성하여
		// 인스턴스의 메모리 위치 주소값을 대입한다.
		// <2> customerKim 변수의 메모리 위치 주소값으로 setCustomerID() 메서드 호출하여 10010 데이터 전달
		// customerID 변수는 protected 변수이므로 set() 메서드 호출
		// <3> 2와 동일
		// <4> 생성된 Customer 인스턴스의 bonusPoint 멤버 변수에 1000 데이터 초기화
		// <5> showCustomerInfo() 의 리턴값을 화면에 출력, 고객정보가 나온다
		// 출력: 김석진 님의 등급은 SILVER이며, 보너스 포인트는 1000입니다.
		//-------------------------------------
		// Customer customerKim = new Customer();			// <1>
		Customer customerKim = new Customer(10010, "김석진");			
		customerKim.setCustomerID(10010);					// <2>
		customerKim.setCustomerName("김석진");				// <3>
		customerKim.bonusPoint = 1000;						// <4>
		System.out.println(customerKim.showCustomerInfo());	// <5>
		
		//-------------------------------------
		// <1> VIPCustomer형 변수 선언과 동시에 VIPCustomer() 생성자를 호출, 인스턴스 생성하여
		// 인스턴스 메모리 위치 주소값을 대입한다.
		// <2> customerPark 변수의 메모리 위치 주소값으로 setCustomerID() 메서드 호출하여 10020 데이터 전달
		// <3> 2와 동일
		// <4> 생성된 VIPCustomer 인스턴스의 bonusPoint 멤버 변수에 1000 데이터 초기화
		// <5> showCustomerInfo() 의 리턴값을 화면에 출력, 고객정보가 나온다
		// 출력: 박지민 님의 등급은 VIP이며, 보너스 포인트는 10000입니다.
		//-------------------------------------
		// VIPCustomer customerPark = new VIPCustomer();	// <1>
		VIPCustomer customerPark = new VIPCustomer(10020, "박지민", 123);		
		customerPark.setCustomerID(10020);					// <2>
		customerPark.setCustomerName("박지민");				// <3>
		customerPark.bonusPoint = 10000;					// <4>
		System.out.println(customerPark.showCustomerInfo());// <5>
		
	}

}
