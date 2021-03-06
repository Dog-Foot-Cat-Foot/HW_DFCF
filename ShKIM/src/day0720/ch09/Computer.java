package day0720.ch09;

//------------------------------------------
// 추상 클래스 선언
//------------------------------------------
public abstract class Computer {
	
	// ------------------------------------------
	// 추상 메서드 선언
	// 하위 클래스마다 다르게 구현할 메서드 선언
	// ------------------------------------------
	public abstract void display();
	public abstract void typing();
	
	// ------------------------------------------
	// 메서드 선언
	// 하위 클래스도 공통으로 사용할 메서드 구현
	// ------------------------------------------
	public void turnOn() {
		System.out.println("전원을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끈다.");
	}
	
	
	/* ===========================================
	 * abstract 예약어
	 * 구현부(implementation)가 없는 추상 메서드(abstract method)를 선언할 때 사용한다.
	 * 즉, 선언부(declatration)만 있는 메서드이다.
	 * 추상 클래스는 new 예약어로 인스턴스를 생성할 수 없다.
	 * 모든 메서드를 구현했어도 abstract 예약어를 사용하면 추상 클래스이다.
	 * 
	 * 구현된 메서드
	 * 추상 클래스에서 구현하는 메서드는 하위 클래스에서도 사용할,
	 * 즉, 하위 클래스에서도 구현 내용을 공유할 메서드를 구현한다.
	 * 
	 * 추상 메서드
	 * 실제 하위 클래스에서 내용을 각각 다르게 구현해야 한다면,
	 * 구현 내용을 추상 메서드로 남겨 두고 하위 클래스에 구현을 위임한다.
	 * ===========================================
	 */
}
