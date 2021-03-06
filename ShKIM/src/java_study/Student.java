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
	
	//----------------------------------------
	// 학생 번호를 리턴하는 메소드 선언
	// 이 메소드를 호출한 놈한테는 stu_no 변수 안의 데이터를 
	// 리턴한다 라는 의미에서 메소드 왼쪽에 int를 붙인다.
	//----------------------------------------
	public int getStu_no() {
		//----------------------------------------
		// 속성변수 stu_no 안의 데이터를 리턴하기
		//----------------------------------------
		return this.stu_no;
	}
	
	//----------------------------------------
	// 학생 번호를 매개변수로 입력 받아 속성변수 stu_no 에 저장하는 메소드 선언
	// 속성변수 stu_no에 저장만 하고 이 메소드 호출한 놈한테는 리턴할게 없으므로
	// 메소드 앞에 리턴형은 void 로 설정한다.
	//----------------------------------------
	public void setStu_no(int stu_no) {
		//----------------------------------------
		// 속성변수 stu_no에 메소드의 매개변수 stu_no 안의 데이터를 저장하기
		// 속성변수 명과 매개변수 명이 같은 경우 혼동을 피하기 위해 속성변수 앞에 this.를 붙인다.
		//----------------------------------------
		this.stu_no = stu_no;
	}

	//----------------------------------------
	// 학생 이름을 리턴하는 메소드 선언
	// 이 메소드를 호출한 놈한테는 stu_name 변수 안의 데이터를 
	// 리턴한다 라는 의미에서 메소드 왼쪽에 String를 붙인다.
	//----------------------------------------
	public String getStu_name() {
		return stu_name;
	}

	//----------------------------------------
	// 학생 이름을 매개변수로 입력 받아 속성변수 stu_name 에 저장하는 메소드 선언
	// 속성변수 stu_name에 저장만 하고 이 메소드 호출한 놈한테는 리턴할게 없으므로
	// 메소드 앞에 리턴형은 void 로 설정한다.
	//----------------------------------------
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	//----------------------------------------
	// 주민번호를 리턴하는 메소드 선언
	// 이 메소드를 호출한 놈한테는 jumin_num 변수 안의 데이터를 
	// 리턴한다 라는 의미에서 메소드 왼쪽에 String를 붙인다.
	//----------------------------------------
	public String getJumin_num() {
		return jumin_num;
	}

	//----------------------------------------
	// 주민번호를 매개변수로 입력 받아 속성변수 jumin_num 에 저장하는 메소드 선언
	// 속성변수 jumin_num에 저장만 하고 이 메소드 호출한 놈한테는 리턴할게 없으므로
	// 메소드 앞에 리턴형은 void 로 설정한다.
	//----------------------------------------
	public void setJumin_num(String jumin_num) {
		this.jumin_num = jumin_num;
	}
	
}


