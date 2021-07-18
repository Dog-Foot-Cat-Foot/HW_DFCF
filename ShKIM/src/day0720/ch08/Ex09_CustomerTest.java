package day0720.ch08;
import java.util.ArrayList;

public class Ex09_CustomerTest {

	public static void main(String[] args) {
		
		//-------------------------------------
		// <1> Customer형으로 객체 배열 ArrayList 선언
		// <2> Customer형으로 변수 선언과 동시에 Customer 인스턴스 메위주 대입
		// <3> Customer형으로 변수 선언과 동시에 GoldCustomer 인스턴스 업캐스팅하여 메위주 대입
		// <4> Customer형으로 변수 선언과 동시에 VIPCustomer 인스턴스 업캐스팅하여 메위주 대입
		//-------------------------------------
		ArrayList<Customer> customerList = new ArrayList<Customer>();	// <1>
		
		Customer customerLee = new Customer(10010, "이순신");			// <2>
		Customer customerShin = new Customer(10020, "신사임당");		// <2>
		Customer customerHong = new GoldCustomer(10030, "홍길동");		// <3>
		Customer customerYoul = new GoldCustomer(10040, "이율곡");		// <3>
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);	// <4>
		
		//-------------------------------------
		// ArrayList에 인스턴스 추가
		// Customer형으로 업캐스팅되어 저장된다.
		//-------------------------------------
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		//-------------------------------------
		// 고객 정보 출력
		// 이순신 님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
		// 신사임당 님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
		// 홍길동 님의 등급은 GOLD이며, 보너스 포인트는 0입니다.
		// 이율곡 님의 등급은 GOLD이며, 보너스 포인트는 0입니다.
		// 김유신 님의 등급은 VIP이며, 보너스 포인트는 0입니다.담당 상담원 번호는 12345입니다.
		//-------------------------------------
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		//-------------------------------------
		// int형 변수 선언과 동시에 10000 데이터 대입
		//-------------------------------------
		int price = 10000;
		
		//-------------------------------------
		// <1> int형 변수 선언과 동시에 calcPrice(price) 메서드 호출하여 리턴값 대입
		// 생성된 인스턴스의 메서드가 호출된다.
		// <2> 고객별 지불 금액 출력
		// <3> 고객별 보너스 포인트 출력
		// 현재 이 변수의 실제 인스턴스가 무엇이냐에 따라 재정의한 메서드를 각각 호출하여 계산한다(다형성)
		//-------------------------------------
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 "
					+ customer.bonusPoint + "점입니다.");
		}
		
		
		//-------------------------------------
		// 이순신 님이 10000원 지불하셨습니다.
		// 이순신 님의 현재 보너스 포인트는 100점입니다.
		// 신사임당 님이 10000원 지불하셨습니다.
		// 신사임당 님의 현재 보너스 포인트는 100점입니다.
		// 홍길동 님이 9000원 지불하셨습니다.
		// 홍길동 님의 현재 보너스 포인트는 200점입니다.
		// 이율곡 님이 9000원 지불하셨습니다.
		// 이율곡 님의 현재 보너스 포인트는 200점입니다.
		// 김유신 님이 9000원 지불하셨습니다.
		// 김유신 님의 현재 보너스 포인트는 500점입니다.
		//-------------------------------------

	}

}
