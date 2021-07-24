package day0727.ch12;

public class Ex12_MemberHashMapTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> MemberHashMap형 memberHashMap 변수 선언, MemberHashMap 인스턴스 생성하여 리턴된 메위주 대입
		// <2> Member형 memberKim 변수 선언, 회원아이디 1001, 회원명 "김석진" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		// <3> Member형 memberKim 변수 선언, 회원아이디 1002, 회원명 "박지민" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		// <4> Member형 memberKim 변수 선언, 회원아이디 1003, 회원명 "민윤기" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		// <5> Member형 memberKim 변수 선언, 회원아이디 1006, 회원명 "정호석" 인 Member 인스턴스 생성하여 리턴된 메위주 대입
		//------------------------------------------
		MemberHashMap memberHashMap = new MemberHashMap();	// <1>
		
		Member memberKim = new Member(1001, "김석진");		// <2>
		Member memberPark = new Member(1002, "박지민");		// <3>
		Member memberMin = new Member(1003, "민윤기");		// <4>
		Member memberHope = new Member(1004, "정호석");		// <5>
		
		//------------------------------------------
		// <1> memberHashMap으로 addMember() 메서드 호출하여 memberKim 데이터 추가
		// <2> memberHashMap으로 addMember() 메서드 호출하여 memberPark 데이터 추가
		// <3> memberHashMap으로 addMember() 메서드 호출하여 memberMin 데이터 추가
		// <4> memberHashMap으로 addMember() 메서드 호출하여 memberHope 데이터 추가
		// <5> memberHashMap으로 showAllMember() 메서드 호출하여 전체 회원 출력
		//------------------------------------------
		memberHashMap.addMember(memberKim);			// <1>
		memberHashMap.addMember(memberPark);		// <2>
		memberHashMap.addMember(memberMin);			// <3>
		memberHashMap.addMember(memberHope);		// <4>
			
		memberHashMap.showAllMember();				// <5>
		
		//------------------------------------------
		// <1> memberHashMap으로 removeMember() 메서드 호출하여 회원아이디가 1004인 회원이 있다면 삭제
		// <2> memberHashMap showAllMember() 메서드 호출하여 전체 회원 출력
		//	회원 아이디가 1004인 회원은 삭제되어 있음
		//------------------------------------------
		memberHashMap.removeMember(1004);			// <1>
		memberHashMap.showAllMember();				// <2>
		
		
		/* =========================================
		 * HashMap과 Hashtable
		 * HashMap, Hashtable 모두 쌍으로 이루어진 자료를 관리하는 데 사용된다.
		 * Hashtable 클래스는 Vector 클래스와 마찬가지로 멀티스레드를 위한 동기화를 제공한다.
		 * 멀티스레드 환경이 아니라면, Hashtable보다는 HashMap을 사용하는 것을 권장한다.
		 * =========================================
		 */

	}

}
