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
	
	//------------------------------------------
	// hashCode() 메서드가 회원 아이디를 리턴하도록 메서드 오버라이딩
	//------------------------------------------
	@Override
	public int hashCode() {
		return memberId;
	}
	
	//------------------------------------------
	// equals() 메서드 오버라이딩
	// 매개변수로 넘어온 회원아이디와 자신의 회원아기 같다면 true 반환
	// <1> 매개변수로 들어온 객체가 Member형 인 경우
	// <2> Member형 member 변수 선언, obj 객체를 Member로 다운캐스팅하여 대입
	// <3> 회원아이디와 매개변수의 회원아이디 같다면
	// <4> true 리턴하고 함수 중단
	// <5> 회원아이디와 매겨변수의 회원아이디가 같지 않다면 false 리턴하고 함수 중단
	// <6> 매개변수로 넘어온 객체가 Member형이 아니라면 false 리턴하고 함수 중단
	//------------------------------------------
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {					// <1>
			Member member = (Member)obj;			// <2>
			
			if(this.memberId == member.memberId) {	// <3>
				return true;						// <4>
			} else {
				return false;						// <5>
			}
		}
		return false;								// <6>
	}
	
	
	/* =========================================
	 * 컬렉션 프레임워크(collection framework)
	 * 필요한 자료 구조(data structure)를 미리 구현하여 java.util 패키지에서 제공하는 것을 말한다.
	 * =========================================
	 */

}
