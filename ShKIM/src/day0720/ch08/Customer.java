package day0720.ch08;

public class Customer {
	
	//-------------------------------------
	// 멤버 변수 선언
	// <1> int형 변수 선언, 고객 아이디 
	// <2> String형 변수 선언, 고객 이름 
	// <3> String형 변수 선언, 고객 등급 
	// <4> int형 변수 선언, 보너스 포인트
	// <5> double형 변수 선언, 적립 비율
	//-------------------------------------
	protected int customerID;		// <1>
	protected String customerName;	// <2>
	protected String customerGrade;	// <3>
	int bonusPoint;					// <4>
	double bonusRatio;				// <5>
	
	//-------------------------------------
	// 디폴트 생성자
	// <1> 기본 등급을 SILVER로 초기화 
	// <2> 적립 비율을 0.01로 초기화
	// <3> 상위 클래스 생성할 때 콘솔 출력문 
	// <4> 고객 등급과 보너스 포인트 적립률 지정 함수 호출
	//-------------------------------------
	public Customer() {
		//-------------------------------------
		// customerGrade = "SILVER";		// <1>
		// bonusRatio = 0.01;				// <2>
		// System.out.println("Customer() 생성자 호출");	// <3>
		//-------------------------------------
		initCustomer();					// <4>
	}
	
	//-------------------------------------
	// <1> 고객 아이디, 고객 이름을 초기화하는 생성자 선언
	// <2> 고객 등급과 보너스 포인트 적립률 지정 함수 호출
	//-------------------------------------	
	public Customer(int customerID, String customerName) {	// <1>
		this.customerID = customerID;
		this.customerName = customerName;
		//-------------------------------------
		// customerGrade = "SILVER";
		// bonusRatio = 0.01;
		// System.out.println("Customer(int, String) 생성자 호출");
		//-------------------------------------
		initCustomer();					// <2>
	}
	
	//-------------------------------------
	// 생성자에서만 호출할 메서드 선언
	// 멤버변수를 초기화한다.
	//-------------------------------------
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//-------------------------------------
	// 보너스 포인트에 가격*적립 비율 계산하여 더한 후
	// 가격 데이터를 리턴해주는 메서드 선언
	//-------------------------------------
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	//-------------------------------------
	// 고객 이름, 고객 등급, 보너스 포인트 데이터를 리턴해 주는 메서드 선언
	//-------------------------------------
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	//-------------------------------------
	// protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록
	// get(), set() 메서드 추가
	//-------------------------------------
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	/* ============================================
	 * protected 예약어
	 * 상속받은 하위 클래스에서는 public 처럼 사용할 수 있고
	 * 상속된 하위 클래스를 제외한 나머지 외부 클래스에서는 
	 * private와 동일한 역할을 한다
	 * ============================================
	 */
	
}
