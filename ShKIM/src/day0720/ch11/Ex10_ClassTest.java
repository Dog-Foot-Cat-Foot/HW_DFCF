package day0720.ch11;

public class Ex10_ClassTest {

	//------------------------------------------
	// forName() 메서드에서 발생하는 예외를 처리함
	// 이름과 일치하는 클래스가 없는 경우 ClassNotFoundException 발생
	//------------------------------------------
	public static void main(String[] args) throws ClassNotFoundException {
		
		//------------------------------------------
		// <1> Person형 person 변수 선언, Person() 생성자 호출하여 인스턴스 생성 및 메위주 리턴받아 저장
		// <2> Class형 pClass1 변수 선언, 
		//	person 변수로 Object의 getClass() 메서드 호출하여 Class 클래스의 메위주로 리턴받아 저장
		// <3> pClass1 변수로 getName() 메서드 호출하여 pClass1에 저장된 Class명 출력, day0720.ch11.Person
		//------------------------------------------
		Person person = new Person();					// <1>
		Class pClass1 = person.getClass();				// <2>
		System.out.println(pClass1.getName());			// <3>
		
		//------------------------------------------
		// <1> Class형 pClass2 변수 선언, 
		//	Person.class로 클래스 파일 이름 Class 클래스의 메위주로 리턴받아 저장 
		// <2> pClass2 변수로 getName() 메서드 호출하여 pClass2에 저장된 Class명 출력, day0720.ch11.Person
		//------------------------------------------
		Class pClass2 = Person.class;					// <1>
		System.out.println(pClass2.getName());			// <2>
		
		//------------------------------------------
		// <1> Class형 pClass3 변수 선언, 
		//	Class 클래스의 forName() 메서드 호출하여 클래스 파일 이름을 Class 클래스의 메위주로 리턴받아 저장 
		// <2> pClass3 변수로 getName() 메서드 호출하여 pClass3에 저장된 Class명 출력, day0720.ch11.Person
		//------------------------------------------
		Class pClass3 = Class.forName("day0720.ch11.Person");	// <1>
		System.out.println(pClass3.getName());					// <2>
		
		
		/* ==========================================
		 * Class 클래스
		 * 자바의 모든 클래스와 인터페이스는 컴파일되고 나면 class 파일로 생성된다.
		 * Class 클래스는 컴파일된 class 파일에 저장된 클래스나 인터페이스 정보를 가져오는데 사용한다.
		 * 
		 * getClass()
		 * 리턴형: Class
		 * 모든 클래스가 사용할 수 있는 메서드이며, 이미 생성된 인스턴스가 있다면 사용 가능하다.
		 * 
		 * 클래스명.class
		 * 리턴형: Class
		 * 컴파일된 클래스 파일이 있다면 사용 가능하다.
		 * 
		 * forName("패지키명.클래스명")
		 * 매개변수: 문자열
		 * 리턴형: Class
		 * 정적 메서드이므로 Class 클래스를 생성하지 않아도 사용할 수 있다.
		 * 컴파일된 클래스 파일이 있다면 사용 가능하다.
		 * 매개변수로 넘겨준 문자열에 해당하는 클래스가 존재하지 않으면 클래스를 가져오는 데 실패한다.
		 * 이때 ClassNotFoundException이 발생한다. 
		 * ==========================================
		 */

	}

}
