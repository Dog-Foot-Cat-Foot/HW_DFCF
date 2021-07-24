package day0727.ch12;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	//------------------------------------------
	// Member형으로 TreeSet 멤버 변수 treeSet 선언
	//------------------------------------------
	private TreeSet<Member> treeSet;
	
	//------------------------------------------
	// treeSet에 Member형으로 생성된 TreeSet 인스턴스의 리턴된 메위주 대입하는 생성자 선언 
	//------------------------------------------
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	//------------------------------------------
	// addMember(Member member) 메서드 선언
	// Member형 데이터를 매개변수로 받아서 treeSet에 추가
	//------------------------------------------
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//------------------------------------------
	// removeMember(int memberId) 메서드 선언
	// 매개변수로 받은 회원아이디와 일치하는 회원아이디가 있다면 회원을 삭제
	// <1> Member형으로 Iterator 변수 ir 선언, treeSet으로 iterator() 메서드 호출하여 대입
	// <2> ir으로 요소가 있다면 true, 없다면 false
	// <3> Member형 member 변수 선언, ir으로 next() 메서드를 호출하여 리턴 받은 데이터 대입
	// <4> int형 tempId 변수 선언, member으로 회원아이디 가져와서 데입
	// <5> tempId와 매개변수로 받은 회원아이디가 같다면
	// <6> treeSet으로 remove() 메서드 호출하여 Member 삭제
	// <7> true를 리턴하여 함수 중단
	// <8> ir 요소를 모두 순회해도 동일한 회원아이디가 없다면 false 리턴하며 함수 중단
	//------------------------------------------
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();	// <1>
		
		while(ir.hasNext()) {						// <2>
			Member member = ir.next();				// <3>
			int tempId = member.getMemberId();		// <4>
			if(tempId == memberId) {				// <5>
				treeSet.remove(member);				// <6>
				return true;						// <7>
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;								// <8>
	}
	
	//------------------------------------------
	// showAllMember() 메서드 선언
	// 전체 회원을 출력
	// <1> 향상된 for문으로 treeSet에 있는 Member를 member 변수에 대입
	// <2> 대입된 member 데이터 출력
	//------------------------------------------
	public void showAllMember() {
		for(Member member : treeSet) {		// <1>
			System.out.println(member);		// <2>
		}
		System.out.println();
	}
	
}
