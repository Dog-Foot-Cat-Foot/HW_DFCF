package chapter_06;

class Person { 
	// 인스턴스 변수 선언 및 초기화 
	String name;
	int age;
	
	Person(){ 				// 매개변수가 없는 생성자 호출 
		this("이름없음",1);	// 잘이해안감 18 
	}
	
	Person(String name, int age){ // 생성자 호출 
		this.name = name; // this.인스턴스변수 = 지역변수 
		this.age = age;   // this.인스턴스변수 = 지역변수 
	}
	
	Person returnItSelf(){ // 인스턴스 주소값 반환할 때는 this를 사용(자기자신)  
		return this;	   // 반환형은 클래스 자료형을 사용 
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person(); // 객체생성  
		System.out.println(noName.name); 
		System.out.println(noName.age);

	}

}
