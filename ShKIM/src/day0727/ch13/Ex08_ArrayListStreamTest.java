package day0727.ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex08_ArrayListStreamTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String형으로 List 변수 sList 선언, String형으로 ArrayList 인스턴스 생성 후 업캐스팅하여 대입
		// <2> sList 변수로 add() 메서드 호출하여 "Edward" 추가
		// <3> sList 변수로 add() 메서드 호출하여 "Thomas" 추가
		// <4> sList 변수로 add() 메서드 호출하여 "Hardy" 추가
		//------------------------------------------
		List<String> sList = new ArrayList<String>();
		sList.add("Edward");
		sList.add("Thomas");
		sList.add("Hardy");
		
		//------------------------------------------
		// <1> String형으로 Stream 변수 stream 선언, sList 변수로 stream() 메서드 호출하여 리턴된 메위주 대입
		//	생성된 스트림은 내부적으로 ArrayList의 모든 요소를 가지고 있다.
		// <2> stream 변수로 forEach() 메서드 호출하여 최종연산,
		//	배열의 요소를 하나씩 출력, Edward Thomas Hardy
		//	forEach() 메서드가 수행되면서 자료는 소모된다.
		//------------------------------------------
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//------------------------------------------
		// <1> sList로 stream() 메서드 호출하여 sorted() 중간 연산, forEach() 메서드 호출하여 최종연산
		//	sList에 있는 요소를 정렬 후 출력해라
		//	스트림 새로 생성, 정렬, 요소를 하나씩 꺼내어 출력
		//	Edward Hardy Thomas 
		//------------------------------------------
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		/* =========================================
		 * Collection에서 스트림 생성하고 사용하기
		 * 
		 * Stream<E> stream() : 스트림 클래스를 반환한다
		 * 
		 * forEach() : 내부적으로 반복문이 수행된다.
		 * sorted() : 정렬을 한다. 자료 클래스가 Comparable 인터페이스를 구현해야 한다. 
		 * 
		 * 스트림의 특징
		 * - 자료의 대상과 관계없이 동일한 연산을 수행한다
		 * - 한 번 생성하고 사용한 스트림은 재사용할 수 없다
		 * - 스트림의 연산은 기존 자료를 변경하지 않는다
		 * - 스트림의 연산은 중간 연산과 최종 연산이 있다
		 * =========================================
		 */

	}

}
