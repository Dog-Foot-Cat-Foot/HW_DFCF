package day0713.ch06;

// 유일한 회사 객체 생성
public class Company {
	
	// 유일하게 생성한 인스턴스
	// private으로 선언하여 외부에서 인스턴스 접근 못하도록 선언
	private static Company instance = new Company();
	
	// private 생성자
	// Company 클래스 내부에서만 이 클래스의 생성을 제어함
	private Company() {}
	
	// 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
	// 반드시 static으로 선언한다
	// getInstance() 메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문이다
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		// 유일하게 생성한 인스턴스 반환
		return instance;
	}
	
	/*
	 * 싱글톤 패턴(singleton pattern)
	 * 인스턴스를 단 하나만 생성하는 디자인 패턴
	 */

}
