package day0727.ch12;

import java.util.ArrayList;

public class MemberArrayList {

	//------------------------------------------
	// Member형으로 ArrayList 멤버 변수 arrayList 선언
	//------------------------------------------
	private ArrayList<Member> arrayList;
	
	//------------------------------------------
	// Member형으로 ArrayList 인스턴스 생성하여 메위주를 대입하는 생성자 선언
	//------------------------------------------
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//------------------------------------------
	// arrayList에 member 추가하는 메서드 선언
	// arrayList의 맨 뒤에 추가한다.
	//------------------------------------------
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//------------------------------------------
	// arrayList의 각 요소를 돌며 매개변수로 받은 memberId 가 있다면 삭제 후 true 리턴, 아니면 false 리턴
	// <1> arrayList 크기 만큼 반복문 실행
	// <2> Member형 member 변수 선언, get() 메서드를 호출하여 i번째 member 객체를 리턴받아 메위주 대입
	// <3> int형 tempId 변수 선언, member 변수로 memberid를 리턴받아 대입
	// <4> tempId와 매개변수로 받은 memberId가 같다면
	// <5> arrayList로 remove() 메서드 호출하여 i 번째 요소 지우기
	// <6> true 리턴하며 함수 중단
	// <7> 매개변수로 받은 memberId 데이터 출력
	// <8> false 리턴하며 함수 중단
	//------------------------------------------
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {	// <1>
			Member member = arrayList.get(i);		// <2>
			int tempId = member.getMemberId();		// <3>
			if(tempId == memberId) {				// <4>
				arrayList.remove(i);				// <5>	
				return true;						// <6>
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");	// <7>
		return false;								// <8>
	}
	
	//------------------------------------------
	// arrayList의 데이터 출력
	// <1> 향상된 for문으로 arrayList의 요소를 하나씩 가져오기
	// <2> 가져온 데이터 출력
	//------------------------------------------
	public void showAllMember() {
		for(Member member : arrayList) {		// <1>
			System.out.println(member);			// <2>
		}
		System.out.println();
	}
	
	
	/* =========================================
	 * ArrayList 클래스
	 * 객체 배열을 구현한 클래스이며 컬렉션 인터페이스와 그 하위 List 인터페이스를 구현했다.
	 * 객체 순서를 기반으로 순차적으로 자료를 관리하는 프로그램을 구현할 때 사용한다.
	 * =========================================
	 */
	
}
