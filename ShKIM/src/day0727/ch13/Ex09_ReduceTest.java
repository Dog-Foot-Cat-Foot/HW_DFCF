package day0727.ch13;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//------------------------------------------
// BinaryOperator<String> 인터페이스를 구현한 CompareString 클래스
// 두 문자열 길이를 비교한다.
//------------------------------------------
class CompareString implements BinaryOperator<String> {
	
	//------------------------------------------
	// apply(String s1, String s2) 메서드 오버라이딩
	// <1> s1의 바이트 수의 길이가 s1의 길이보다 같거나 길다면 s1 리턴
	// <2> s2의 바이트 수의 길이가 길다면 s2 리턴
	//------------------------------------------
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;	// <1>
		else return s2;					// <2>
	}
	
}

public class Ex09_ReduceTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> String 배열 greetings 변수 선언, 데이터 대입
		String[] greetings = {"안녕하세요~~", "hello", "Good morning", "반갑습니다^^"};	
		
		//------------------------------------------
		// 람다식을 직접 구현하는 방법
		//------------------------------------------
		// <1> stream 생성, reduce() 연산
		//	초기값 : "", 수행할 기능 : 람다식 구현, s1, s2를 매개변수로 전달한다 
		//	apply() 메서드 자동 호출
		// <2> s1의 바이트 수의 길이가 s2보다 같거나 길다면
		// <3> s1를 리턴한다
		// <4> s2의 바이트 수의 길이가 더 길다면 s2를 리턴한다
		//	출력: 안녕하세요~~
		//------------------------------------------
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {	// <1>
			if(s1.getBytes().length >= s2.getBytes().length)	// <2>
				return s1;			// <3>
			else return s2; }));	// <4>
		
		//------------------------------------------
		// BinaryOperator를 구현한 클래스 사용
		//------------------------------------------
		// <1> String형 str 변수 선언, greetings 요소로 stream 생성, reduce() 연산 수행
		// <2> str 데이터 출력, 안녕하세요~~
		//------------------------------------------
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();	// <1>
		System.out.println(str);	// <2>
		
		
		/* =========================================
		 * 프로그래머가 기능을 지정하는 reduce() 연산
		 * reduce() 연산: 내부적으로 스트림의 요소를 하나씩 소모하면서 프로그래머가 직접 지정한 기능을 수행한다.
		 * 	T reduce(T identify, BinaryOperator<T> accumulator)
		 * 	T reduce(초기값, 수행해야 할 기능)
		 * 	처음부터 마지막까지 모든 요소를 소모하면서 람다식을 반복해서 수행하므로 최종연산이다.
		 * 
		 * BinaryOperator 인터페이스
		 * 두 매개변수로 람다식을 구현, 이 람다식이 각 요소가 수행해야 할 기능이 된다.
		 * 함수형 인터페이스로 apply() 메서드를 반드시 구현해야 한다.
		 * apply() 메서드: 두 개의 매개변수와 한 개의 반환 값을 가지는 데, 세 개 모두 같은 자료형이다.
		 * =========================================
		 */
		
	}

}
