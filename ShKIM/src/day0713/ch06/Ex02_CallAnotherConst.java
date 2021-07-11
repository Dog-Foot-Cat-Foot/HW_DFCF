package day0713.ch06;

// Person 클래스 생성
class Person {
	
	// 멤버 변수 선언
	String name;
	int age;
	
	// 디폴트 생성자
	Person() {
		// this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없다
		// this를 호출한 곳에서 오류 발생: Constructor call must be the first statement in a constructor
		// this.name = "noname";
		// this를 사용하여 Person(String name, int age) 생성자 호출
		this("이름 없음", 1);
	}
	
	// name, age를 매개변수로 받는 생성자
	Person(String name, int age){
		// 인스턴스 생성 시 멤버 변수 name, age에 매개변수로 받은 데이터 대입
		this.name = name;
		this.age = age;
	}
	
	/*
	 * 생성자에서 다른 생성자를 호출하는 this
	 * 클래스에 생성자가 여러 개 있을 때 어떤 생성자에서 다른 생성자를 호출하는 경우가 있다
	 * 다만, 생성자는 클래스가 생성될 때 호출되므로 
	 * 클래스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류가 발생할 수 있다
	 * 디폴트 생성자에서 생성이 완료되는 것이 아니라 this를 사용해 다른 생성자를 호출하기 때문이다
	 * 인스턴스 생성이 되지 않은 시점이기 때문에!!
	 */
	
}

public class Ex02_CallAnotherConst {
	public static void main(String[] args) {
		
		// Person형 참조 변수 noName 선언과 동시에 
		// Person 클래스의 디폴트 생성자 호출하여 생성한 인스턴스의 메모리 위치 주소값 대입
		Person noName = new Person();
		System.out.println(noName.name); // noName 참조 변수로 name 멤버 변수 데이터 가져옴
		System.out.println(noName.age);  // noName 참조 변수로 age 멤버 변수 데이터 가져옴
		
	}
	
}
