package day0713.ch06;

public class CompanyTest {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// Company형 참조 변수 myCompany1에 
		// Company 클래스의 getInstance() 메서드를 호출하여
		// 리턴받은 데이터 대입
		//---------------------------------------------------
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//---------------------------------------------------
		// 두 변수가 같은 주소인지 확인
		//---------------------------------------------------
		System.out.println(myCompany1 == myCompany2); // true
		
		// Company 클래스는 내부에 생성된 유일한 인스턴스 외에는 더 이상 인스턴스를 생성할 수 없다

	}

}
