package day0727.ch12;

public class Ex08_MemberHashSetTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> MemberHashSet형 memberHashSet 변수 선언, 
		//	MemberHashSet 인스턴스 생성하여 리턴받은 메위주 대입
		// <2> Member형 memberKim 변수 선언, 
		//	Member 아이디, 이름을 초기화하는 생성자를 호출하여 인스턴스 생성, 리턴받은 메위주 대입	
		//------------------------------------------
		MemberHashSet memberHashSet = new MemberHashSet();	// <1>
		
		Member memberKim = new Member(1001, "김석진");		// <2>
		Member memberPark = new Member(1002, "박지민");
		Member memberMin = new Member(1003, "민윤기");
		
		//------------------------------------------
		// <1> memberHashSet으로 addMember() 메서드 호출, memberKim 메위주를 던져서 요소 추가
		// <2> memberHashSet으로 addMember() 메서드 호출, memberPark 메위주를 던져서 요소 추가
		// <3> memberHashSet으로 addMember() 메서드 호출, memberMin 메위주를 던져서 요소 추가
		// <4> memberHashSet으로 showAllMember() 메서드 호출, 저장된 데이터를 출력한다.
		//------------------------------------------
		memberHashSet.addMember(memberKim);			// <1>
		memberHashSet.addMember(memberPark);		// <2>
		memberHashSet.addMember(memberMin);			// <3>
		memberHashSet.showAllMember();				// <4>
		
		//------------------------------------------
		// <1> Member형 memberKim 변수 선언, 
		//	Member 아이디, 이름을 초기화하는 생성자를 호출하여 인스턴스 생성, 리턴받은 메위주 대입	
		//	아이디가 중복 회원 추가
		// <2> memberHashSet으로 addMember() 메서드 호출, memberHong 메위주를 던져서 요소 추가
		// <3> memberHashSet으로 showAllMember() 메서드 호출, 저장된 데이터를 출력한다.
		//	HashSet의 정의대로라면 아이디가 중복된 홍길동 회원이 추가되지 않아야 하나,
		//	추가가 되었다. 객체가 동일한 경우 추가가 안되도록 구현해야 한다.
		//------------------------------------------
		// Member 클래스에서 hashCode(), equals() 메서드 오버라이딩하여 
		//	회원 아이디가 같다면 논리적으로 같은 객체 구현
		//	회원 아이디가 같아서 memberHong은 추가되지 않았다.
		//------------------------------------------
		Member memberHong = new Member(1003, "홍길동");	// <1>
		memberHashSet.addMember(memberHong);			// <2>
		memberHashSet.showAllMember();					// <3>

	}

}
