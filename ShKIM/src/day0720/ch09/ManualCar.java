package day0720.ch09;

//------------------------------------------
// Car 클래스를 상속받은 ManulCar 클래스 선언
//------------------------------------------
public class ManualCar extends Car {

	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void drive() {
		System.out.println("사람이 운전한다.");
		System.out.println("사람이 핸들을 조작한다.");
	}
	
	@Override
	public void stop() {
		System.out.println("브레이크로 정지한다.");
	}
	
}
