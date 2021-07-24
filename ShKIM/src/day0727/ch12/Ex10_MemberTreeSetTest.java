package day0727.ch12;

public class Ex10_MemberTreeSetTest {

	public static void main(String[] args) {

		// ------------------------------------------
		// <1> MemberTreeSet형 memberTreeSet 변수 선언, MemberTreeSet 인스턴스 생성 후 리턴된 메위주 대입
		// <2> Member형 memberMin 변수 선언, 
		//	Member 아이디, 이름을 초기화하는 생성자를 호출하여 인스턴스 생성, 리턴받은 메위주 대입	
		// ------------------------------------------
		MemberTreeSet memberTreeSet = new MemberTreeSet();	// <1>

		Member memberMin = new Member(1003, "민윤기");		// <2>
		Member memberKim = new Member(1001, "김석진");
		Member memberPark = new Member(1002, "박지민");

		//------------------------------------------
		// <1> memberTreeSet으로 addMember() 메서드 호출, memberMin 메위주를 던져서 요소 추가
		// <2> memberTreeSet으로 addMember() 메서드 호출, memberKim 메위주를 던져서 요소 추가
		// <3> memberTreeSet으로 addMember() 메서드 호출, memberPark 메위주를 던져서 요소 추가
		// <4> memberTreeSet으로 showAllMember() 메서드 호출, 저장된 데이터를 출력한다.
		//------------------------------------------
		memberTreeSet.addMember(memberMin);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();

		//------------------------------------------
		// <1> Member형 memberHong 변수 선언, 
		//	Member 아이디, 이름을 초기화하는 생성자를 호출하여 인스턴스 생성, 리턴받은 메위주 대입	
		//	아이디가 중복 회원 추가
		// <2> memberTreeSet으로 addMember() 메서드 호출, memberHong 메위주를 던져서 요소 추가
		// <3> memberTreeSet으로 showAllMember() 메서드 호출, 저장된 데이터를 출력한다.
		//	아이디 중복 없이 제거되고 회원 아이디가 정렬될 줄 알았으나.. 오류가 발생했다
		//	Member 클래스가 Comparable 인터페이스를 구현하지 않았다는 의미이다.
		//	Member 클래스를 TreeSet의 요소로 추가할 때 어떤 기준으로 노드를 비교하여 
		//	트리를 형성해야 하는지를 구현하지 않았다는 뜻이다.
		//	TreeSet에 추가할 때 어떤 기준으로 비교할 것인지를 구현해 주어야 한다.
		//------------------------------------------
		// Member 클래스에 compareTo() 메서드 오버라이딩하였다.
		//------------------------------------------
		Member memberHong = new Member(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();

	}

}
