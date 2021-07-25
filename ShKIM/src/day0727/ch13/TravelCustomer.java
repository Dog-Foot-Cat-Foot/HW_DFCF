package day0727.ch13;

public class TravelCustomer {

	//------------------------------------------
	// <1> String형 name 멤버 변수 선언, 고객 이름
	// <2> int형 age 멤버 변수 선언, 나이
	// <3> int형 price 멤버 변수 선언, 가격
	//------------------------------------------
	private String name;
	private int age;
	private int price;
	
	//------------------------------------------
	// 고객 이름, 나이, 가격을 초기화하는 생성자 선언
	//------------------------------------------
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	//------------------------------------------
	// get() 메서드 선언
	//------------------------------------------
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	//------------------------------------------
	// toString() 메서드 오버라이딩
	// 고객 이름, 나이, 가격을 String형으로 리턴한다.
	//------------------------------------------
	@Override
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price;
	}
	
}