/*
==========================================
1. 자바에서 최소 단위 프로그램은?
==========================================
1-1. 클래스(class)
------------------------------------------
- 속성변수(멤버변수), 생성자, 메소드로 구성되어 있다.
------------------------------------------
- 속성변수에는 동료 속성변수/메소드/생성자에서 공용으로 사용할 데이터가 저장된다.
- 메소드에는 실행 코드(실행 구문)가 저장된다.
- 생성자는 객체 생성 시, 단 한 번 호출되는 것으로 외부에서 데이터가 들어온다.
			외부에서 데이터가 들어오지 않으면 메소드의 리턴값은 항상 일정하다.
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

==========================================
2. void 키워드의 의미
==========================================
메소드명 왼쪽에 나오는 키워드이다.
이 메소드를 호출하는 놈은 어떤 데이터도 선물 받을 수 없어

==========================================
3. int getStu_no(){~} 에서 getStu_no 왼쪽의 int 의미?
==========================================
이 메소드를 호출하는 놈은 int형의 데이터를 선물 받을 수 있어

==========================================
4. return this.stu_no; 의 의미?
==========================================
return this.stu_no; 를 가진 메소드를 호출한 놈은 속성변수 stu_no안의 데이터를 선물 받을 수 있어 

==========================================
5. 생성자 public Student(~){~} 를 생략해도 되는가?
==========================================
생성자는 0개 이상 선언이 가능하다.

5-1. 생성자를 코딩상 생략하면 정말 존재하는 생성자는 0개 인가? 즉 없는가?
코딩상 생성자를 생략하면 자바는 기본 생성자를 넣어준다.
위 클래스에서 생성자를 생략하면 Student(){} 가 컴파일할 때 삽입된다. (디폴트 생성자)
즉, 코딩상 0개 이상이 가능하지만 실존 상 1개 이상이다.
생성자는 없어서는 안될 존재이다.
 
==========================================
6. 메소드 안의 실행구문은 언제 실행되는가?
========================================== 
누군가가 이 클래스를 객체화한 후 객체의메위주.메소드(~) 형식으로 호출할 때 실행된다.

==========================================
7. 속성변수의 선언 형식은?
==========================================
------------------------------------------
public|protected|default|private [static] [final] 기본자료형|클래스명|인터페이스명 속성변수명[=데이터];
------------------------------------------

------------------------------------------
public|protected|default|private : 접근지정자
------------------------------------------
-> 타 클래스 메소드에서 속성변수의 호출 가능 여부를 지정한다.
-> 관용적으로 대부분 속성변수는 private를 붙여 타 클래스에서 직접 호출을 막는다.

public
-> 동일한 패키지 또는 타 패키지 안의 타 클래스에서 모두 호출을 허락한다.
default
-> 동일한 패키지의 타 클래스에서만 호출을 허락, 타 패키지 안의 타 클래스에서는 호출을 할 수 없다.
-> 타 패키지 클래스의 배척
private
-> 모든 타 클래스에서의 호출을 할 수 없음. 모든 타 클래스의 배척

------------------------------------------
static (시험문제 타겟)
------------------------------------------
의미1) static 이 붙은 속성변수는 객체 생성없이 아래 처럼 호출이 가능하다.
------------------------------------------
		클래스명.속성변수;
------------------------------------------
		참고: 원래 속성변수나 메소드는 아래와 같은 절차를 거쳐 호출이 된다.
				클래스명 객체참조변수명 = new 생성자명(~);
				객체참조변수명.속성변수;
				객체참조변수명.메소드명(~);
------------------------------------------
의미2) static이 붙은 속성변수를 가진 클래스를 new를 사용해서 2개 이상 객체화했을 때 
객체끼리 이 static이 붙은 속성변수를 서로 공유한다. (객체끼리의 통신)

------------------------------------------
final (시험문제 타겟)
------------------------------------------
final이 붙은 속성변수는 처음 데이터를 저장한 후에는 절대 수정이 불가능하다.
불변 규칙, 과학적 불변 데이터인 경우 수정을 불가능하게 하기 위함이다.
예) 원주율 3.14, 불변의 회사 규칙 중 직원수는 10000 이하
주의) final 이 붙은 속성변수는 자동 초기화가 될 수 없다.
		그러므로 속성변수를 선언할 때 데이터를 저장하거나 
		생성자 안에서 저장하는 코딩이 반드시 나와야 한다 ★★★★★★
주의) final이 안 붙은 속성변수는 자동 초기화가 될 수 있다.

속성변수, 메소드, 클래스에 추가될 수 있다.
속성변수 : 데이터 갱신 금지(수정 금지)
메소드 : 오버라이딩 금지
클래스 : 상속 금지

------------------------------------------
기본자료형|클래스명|인터페이스명
------------------------------------------
	변수 안에 저장되는 데이터의 유형(=자료형=data type)을 말한다.
	------------------------------------------
	<예> ~ int xxx;       -> xxx 변수에는 정수형 데이터가 저장된다.
	<예> ~ double xxx;    -> xxx 변수에는 실수형 데이터가 저장된다.
	<예> ~ boolean xxx;   -> xxx 변수에는 true 또는 false가 저장된다.
	<예> ~ char xxx;      -> xxx 변수에는 문자 1개가 저장된다.
	------------------------------------------
	<예> ~ String xxx;    -> xxx 변수에는 문자열을 관리하는 String 객체의 메위주가 저장된다.
		------------------------------------------
		~ String xxx = "한승태";
		위 코드는 아래 코드와 거의 동일하다고 봐야한다.
		절대 xxx에 "한승태"라는 문자가 저장된게 아니다.
		~ String xxx = new String("한승태");
		------------------------------------------
	<예> ~ ArrayList xxx; -> xxx 변수에는 ArrayList 클래스가 객체화 됐을 때 객체의 메위주가 저장될 예정이다.
	<예> ~ HashMap xxx;   -> xxx 변수에는 HashMap 클래스가 객체화 됐을 때 객체의 메위주가 저장될 예정이다.
	------------------------------------------
	<예> ~ List xxx;      -> xxx 변수에는 List 라는 인터페이스를 구현한 클래스 중에 한 클래스가 객체화 됐을 때 객체의 메위주가 저장될 예정이다.
							List라는 인터페이스를 구현한 클래스들은 ArrayList, LinkedList, Vector, Stack 가 있다.
							결국 xxx 변수에는 ArrayList, LinkedList, Vector, Stack 중에 한 클래스가 객체화 했을 때 메위주가 들어갈 예정이다.
	<예> ~ Map xxx;		  -> xxx 변수에는 Map 라는 인터페이스를 구현한 클래스 중에 한 클래스가 객체화 됐을 때 객체의 메위주가 저장될 예정이다.
							Map라는 인터페이스를 구현한 클래스들은 HashMap, Hashtable, TreeMap, LinkedHashMap, Properties 가 있다.
							결국 xxx 변수에는 HashMap, Hashtable, TreeMap, LinkedHashMap, Properties 중에 
							한 클래스가 객체화 했을 때 메위주가 들어갈 예정이다.
	------------------------------------------	
	참고) 자바는 자료형에 어어엄청나게 민감하다
		인터페이스는 객체화가 목적이 아니다.
		클래스는 객체화가 목적이다.
		스프링에서는 대부분의 자료형이 인터페이스이다. 
			-> 인터페이스를 사용하면 유지보수성을 증가시켜 주며, 코딩의 연쇄 수정을 막을 수 있다.

==========================================
8. 도대체 자바 문법에서 [인터페이스(=interface)]가 뭘까?   (★★★★입사시험문제★★★★)
==========================================
정의 : public, final, static 성격을 가진 속성변수와 
		public, abstract 이 성격을 가진 메소드로 구성된 일종의 단위 프로그램이다.
특징 : 객체화 시킬 수 없다. 그러므로 메소드를 호출할 수 없다.
		예외적으로 속성변수는 아래와 같은 형식으로 호출이 가능하다.
		------------------------------------------
		인터페이스명.속성변수
		------------------------------------------
왜 만들어졌을까? 인터페이스를 구현한 클래스들은 인터페이스에서 설계한 메소드를 오버라이딩하게 됨으로
				이 클래스는 인터페이스에서 설계한 메소드를 그대로 가져다 오버라이딩 함으로써 
				인터페이스를 구현한 클래스 입장에서는 설계도 역할을 하게 된다.

==========================================
9. 메소드의 선언 형식은? ★★★★★★★★★★★★★★★★★★★★
가장 중요한 멤버가 메소드이다.
==========================================
public|protected|default|private [static] [synchronized] [final|abstract] 기본자료형|클래스명|인터페이스명|void 메소드명([자료형 매개변수, ~]) {
	실행구문;
}

기본자료형|클래스명|인터페이스명|void : 리턴자료형

------------------------------------------
static (시험문제 타겟)
------------------------------------------
	static 이 붙은 메소드는 객체 생성없이 아래처럼 호출이 가능하다.
------------------------------------------
	클래스명.메소드명(~)
------------------------------------------
final  (시험문제 타겟)
------------------------------------------
	자식클래스가 이 메소드를 오버라이딩(=overriding) 하는 것을 금지한다.
	자식이 오버라이딩(=overriding)하는 것을 금지하는 이유는 이거 말고는 사용하지 말라는 의미이다.
	------------------------------------------
	오버라이딩(=overriding)이란? 
	------------------------------------------
	정의 : 부모 클래스의 메소드를 자식 클래스 안에서 재정의하는 것을 오버라이딩 이라고 한다.
	오버라이딩 시 메소드 앞에 @Override 라는 어노테이션(=annotation) 붙이면 좋다
	규칙1. 부모 메소드명과 동일하다
	규칙2. 리턴형이 동일해야 한다.
	규칙3. 매개변수의 개수와 자료형이 일치해야 한다.
	규칙4. 접근지정자는 부모꺼보다 같거나 커야된다.
	
	------------------------------------------
	오버로딩(=overloading)
	------------------------------------------
	정의 : 동일한 클래스 내부에 같은 이름의 메소드를 2개 이상 정의하는 것을 말한다.
	규칙1. 메소드 이름은 같다.
	규칙2. 메소드의 매개변수의 개수가 다르거나, 매개변수의 개수가 같으면 자료형이 달라야 한다.
	
	<예>
	public class Calculate {
		public int plus(int num1, int num2){
			return num1 + num2;
		}
		
		public int plus(int num1, int num2, int num3){
			return num1 + num2 + num3;
		}
	}
	
	------------------------------------------
	<참고> 자바에서 어노테이션(=annotation) 이란?  (입사시험 문제 타겟)
	------------------------------------------
	클래스명 앞에, 속성변수 앞에, 메소드 앞에, 메소드의 매개변수 앞에 붙어서 
	특정 기능을 부여하는 자바의 표기법을 말한다.
	어노테이션의 표기방식은   @영문  인데 이때 영문은 반드시 대문자로 시작한다.
	Spring framework에서 엄청 즐겨쓴다.
	어노테이션이 없으면 Spring framework에서 날코딩이 엄청 많아진다.
	
	------------------------------------------
	<문제> 오버라이딩, 오버로딩에서 상속이랑 관계 없는 것은?
	------------------------------------------
	오버로딩이다. 
	
	------------------------------------------
	<문제> 오버라이딩, 오버로딩에서 상속이랑 관계 있는 것은?
	------------------------------------------
	오버라이딩이다.
	오버라이딩은 부모의 메소드를 재정의 하기 때문이다.
------------------------------------------
abstract	(시험문제 타겟)
------------------------------------------
메소드에 블록(=body={})이 없는 경우 붙인다.
<예> public int plus();


------------------------------------------
초기화(initialization)란? 변수에 데이터를 처음 집어넣는 행위를 말한다.
할당(assignment)이란? 변수에 데이터를 재정의하여 갱신하는 행위를 말한다.	
init : 이름에 init이 추기되어 있으면 초기화의 개념이 숨어 있다.

상속관계
화살표를 받는게 부모이고 화살표가 나가는게 자식이다.
자식이 부모의 속성변수와 메소드를 상속받으면서 자원 낭비(=중복 선언 낭비)를 방지한다.
private만 아니라면 속성변수나, 메소드를 사용할 수 있다,


구현 (implement), 상속(inheritance)
 */
