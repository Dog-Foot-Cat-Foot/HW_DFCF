package day0727.ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	//------------------------------------------
	// Member형으로 HashSet 멤버 변수 hashSet 선언
	//------------------------------------------
	private HashSet<Member> hashSet;

	//------------------------------------------
	// hashSet에 Member형으로 HashSet 인터페이스를 생성하여 
	// 리턴한 메위주를 대입하는 생성자 선언
	//------------------------------------------
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	//------------------------------------------
	// addMember() 메서드 선언
	// HashSet에 회원 추가
	// Member형 데이터를 받아 hashSet에 추가한다
	//------------------------------------------
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//------------------------------------------
	// removeMember() 메서드 선언
	// 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
	// <1> Member형으로 Iterator 변수 ir 선언, hashSet으로 iterator() 메서드 호출하여 대입
	//	Iterator를 활용해 순회함
	// <2> ir으로 hasNext() 메서드 호출하여 요소가 있다면 true, 없다면 false
	// <3> Member형 member 변수 선언, ir으로 next() 메서드 호출하여 Member 요소를 리턴한다
	// <4> int형 tempId 변수 선언, member로 회원 아이디 가져와서 대입
	// <5> tempId에 저장된 회원아이디와 매개변수로 받은 회원아이디가 같다면
	// <6> hashSet으로 remove() 메서드 호출하여 회원 삭제 
	// <7> true를 반환하고 함수 중단
	// <8> 일치하는 회원아이디가 없다면 false 반환하고 함수 중단
	//------------------------------------------
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();	// <1>
		
		while(ir.hasNext()) {						// <2>
			Member member = ir.next();				// <3>
			int tempId = member.getMemberId();		// <4>
			if(tempId == memberId) {				// <5>
				hashSet.remove(member);				// <6>
				return true;						// <7>
			}
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;								// <8>
	}
	
	//------------------------------------------
	// showAllMember() 메서드 선언
	// 향상된 for문으로 hashSet에 있는 Member 인스턴스를 꺼내서 출력
	//------------------------------------------
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	/* =========================================
	 * HashSet 클래스
	 * -------------------------
	 * boolean remove(Object o)
	 * 기능: 매개변수로 받은 객체를 삭제
	 * 리턴형: boolean, 삭제 여부를 true, false로 리턴한다.
	 * 매개변수 : Object
	 * -------------------------
	 * 
	 * Iterator
	 * Collection 인터페이스를 구현한 객체에서 미리 정의되어 있는 iterator() 메서드를 호출하여 참조한다.
	 * 
	 * -------------------------
	 * Iterator 메서드
	 * -------------------------
	 * boolean hashNext()
	 * 기능: 이후에 요소가 더 있는지를 체크하는 메서드
	 * 리턴형: boolean, 요소가 있다면 true, 없다면 false 리턴
	 * 매개변수: x
	 * -------------------------
	 * E next()
	 * 기능: 다음에 있는 요소 반환
	 * 리턴형: E
	 * 매개변수: x
	 * =========================================
	 */
	
}
