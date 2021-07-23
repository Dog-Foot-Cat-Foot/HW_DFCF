package day0727.ch12;

//------------------------------------------
//추상 클래스 Material 상속받는 Plastic 클래스 선언
//------------------------------------------
public class Plastic extends Material {

	//------------------------------------------
	// 문자열을 출력하는 doPrinting() 메서드 선언
	//------------------------------------------
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	//------------------------------------------
	// 문자열을 리턴해주는 toString() 메서드 오버라이딩
	//------------------------------------------
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
	
}
