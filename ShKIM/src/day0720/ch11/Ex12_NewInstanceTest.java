package day0720.ch11;

public class Ex12_NewInstanceTest {

	//------------------------------------------
	// forName(), newInstance() 메서드를 사용하는 동안 발생하는 예외 처리
	//------------------------------------------
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//------------------------------------------
		// <1> Person형 person1 변수 선언, Person() 생성자를 호출하여 인스턴스 생성, 생성된 메위주 대입
		// <2> person1의 정보 출력, day0720.ch11.Person@7a765367
		//------------------------------------------
		Person person1 = new Person();				// <1>
		System.out.println(person1);				// <2>
		
		//------------------------------------------
		// <1> Class형 pClass 변수 선언, Class의 forName() 메서드 호출하여 
		//	Person 클래스의 데이터가 담긴 Class 인스턴스 생성, 생성된 메위주 대입
		// <2> Person형 person2 변수 선언, pClass 변수로 newInstance() 메서드 호출하여
		//	Person 클래스의 디폴트 생성자 호출되어 Person 인스턴스 생성,
		//	Object형으로 메위주 리턴, 생성된 인스턴스를 Person형으로 다운캐스팅하여 대입
		// <3> person2의 정보 출력, day0720.ch11.Person@76b0bfab
		//------------------------------------------
		Class pClass = Class.forName("day0720.ch11.Person");	// <1>
		Person person2 = (Person)pClass.newInstance();			// <2>
		System.out.println(person2);							// <3>
		
		
		/* ==========================================
		 * newInstance()
		 * 리턴형: Object
		 * Class 클래스의 디폴트 생성자를 호출하여 인스턴스를 생성한다.
		 * 
		 * 동적 로딩(dynamic loading)
		 * 프로그램 실행 이후 클래스의 로딩이 필요한 경우 이용하는 방식이다.
		 * Class forName() 메서드를 동적 로딩으로 제공한다.
		 * 여러 데이터베이스 드라이버 중 필요한 드라이번의 값을 설정 파일에서 읽어 문자열 변수로 저장한다면,
		 * 설정 파일을 변경함으로써 필요한 드라이버를 간단하게 로딩한다.
		 * 필요에 따라 로딩되는 클래스를 동적으로 변경할 수 있다.
		 * ==========================================
		 */

	}

}
