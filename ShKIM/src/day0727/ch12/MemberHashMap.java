package day0727.ch12;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	//------------------------------------------
	// Integer, Member형으로 HashMap 멤버 변수 hashMap 선언
	//------------------------------------------
	private HashMap<Integer, Member> hashMap;
	
	//------------------------------------------
	// HashMap 인스턴스를 생성하여 리턴된 메위주를 hashMap 변수에 대입하는 생성자 선언
	//------------------------------------------
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//------------------------------------------
	// addMember(Member member) 메서드 선언
	// HashMap에 회원을 추가한다
	// <1> hashMap으로 put() 메서드 호출하여, 회원아이디, member객체를 key-value 쌍으로 추가한다
	//------------------------------------------
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);	// <1>
	}
	
	//------------------------------------------
	// removeMember(int memberId) 메서드 선언
	// HashMap에서 회원을 삭제한다
	// <1> HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
	// <2> 해당 회원 삭제
	// <3> true를 리턴하며 함수 중단
	// <4> 키 값인 회원 아이디가 없다면 false를 리턴하며 함수 중단
	//------------------------------------------
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {			// <1>	
			hashMap.remove(memberId);				// <2>
			return true;							// <3>
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;								// <4>
	}
	
	//------------------------------------------
	// showAllMember() 메서드 선언
	// Iterator를 사용해 전체 회원을 출력한다
	// <1> Integer형으로 Iterator 변수 ir 선언, 
	//	hashMap으로 KeySet() 메서드 호출하여 iterator() 메서드 호출, 리턴된 메위주 대입
	// <2> ir로 hasNext() 메서드 호출하여 요소가 있으면 true, 없으면 false
	// <3> int형 key 변수 선언, ir로 next() 메서드 호출하여 요소(키 값)를 리턴받아 대입
	// <4> Member형 member 변수 선언, hashMap으로 get() 메서드 호출하여 키 값에 해당하는 요소(value) 리턴받아 대입
	// <5> member 데이터 출력
	//------------------------------------------
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();	// <1>
		while(ir.hasNext()) {					// <2>
			int key = ir.next();				// <3>
			Member member = hashMap.get(key);	// <4>
			System.out.println(member);			// <5>
		}
		System.out.println();
	}
	
}
