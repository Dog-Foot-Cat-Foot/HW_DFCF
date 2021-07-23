package day0720.ch11;

public class Person {
	
	//------------------------------------------
	// <1> private 접근 지정자를 가진 String형 name 멤버 변수 선언, 이름
	// <2> private 접근 지정자를 가진 int형 age 멤버 변수 선언, 나이
	//------------------------------------------
	private String name;		// <1>
	private int age;			// <2>
	
	//------------------------------------------
	// 디폴트 생성자
	//------------------------------------------
	public Person() {}
	
	//------------------------------------------
	// 이름만 입력받는 생성자
	//------------------------------------------
	public Person(String name) {
		this.name = name;
	}
	
	//------------------------------------------
	// 이름, 나이를 입력받는 생성자
	//------------------------------------------
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//------------------------------------------
	// get(), set() 메서드 선언
	//------------------------------------------
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
