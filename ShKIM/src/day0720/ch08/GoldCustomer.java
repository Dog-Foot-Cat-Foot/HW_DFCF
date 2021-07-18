package day0720.ch08;

//-------------------------------------
// Customer 클래스를 상속받은 GoldCustomer 클래스 선언
//-------------------------------------
public class GoldCustomer extends Customer {

	//-------------------------------------
	// double형 변수 선언, 할인율
	//-------------------------------------
	double saleRatio;
	
	//-------------------------------------
	// 아이디와, 이름을 매개변수로 받는 생성자 선언
	//-------------------------------------
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	//-------------------------------------
	// calcPrice 메서드 오버라이딩
	//-------------------------------------
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
