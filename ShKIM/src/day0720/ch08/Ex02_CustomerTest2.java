package day0720.ch08;

public class Ex02_CustomerTest2 {

	public static void main(String[] args) {

		// -------------------------------------
		// <1> VIPCustomer형 변수 선언과 동시에 VIPCustomer() 생성자를 호출, 인스턴스 생성하여
		// 인스턴스 메모리 위치 주소값을 대입한다.
		// <2> customerPark 변수의 메모리 위치 주소값으로 setCustomerID() 메서드 호출하여 10020 데이터 전달
		// <3> 2와 동일
		// <4> 생성된 VIPCustomer 인스턴스의 bonusPoint 멤버 변수에 1000 데이터 초기화
		// <5> showCustomerInfo() 의 리턴값을 화면에 출력, 고객정보가 나온다
		// 출력: Customer() 생성자 호출
		// VIPCustomer() 생성자 호출
		// 박지민 님의 등급은 VIP이며, 보너스 포인트는 10000입니다.
		// -------------------------------------
		// VIPCustomer customerPark = new VIPCustomer();	// <1>
		VIPCustomer customerPark = new VIPCustomer(10020, "박지민", 123);		
		customerPark.setCustomerID(10020);					// <2>
		customerPark.setCustomerName("박지민");				// <3>
		customerPark.bonusPoint = 10000;					// <4>
		System.out.println(customerPark.showCustomerInfo());// <5>
		
		
		/* =======================================
		 * 하위 클래스가 생성되는 과정
		 * 상위 클래스를 상속받은 하위 클래스가 생성될 때는 
		 * 반드시 상위 클래스의 생성자가 먼저 호출된다.
		 * 상위 클래스 생성자가 호출될 때 상위 클래스의 멤버 변수가 메모리에 생성된다.
		 * 
		 * private 변수의 경우 생성은 되지만 하위 클래스에서 접근할 수 없다
		 * =======================================
		 */

	}

}
