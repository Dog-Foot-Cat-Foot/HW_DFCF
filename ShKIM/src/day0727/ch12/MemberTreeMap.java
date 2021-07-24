package day0727.ch12;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	
	//------------------------------------------
	// Integer, Member형으로 TreeMap 멤버 변수 treeMap 선언
	//------------------------------------------
	private TreeMap<Integer, Member> treeMap;
	
	//------------------------------------------
	// 생성자 선언
	// Integer, Member형으로 TreeMap 인터페이스 생성후 리턴된 메위주 대입함
	//------------------------------------------
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	//------------------------------------------
	// addMember(Member member) 메서드 선언
	// 회원아이디와 member를 key-value 쌍으로 추가
	//------------------------------------------
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	//------------------------------------------
	// removeMember(int memberId) 메서드 선언
	// <1> treeMap으로 containsKey() 메서드 호출하여 해당 아이디가 있으면 true, 없으면 false
	// <2> treeMap으로 remove() 메서드 호출하여 해당 아이디에 해당하는 회원 삭제
	// <3> true를 리턴하며 함수 중단
	// <4> 아이디가 없다면 false 리턴하며 함수 중단
	//------------------------------------------
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {		// <1>
			treeMap.remove(memberId);			// <2>
			return true;						// <3>
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;							// <4>
	}
	
	//------------------------------------------
	// showAllMember() 메서드 선언
	// <1> Integer형으로 Iterator 변수 ir 선언, treeMap으로 keySet() 메서드 호출하여 
	//	모든 key 값을 Set 객체로 반환, iterator() 메서드 호출하여 key를 순회할 수 있는 
	//	iterator 객체를 반환하여 메위주 대입
	// <2> ir로 hasNext() 메서드 호출하여 요소가 있다면 true, 없으면 false
	// <3> int형 key 변수에 ir로 next() 메서드 호출하여 요소를 리턴받아 대입
	// <4> Member형 member 변수 선언, 
	//	treeMap으로 get() 메서드 호출하여 key에 해당하는 value를 리턴받아 대입
	// <5> member 데이터 출력
	//------------------------------------------
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();	// <1>
		while(ir.hasNext()) {						// <2>
			int key = ir.next();					// <3>
			Member member = treeMap.get(key);		// <4>
			System.out.println(member);				// <5> 
		}
		System.out.println();
	}
	
	// key 값인 회원 아이디는 Integer형으로 Integer 클래스에 이미 Comparable 인터페이스가 구현되어 있다.
	// 따라서, 따로 Comparable 인터페이스를 구현하지 않아도 된다.
	
	
	/* =========================================
	 * TreeMap 클래스
	 * Map 인터페이스를 구현한 클래스 중 key 값으로 자료를 정렬한다.
	 * TreeSet과 마찬가지로 이진 검색 트리로 구현되어 있다.
	 * key 값으로 정렬하므로 key 값에 해당하는 클래스에 Comparable / Comparator 인터페이스를 구현해야 한다.
	 * =========================================
	 */

}
