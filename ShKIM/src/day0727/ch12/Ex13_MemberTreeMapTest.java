package day0727.ch12;

public class Ex13_MemberTreeMapTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> MemberTreeMap형 memberHashMap 변수 선언, MemberTreeMap 인스턴스 생성하여 리턴된 메위주 대입
		// <2> Member형 memberMin 변수 선언, 회원아이디 1003, 회원명 "민윤기" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		// <3> Member형 memberKim 변수 선언, 회원아이디 1001, 회원명 "김석진" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		// <4> Member형 memberHope 변수 선언, 회원아이디 1004, 회원명 "정호석" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		// <5> Member형 memberPark 변수 선언, 회원아이디 1002, 회원명 "박지민" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		//------------------------------------------
		MemberTreeMap memberHashMap = new MemberTreeMap();	// <1>
			
		Member memberMin = new Member(1003, "민윤기");		// <2>
		Member memberKim = new Member(1001, "김석진");		// <3>
		Member memberHope = new Member(1004, "정호석");		// <4>
		Member memberPark = new Member(1002, "박지민");		// <5>
		
		//------------------------------------------
		// <1> memberHashMap으로 addMember() 메서드 호출하여 memberMin 데이터 추가
		// <2> memberHashMap으로 addMember() 메서드 호출하여 memberKim 데이터 추가
		// <3> memberHashMap으로 addMember() 메서드 호출하여 memberHope 데이터 추가
		// <4> memberHashMap으로 addMember() 메서드 호출하여 memberPark 데이터 추가
		// <5> memberHashMap으로 showAllMember() 메서드 호출하여 전체 회원 데이터 출력
		//	key(회원 아이디)가 오름차순 정렬되어 출력됨
		//------------------------------------------
		memberHashMap.addMember(memberMin);		// <1>
		memberHashMap.addMember(memberKim);		// <2>
		memberHashMap.addMember(memberHope);	// <3>
		memberHashMap.addMember(memberPark);	// <4>
		
		memberHashMap.showAllMember();			// <5>
		
		//------------------------------------------
		// <1> memberHashMap으로 removeMember() 메서드 호출하여 회원 아이디가 1004인 데이터 삭제
		// <2> memberHashMap으로 showAllMember() 메서드 호출하여 전체 회원 데이터 출력
		//	회원 아이디가 1004인 회원은 삭제된 상태로 출력됨
		//------------------------------------------
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();

	}

}
