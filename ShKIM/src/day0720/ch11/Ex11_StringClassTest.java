package day0720.ch11;

//------------------------------------------
// Constructor, Field, Method 클래스가 정의되어 있는 패키지 가져오기
//------------------------------------------
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex11_StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//------------------------------------------
		// Class형 strClass 변수 선언, 
		//	Class 클래스의 forName() 메서드 호출하여 매개변수로 전달한 
		// 	java.lang.String 클래스 이름을 가진 Class 클래스의 메위주 리턴하여 대입
		//------------------------------------------
		Class strClass = Class.forName("java.lang.String");
		
		//------------------------------------------
		// <1> Constructor형을 배열 변수로 가지고 있는 배열 cons 변수 선언,
		//	strClass 변수로 getConstructors() 메서드 호출하여, 모든 생성자 데이터를 리턴받아 저장
		// <2> 향상된 for문으로 cons 변수에 저장된 데이터 하나씩 출력
		//	String 클래스의 모든 생성자가 출력된다.
		//------------------------------------------
		Constructor[] cons = strClass.getConstructors();	// <1>
		for(Constructor c : cons) {							// <2>
			System.out.println(c);
		}
		
		//------------------------------------------
		// <1> Field형 fields 변수 선언,
		//	strClass 변수로 getFields() 메서드 호출하여, 모든 멤버 변수(필드) 데이터를 리턴받아 저장
		// <2> 향상된 for문으로 fields 변수에 저장된 데이터 하나씩 출력
		//	String 클래스의 모든 멤버 변수가 출력된다.
		//------------------------------------------
		System.out.println();								
		Field[] fields = strClass.getFields();				// <1>
		for(Field f : fields){								// <2>
			System.out.println(f);
		}
		
		//------------------------------------------
		// <1> Method형을 배열 변수로 가지고 있는 배열 methods 변수 선언,
		//	strClass 변수로 getMethods() 메서드 호출하여, 모든 메서드 데이터를 리턴받아 저장
		// <2> 향상된 for문으로 methods 변수에 저장된 데이터 하나씩 출력
		//	String 클래스의 모든 메소드가 출력된다.
		//------------------------------------------
		System.out.println();
		Method[] methods = strClass.getMethods();			// <1>
		for(Method m : methods) {							// <2>
			System.out.println(m);
		}
		
		
		/* ==========================================
		 * 리플렉션(reflection)
		 * Class 클래스를 활용하여 그 클래스의 정보를 가져오고, 
		 * 이 정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식을 말한다.
		 * ==========================================
		 */

	}

}
