package day0727.ch12;

import java.util.HashSet;

public class Ex07_HashSetTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형 HashSet 변수 hashSet 선언, 
		//	String형 HashSet 인스턴스 생성하여 리턴된 메위주 대입
		// <2> hashSet 변수로 add() 메서드 호출, "김석진" 데이터를 가진 String 객체 생성하여
		//	hashSet에 추가
		// <3> 추가 안됨, HashSet은 중복을 허용하지 않음
		// <4> hashSet 데이터 출력, [김석진, 민윤기, 박지민, 전정국]
		//------------------------------------------
		HashSet<String> hashSet = new HashSet<String>();	// <1>
		hashSet.add(new String("김석진"));					// <2>
		hashSet.add(new String("박지민"));
		hashSet.add(new String("민윤기"));
		hashSet.add(new String("전정국"));
		hashSet.add(new String("전정국"));					// <3>
		
		System.out.println(hashSet);						// <4>
		
		
		/* ========================================
		 * Set 인터페이스
		 * 순서와 상관없이 중복을 허용하지 않는 경우에 사용한다.
		 * 예를 들어, 회원 아이디, 주민등록번호, 사번, 홈쇼핑 주문 번호 등이 있다.
		 * 
		 * HashSet 클래스
		 * 집합 자료 구조를 구현하며 중복을 허용하지 않는다.
		 * 자료가 추가된 순서와 상관없이 출력된다.
		 * ========================================
		 */

	}

}
