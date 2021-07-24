package day0727.ch12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//------------------------------------------
// Comparator<String> 인터페이스를 구현한 MyCompare 클래스 선언
// 내림차순 정렬을 구현하였다.
//------------------------------------------
class MyCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
}

public class Ex11_ComparatorTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형으로 Set 변수 set 선언, 
		//	String형으로 TreeSet 인스턴스 생성하며 생성자의 매개변수로 MyCompare 인스턴스를 생성하여 메위주를 던져준다.
		//------------------------------------------
		// TreeSet 클래스를 생성할 때 생성자에 매개변수를 넣지 않으면 원래 String 클래스에
		// 정의된 Comparable 인터페이스의 compareTo() 메서드 구현 내용대로 오름차순으로 정렬된다.
		// MyCompare 인스턴스를 매개변수로 넣었기 때문에 재정의한 
		// compare() 메서드 방식에 따라 내림차순으로 정렬 방식이 바뀐다.
		//------------------------------------------
		// <2> set으로 add() 메서드 호출하여 "aaa" 요소 추가
		// <3> set으로 add() 메서드 호출하여 "bbb" 요소 추가
		// <4> set으로 add() 메서드 호출하여 "ccc" 요소 추가
		// <5> set 출력, [ccc, bbb, aaa]
		//------------------------------------------
		Set<String> set = new TreeSet<String>(new MyCompare());	// <1>
		set.add("aaa");				// <2>
		set.add("bbb");				// <3>
		set.add("ccc");				// <4>

		System.out.println(set);	// <5>
		
		
		/* =========================================
		 * 일반적으로 Comparator 인터페이스보다 Comparable 인터페이스를 더 많이 사용한다.
		 * 다만 어떤 클래스가 이미 Comparable 인터페이스를 구현한 경우에 이 클래스의 정렬 방식을 정의할 때 사용할 수 있다.
		 * 예를 들어 String 클래스는 Comparable 인터페이스의 정렬 방식을 내림차순으로 변경하고 싶을때이다.
		 * String 클래스의 compareTo() 메서드는 final로 선언되어 있어서 상속받아 재정의할 수 없다.
		 * 이러한 경우 Comparator를 사용한다.
		 * =========================================
		 */

	}

}
