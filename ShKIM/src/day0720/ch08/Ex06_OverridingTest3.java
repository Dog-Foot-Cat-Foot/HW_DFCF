package day0720.ch08;

public class Ex06_OverridingTest3 {

	public static void main(String[] args) {
		
		// -------------------------------------
		// int형 변수 price 선언과 동시에 10000 데이터 초기화
		// -------------------------------------
		int price = 10000;
		
		// -------------------------------------
		// <1> Customer 인스턴스 생성
		// <2> 출력: 김석진님이 지불해야 하는 금액은 10000원입니다.
		// <3> VIPCustomer 인스턴스 생성
		// <4> 출력: 박지민님이 지불해야 하는 금액은 9000원입니다.
		// <5> VIPCustomer 인스턴스를 Customer형으로 변환
		// <6> 출력: 나몰라 님이 지불해야 하는 금액은 9000원입니다.
		// 변수 선언 시 사용한 자료형의 메서드가 아닌 생성된 인스턴스의 메서드가 호출된다.
		// 이를 가상 메서드라 하며, 자바의 모든 메서드는 가상 메서드이다. 
		// -------------------------------------
		Customer customerKim = new Customer(10010, "김석진");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerKim.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerPark = new VIPCustomer(10020, "박지민", 12345); 
		System.out.println(customerPark.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerPark.calcPrice(price) + "원입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 "
				+ vc.calcPrice(10000) + "원입니다.");

	}

}
