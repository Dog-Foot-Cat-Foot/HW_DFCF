package day0727.ch12;

//------------------------------------------
// <> (다이아몬드 연산자)를 사용하여 제네릭 클래스 정의, 
// T는 자료형 매개변수(type parameter)라 부른다.
// 나중에 사용할 때 T 위치에 실제 사용할 자료형을 지정한다.
// extends 예약어로 사용할 수 있는 자료형에 제한을 둔다.
//------------------------------------------
public class GenericPrinter<T extends Material> {
	
	//------------------------------------------
	// T 자료형으로 선언한 멤버 변수 material
	//------------------------------------------
	private T material;
	
	//------------------------------------------
	// T 자료형을 매개변수로 받는 set() 제네릭 메서드 선언
	//------------------------------------------
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//------------------------------------------
	// T 자료형 변수 material을 반환하는 get() 제네릭 메서드 선언
	//------------------------------------------
	public T getMaterial() {
		return material;
	}
	
	//------------------------------------------
	// toString() 메서드 오버라이딩
	//------------------------------------------
	@Override
	public String toString() {
		return material.toString();
	}
	
	//------------------------------------------
	// 상위 클래스 Material의 메서드 호출
	// <T extends Material> 을 사용해서 컴파일할 때 내부적으로 Object가 아닌 Material로 변환되었다.
	//------------------------------------------
	public void printing() {
		material.doPrinting();
	}
	
	
	/* =========================================
	 * 제네릭(Generic) 프로그래밍
	 * 어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍하는 것을 말한다.
	 * 참조 자료형이 변환될 때 이에 대한 검증을 컴파일러가 하므로 안정적이다.
	 * 
	 * 제네릭의 필요성
	 * 어떤 변수가 여러 참조 자료형을 사용할 수 있도록 Object 클래스를 사용하면 
	 * 다시 원래 자료형으로 반환해 주기 위해 매번 형 변환을 해야 하는 번거로움이 있다.
	 * 여러 참조 자료형이 쓰일 수 있는 곳에 특정한 자료형을 지정하지 않고,
	 * 클래스나 메서드를 정의한 후 사용하는 시점에 어떤 자료형을 사용할 것인지 지정하는 방식
	 * 
	 * 자료형 매개변수 T와 static
	 * T의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 순간이다.
	 * T의 자료형이 결정되는 시점보다 빠르기 때문에 static 변수의 자료형이나
	 * static 메서드 내부 변수의 자료형으로 T를 사용할 수 없다.
	 * E는 element, K는 key, V는 value를 보통 의미한다.
	 * =========================================
	 */

}
