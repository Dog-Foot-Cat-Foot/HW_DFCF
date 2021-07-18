package day0720.ch08;

//-------------------------------------
// VIPCustomer 클래스가 Customer 클래스를 상속 받음
//-------------------------------------
public class VIPCustomer extends Customer {
	
	//-------------------------------------
	// 멤버 변수 선언
	// int형 변수 선언, VIP 고객 상담원 아이디
	// double형 변수 선언, 할인율 
	//-------------------------------------
	private int agentID;
	double saleRatio;

	/*
	public VIPCustomer() {
		//-------------------------------------
		// <1> 상위 클래스인 Customer 클래스의 customerGrade 변수는 
		// private 변수로, 하위 클래스에서 사용 시 오류가 발생한다.
		// The field Customer.customerGrade is not visible
		// <2> 상위 클래스 변수를 private -> protected 로 변경
		// customerGrade 변수를 VIP 데이터로 초기화
		// <3> bonusRatio 변수를 0.05 데이터로 초기화
		// <4> saleRatio 변수를 0.1 데이터로 초기화
		// <5> 하위 클래스 생성할 때 콘솔 출력문
		//-------------------------------------
		// customerGrade = "VIP";	// <1>
		customerGrade = "VIP";		// <2>
		bonusRatio = 0.05;			// <3>
		saleRatio = 0.1;			// <4>
		System.out.println("VIPCustomer() 생성자 호출");	// <5>
	}
	*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//-------------------------------------
		// <1> 상위 클래스 생성자 호출
		// <2> 상위 클래스 변수를 private -> protected 로 변경
		// customerGrade 변수를 VIP 데이터로 초기화
		// <3> bonusRatio 변수를 0.05 데이터로 초기화
		// <4> saleRatio 변수를 0.1 데이터로 초기화
		// <5> 매개변수로 받은 데이터로 agentID 변수 초기화
		// <6> 하위 클래스 생성할 때 콘솔 출력문
		//-------------------------------------
		super(customerID, customerName);	// <1>
		customerGrade = "VIP";				// <2>
		bonusRatio = 0.05;					// <3>
		saleRatio = 0.1;					// <4>
		this.agentID = agentID;				// <5>
		// System.out.println("VIPCustomer(int, String, int) 생성자 호출");	// <6>
	}
	
	//-------------------------------------
	// agentID 값을 가져오는 get() 메서드 선언
	//-------------------------------------
	public int getAgentID() {
		return agentID;
	}
	
	//-------------------------------------
	// 재정의한 메서드(메서드 오버라이딩)
	// 상위 클래스인 Customer 의 메서드를 재정의함
	//-------------------------------------
	@Override
	public int calcPrice(int price) {
		//-------------------------------------
		// <1> 보너스 포인트 적립
		// <2> 할인된 가격을 계산하여 반환
		//-------------------------------------
		bonusPoint += price * bonusRatio;			// <1>
		return price - (int)(price * saleRatio);	// <2>
	}
	
	//-------------------------------------
	// 고객 정보 출력 메서드 오버라이딩
	// 상위 클래스의 showCustomerInfo() 메서드의 리턴값에 더하여
	// 담당 상단원 번호를 추가로 리턴한다.
	//-------------------------------------
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}

	
	/* ========================================
	 * 상속(inheritnace)
	 * 객체 지향 프로그래밍의 중요한 특징 중 하나로,
	 * extends 예약어를 사용하여 구현한다.
	 * 상속 관계에서는 상위 클래스가 하위 클래스보다 일반적인 개념이고,
	 * 하위 클래스는 상위 클래스보다 구체적인 클래스가 된다.
	 * 
	 * super 예약어
	 * 하위 클래스에서 상위 클래스로 접근할 때 사용한다.
	 * super는 상위 클래스의 생성자를 호출하는 데도 사용한다.
	 * 
	 * 메서드 오버라이딩(method overriding)
	 * 상위 클래스에서 정의한 메서드가 하위 클래스에서 구현할 내용과 맞지 않을 경우
	 * 하위 클래스에서 이 메서드를 재정의하는 걸 말한다.
	 * 반환형, 메서드 이름, 매개변수, 매개변수 자료형이 반드시 같아야 한다.(즉, 선언부 동일)
	 * 
	 * 애노테이션(Annotation)
	 * @ 기호와 함께 사용하며, 컴파일러에게 특정한 정보를 제공해 주는 역할을 한다
	 * @Override: 재정의된 메서드라는 정보 제공
	 * @FunctionalInterface: 함수형 인터페이스라는 정보 제공
	 * @Deprecated: 이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용됨
	 * @SuppressWarnings: 특정 경고가 나타나지 않도록 함
	 * ========================================
	 */
}