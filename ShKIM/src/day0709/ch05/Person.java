package day0709.ch05;

// Person 클래스 생성
public class Person {
	
	// 멤버 변수
	String name;	  // 이름
	float height;	  // 키
	float weight;	  // 몸무게
	char gender;	  // 성별
	boolean married;  // 결혼 여부
	
	// 자바 컴파일러가 자동으로 제공하는 디폴트 생성자이다
	// 따로 생성자를 만들지 않아도 8행처럼 자동으로 디폴트 생성자가 만들어진다
	// 단, 생성자가 하나도 없는 경우에만 디폴트 생성자를 제공한다
	public Person() {}
	
	// 생성자
	// 매개변수: String pname
	// 기능: 객체 생성 시 name 멤버 변수에 매개변수로 받은 String 객체 데이터의 메모리 위치 주소값 대입
	public Person(String pname) {
		name = pname;
	}
	
	// 생성자
	// 매개변수: String pname, float pheight, float pweight
	// 기능: 객체 생성 시 매개변수로 받은 데이터를 name, height, weight 멤버 변수에 초기화
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	/*
	 * 멤버 변수를 선언할 때 자료형 지정
	 * - 기본 자료형 
	 * - 클래스형(객체 자료형, 참조 자료형)
	 * 
	 * 디폴트 생성자(default constructor)
	 * 생성자는 클래스를 생성할 때만 호출
	 * 생성자 이름은 클래스와 같고, 반환값이 없다
	 * 생성자가 없는 클래스는 클래스 파일을 컴파일할 때 자바 컴파일러에서 자동으로 생성자를 만들어 준다
	 * 이렇게 자동으로 만들어 주는 생성자를 디폴트 생성자라 한다
	 * 
	 * 생성자가 하는 일
	 * 멤버 변수에 대한 값들을 매개변수로 받아서 인스턴스가 새로 생성될 때 멤버 변수 값들을 초기화하는 역할
	 * 인스턴스가 생성됨과 동시에 멤버 변수의 값을 지정하고 인스턴스를 초기화하기 위해 생성자를 직접 구현하여 사용
	 * 
	 * 생성자 오버로드(constructor overload)
	 * 클래스에 생성자가 2개 이상 제공되는 경우를 말한다
	 * 필요에 따라 매개변수가 다른 생성자를 여러 개 만들 수 있다
	 */
	
}