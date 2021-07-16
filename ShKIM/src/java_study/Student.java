//----------------------------------------
// class의 소속 package명 선언
// 모든 java class 상단에는 무조건 소속 package명 선언이 나온다
//----------------------------------------
package java_study;

//----------------------------------------
// Student 라는 이름의 class 선언
// class는 java에서 단위 프로그램의 중의 하나이다
// public: 다른 package에서 사용 가능하다
// 아무것도 없을 경우: 동일한 package에서만 사용 가능하다
//----------------------------------------
public class Student {
	//----------------------------------------
	// 속성변수(멤버변수) 선언하기
	//----------------------------------------
	private int stu_no;
	private String stu_name;
	private String jumin_num;
	
	//----------------------------------------
	// 생성자 선언하기
	//----------------------------------------
	public Student(int stu_no, String stu_name, String jumin_num) {
		this.stu_no = stu_no;
		this.stu_name = stu_name;
		this.jumin_num = jumin_num;
	}
	
	//----------------------------------------
	// 메소드 선언하기
	//----------------------------------------
	public int getStu_no() {
		return this.stu_no;
	}
	
	public void setStu_no(int stu_no) {
		this.stu_no = stu_no;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getJumin_num() {
		return jumin_num;
	}

	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}
	
}


/*
------------------------------------------
1. 자바에서 최소 단위 프로그램은?
------------------------------------------
1-1. 클래스(class)
------------------------------------------
- 속성변수(멤버변수), 생성자, 메소드로 구성되어 있다.
------------------------------------------
- 속성변수에는 동료 속성변수/메소드/생성자에서 공용으로 사용할 데이터가 저장된다.
- 메소드에는 실행 코드(실행 구문)가 저장된다.
- 생성자는 객체 생성 시, 단 한 번 호출되는 것으로 외부에서 데이터가 들어온다.
------------------------------------------
- 클래스는 객체의 전신이다. 즉, 객체를 생성하기 위한 단위 프로그램이다.
------------------------------------------

------------------------------------------
1-2. 인터페이스(interface)
------------------------------------------
- public, static, final 의 성격을 가진 속성변수와 
  public, abstract 의 성격을 가진 메소드로만 구성된 단위 프로그램이다.
<주의> 생성자가 없다.
- 객체 생성 목적으로 만들어지지 않았다.
- 클래스의 설계도 역할을 한다.
------------------------------------------
 */
