package day0720.ch08;

public class Ex03_OverridingTest1 {

	public static void main(String[] args) {
		
		// -------------------------------------
		// <1> Customer형 변수 선언과 동시에 new 예약어로 생성자 호출하여 인스턴스 생성,
		// 생성된 인스턴스의 메위주 대입
		// <2> 생성된 인스턴스의 bonusPoint 멤버 변수에 1000 데이터 초기화
		// <3> VIPCustomer형 변수 선언과 동시에 new 예약어로 생성자 호출하여 인스턴스 생성,
		// 생성된 인스턴스의 메위주 대입
		// <4> 생성된 인스턴스의 bonusPoint 멤버 변수에 10000 데이터 초기화
		// -------------------------------------
		Customer customerKim = new Customer(10010, "김석진");	// <1>
		customerKim.bonusPoint = 1000;							// <2>
		
		VIPCustomer customerPark = new VIPCustomer(10020, "박지민", 12345); // <3>
		customerPark.bonusPoint = 10000;									// <4>

		// -------------------------------------
		// <1> int형 변수 price 선언과 동시에 10000 데이터 초기화
		// <2> customerKim이 가지고 있는 메위주로 메서드 호출
		// <3> customerPark이 가지고 있는 메위주로 메서드 호출
		// 출력: (생성자 호출 내용 생략)
		// 김석진님이 지불해야 하는 금액은 10000원입니다.
		// 박지민님이 지불해야 하는 금액은 9000원입니다.
		// -------------------------------------
		int price = 10000;			// <1>
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerKim.calcPrice(price) + "원입니다."); // <2>
		System.out.println(customerPark.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerPark.calcPrice(price) + "원입니다."); // <3>
		
	}

}
