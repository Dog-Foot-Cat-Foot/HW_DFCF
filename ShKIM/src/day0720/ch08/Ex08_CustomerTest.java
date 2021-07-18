package day0720.ch08;

public class Ex08_CustomerTest {

	public static void main(String[] args) {

		// -------------------------------------
		// <1> Customer형 변수에 생성한 Customer 인스턴스의 메위주 대입
		// <2, 3, 4> 고객 아이디, 이름, 보너스포인트 초기화
		// <5> 정보 보여주기
		// 출력: 김석진 님의 등급은 SILVER이며, 보너스 포인트는 1000입니다.
		// -------------------------------------
		Customer customerKim = new Customer();				// <1>
		customerKim.setCustomerID(10010);					// <2>
		customerKim.setCustomerName("김석진");				// <3>
		customerKim.bonusPoint = 1000;						// <4>
		System.out.println(customerKim.showCustomerInfo());	// <5>

		// -------------------------------------
		// <1> Customer형 변수에 생성한 VIPCustomer 인스턴스의 메위주 대입
		// <2> 보너스포인트 초기화
		// <3> 정보 보여주기, 오버라이딩 된 VIPCustomer 인스턴스의 메소드 호출
		// 출력: 박지민 님의 등급은 VIP이며, 보너스 포인트는 1000입니다.담당 상담원 번호는 123입니다.
		// -------------------------------------
		Customer customerPark = new VIPCustomer(10020, "박지민", 123);	// <1>
		customerPark.bonusPoint = 1000;									// <2>
		System.out.println(customerPark.showCustomerInfo());			// <3>
		
		// -------------------------------------
		// <1> int형 변수 price 선언과 동시에 10000 데이터 대입
		// <2> int형 변수 kimPrice 선언과 동시에 메서드 호출하여 받은 리턴값 대입
		// <3> int형 변수 parkPrice 선언과 동시에 메서드 호출하여 받은 리턴값 대입
		// 생성한 인스턴스의 메서드가 호출되므로 오버라이딩 된 메서드가 호출된다.
		// -------------------------------------
		int price = 10000;
		int kimPrice = customerKim.calcPrice(price);
		int parkPrice = customerPark.calcPrice(price);
		
		// -------------------------------------
		// <1> 출력: 김석진 님이 10000원 지불하셨습니다.
		// <2> 출력: 김석진 님의 등급은 SILVER이며, 보너스 포인트는 1100입니다.
		// <3> 출력: 박지민 님이 9000원 지불하셨습니다.
		// <4> 출력: 박지민 님의 등급은 VIP이며, 보너스 포인트는 1500입니다.담당 상담원 번호는 123입니다.
		// -------------------------------------
		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerPark.getCustomerName() + " 님이 " + parkPrice + "원 지불하셨습니다.");
		System.out.println(customerPark.showCustomerInfo());
		
		
		/* =======================================
		 * 정리
		 * 상속 관계에 있는 상위 클래스와 하위 클래스는 같은 상위 클래스 자료형으로 선언되어
		 * 생성할 수 있지만 재정의된 메서드는 각각 호출될 뿐만 아니라 
		 * 이름이 같은 메서드가 서로 다른 역할을 구현하고 있다.
		 * =======================================
		 */
		
	}

}
