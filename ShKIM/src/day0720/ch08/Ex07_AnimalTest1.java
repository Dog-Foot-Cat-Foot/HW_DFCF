package day0720.ch08;

import java.util.ArrayList;

// -------------------------------------
// Animal 클래스 선언
// -------------------------------------
class Animal {
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}

// -------------------------------------
// Animal 클래스를 상속받은 Human 클래스 선언
// -------------------------------------
class Human extends Animal {
	// move() 메소드 오버라이딩
	public void move() {
		System.out.println("사람이 두 발로 걷는다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다.");
	}
}

// -------------------------------------
// Animal 클래스를 상속받은 Tiger 클래스 선언
// -------------------------------------
class Tiger extends Animal {
	// move() 메소드 오버라이딩
	public void move() {
		System.out.println("호랑이가 네 발로 뛴다.");
	}
	
	public void huntion() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

// -------------------------------------
// Eagle 클래스를 상속받은 Tiger 클래스 선언
// -------------------------------------
class Eagle extends Animal {
	// move() 메소드 오버라이딩
	public void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아간다.");
	}
}

public class Ex07_AnimalTest1 {
	
	// -------------------------------------
	// Animal형의 객체 배열 선언
	// -------------------------------------
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		
		// -------------------------------------
		// <1> 인스턴스 생성
		// <2> 메서드 호출, Human 인스턴스를 생성하여 매개변수로 넘겨준다
		// <3> 메서드 호출, Tiger 인스턴스를 생성하여 매개변수로 넘겨준다
		// <4> 메서드 호출, Eagle 인스턴스를 생성하여 매개변수로 넘겨준다
		// 출력:
		// 사람이 두 발로 걷는다.
		// 호랑이가 네 발로 뛴다.
		// 독수리가 하늘을 난다.
		// -------------------------------------
		Ex07_AnimalTest1 aTest = new Ex07_AnimalTest1();	// <1>
		aTest.moveAnimal(new Human());						// <2>
		aTest.moveAnimal(new Tiger());						// <3>
		aTest.moveAnimal(new Eagle());						// <4>
		
		// -------------------------------------
		// <1> 인스턴스 생성
		// <2> addAnimal() 메서드 호출
		// 사람이 두 발로 걷는다.
		// 호랑이가 네 발로 뛴다.
		// 독수리가 하늘을 난다.
		// <3> testCasting() 메서드 호출
		// 사람이 책을 읽는다.
		// 호랑이가 사냥을 한다.
		// 독수리가 날개를 쭉 펴고 멀리 날아간다.
		// -------------------------------------
		Ex07_AnimalTest1 aTest1 = new Ex07_AnimalTest1();	// <1>	
		aTest1.addAnimal();									// <2>
		System.out.println("===== 원래 형으로 다운 캐스팅 =====");
		aTest1.testCasting();								// <3>
	}
	
	// -------------------------------------
	// Animal형 변수를 매개변수로 받는 메서드 선언
	// 매개변수로 받은 Animal 인스턴스로 move() 메서드 호출
	// 생성된 인스턴스를 기준으로 메서드를 호출하므로(가상 메서드), 
	// 전달받은 매개변수가 Animal형으로 업캐스팅되더라도 생성된 인스턴스의 메서드가 호출된다.
	// animal.move() 코드는 변함 없지만, 넘어온 매개변수에 따라 출력문이 달라지는 것을 다형성이라 한다.
	// -------------------------------------
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	// -------------------------------------
	// ArrayList에 생성한 인스턴스를 Aniaml형으로 업캐스팅하여 추가
	// 생성한 인스턴스의 move() 메서드 호출
	// -------------------------------------
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	// -------------------------------------
	// 배열 요소를 하나씩 돌면서 하위 클래스로 다운 캐스팅하는 메서드 선언
	// <1> 배열 요소의 개수만큼 반복 수행
	// <2> Animal형 변수에 객체 배열의 요소 대입
	// <3> instanceof 예약어로 실제 인스턴스형 확인
	// <4> 다운 캐스팅
	// <4> 인스턴스의 메서드 호출
	// -------------------------------------
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {	// <1>
			Animal ani = aniList.get(i);			// <2>
			
			if(ani instanceof Human) {				// <3>
				Human h = (Human)ani;				// <4>
				h.readBook();						// <5>
			} else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.huntion();
			} else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
	/* ======================================
	 * 다형성(polymorphism)
	 * 객체 지향의 중요한 특성 중 하나로,
	 * 하나의 코드가 여러 자료형으로 구현되어 실행되는 것을 말한다.
	 * 
	 * 다운 캐스팅(down casting)
	 * 상위 클래스로 형 변환되었던 하위 클래스를 다시 원래 자료형으로 형 변환하는 것을 말한다.
	 * 
	 * instanceof 예약어
	 * 상위 클래스로 형 변환된 인스턴스의 원래 자료형을 확인하는 예약어이다.
	 * 왼쪽에 있는 변수의 원래 인스턴스형이 오른쪽 클래스 자료형인가를 확인한다.
	 * 
	 * 상위 클래스로는 묵시적으로 형 변환이 되지만, 
	 * 하위 클래스로 형 변환을 할 때는 명시적으로 해야 한다.
	 * ======================================
	 */
	
}
