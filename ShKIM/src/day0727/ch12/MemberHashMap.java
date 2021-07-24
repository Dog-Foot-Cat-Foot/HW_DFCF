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
	//	containsKey() 메서드를 호출하여 해당 key 값이 HashMap에 존재하는지 확인
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
	//	hashMap.keySet() 메서드를 호출하면 모든 key 값이 Set 객체로 반환된다.
	//	반환된 Set 객체에 iterator() 메서드를 호출하면 key를 순회할 수 있는 Iterator가 반환된다.
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
	
	
	/* =========================================
	 * Map 인터페이스
	 * 자료를 쌍(pair)으로 관리하는 데 필요한 메서드가 정의되어 있다.
	 * key-value 쌍으로 이루어진 객체의 key 값은 유일하며 value 값은 중복될 수 있다.
	 * Map 인터페이스를 구현한 클래스는 내부적으로 해시 알고리즘에 의해 구현되어 있다.
	 * 
	 * HashMap 클래스
	 * Map 인터페이스를 구현한 클래스 중 가장 많이 사용한다.
	 * 자료를 관리하는 방식: 해시 방식
	 * 해시 테이블: 해시 방식의 자료를 저장하는 공간
	 * 해시 함수: key 값이 정해지면 그에 대응하는 해시 테이블의 저장 위치가 정해지는데 이런 위치를 계산하는 함수이다.
	 * index = hash(key) 	// index는 저장 위치이다.
	 * key를 알고 있는 상태에서 value를 검색하는데 걸리는 시간은 산술적으로 계산할 수 있다.
	 * 장점: 자료 추가 속도나 검색 속도가 상당히 빠르다.
	 * 서로 다른 key값에 같은 index가 반환되는 충돌(collision)이 발생하는 경우도 있다.
	 * 	-> 해시 테이블에 데이터를 꽉 채우지 않고 적정 수준이 되면 테이블을 확장해 충돌 발생 확률을 낮춘다.
	 * 	-> 자바는 해시 테이블의 75%까지만 사용하고 컴파일러가 자동으로 메모리를 확장한다.
	 * 
	 * containKey(데이터)
	 * 매개변수 : 데이터
	 * 리턴형: boolean, 있으면 true, 없으면 false 리턴
	 * 기능: 매개변수로 받은 데이터 즉, 해당 key 값이 존재하는지 확인한다.
	 * =========================================
	 */
	
}
