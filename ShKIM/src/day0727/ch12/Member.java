package day0727.ch12;

public class Member {
	
	//------------------------------------------
	// <1> int형 memberId 멤버 변수 선언, 회원 아이디
	// <2> String형 memberName 멤버 변수 선언, 회원 이름
	//------------------------------------------
	private int memberId;			// <1>
	private String memberName;		// <2>
	
	//------------------------------------------
	// 회원 아이디, 회원 이름을 입력받는 생성자 선언
	//------------------------------------------
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	//------------------------------------------
	// get(), set() 메서드 선언
	//------------------------------------------
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//------------------------------------------
	// toString() 메서드 오버라이딩
	// 회원 이름, 회원 아이디를 문자열로 리턴한다.
	//------------------------------------------
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
	/* =========================================
	 * 컬렉션 프레임워크(collection framework)
	 * 필요한 자료 구조(data structure)를 미리 구현하여 java.util 패키지에서 제공하는 것을 말한다.
	 * =========================================
	 */

}
