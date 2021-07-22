package chapter_05;

public class PersonTest1 {

	public static void main(String[] args) {
		// 나이40 이름James 결혼했음 자식3명 
		
		Person1 p = new Person1();
		
		p.age = 40;
		p.name = "James";
		p.married = true;
		p.hizenum = 3;
		
		System.out.println("나이는 = " + p.age);
		System.out.println("이름은 = " + p.name);
		System.out.println("결혼여부 = " + p.married);
		System.out.println("자녀 수 = " + p.hizenum);
		

	}

}
