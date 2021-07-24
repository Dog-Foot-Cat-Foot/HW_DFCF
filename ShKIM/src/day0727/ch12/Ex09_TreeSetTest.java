package day0727.ch12;

import java.util.TreeSet;

public class Ex09_TreeSetTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형으로 TreeSet 변수 treeSet 선언, String형으로 TreeSet 인스턴스 생성후 리턴된 메위주 대입
		// <2> treeSet변수로 add() 메서드 호출하여 "김석진" 데이터 추가 
		// <3> treeSet변수로 add() 메서드 호출하여 "박지민" 데이터 추가 
		// <4> treeSet변수로 add() 메서드 호출하여 "홍길동" 데이터 추가 
		//------------------------------------------
		TreeSet<String> treeSet = new TreeSet<String>();	// <1>
		treeSet.add("김석진");			// <2>				
		treeSet.add("박지민");			// <3>
		treeSet.add("민윤기");			// <4>
		
		//------------------------------------------
		// 향상된 for문으로 treeSet에 저장된 데이터 하나씩 가져와서 출력
		// 김석진
		// 민윤기
		// 박지민
		//------------------------------------------
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		
		/* ========================================
		 * TreeSet 클래스
		 * Collection 인터페이스나 Map 인터페이스를 구현한 클래스 중 
		 * Tree로 시작하는 클래스는 데이터를 추가한 후 결과를 출력하면 결과 값이 정렬된다.
		 * 자료의 중복을 허용하지 않으면서 출력 결과 값을 정렬하는 클래스이다.
		 * 자바는 정렬을 구현하기 위해 '이진 트리(binary tree)'를 사용한다.
		 * 
		 * 이진 검색 트리
		 * 트리는 자료 사이의 계층 구조를 나타내는 자료 구조이다.
		 * ========================================
		 */

	}

}
