package day0727.ch12;

import java.util.ArrayList;

//------------------------------------------
// MyStack 클래스 선언
//------------------------------------------
class MyStack {
	
	//------------------------------------------
	// String형으로 ArrayList 멤버 변수 arrayStack 선언, 
	// String형으로 ArrayList 인스턴스 생성하여 리턴된 메위주 대입
	//------------------------------------------
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	//------------------------------------------
	// push() 메서드 선언, String형 데이터를 arrayStack에 추가한다.
	//------------------------------------------
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//------------------------------------------
	// pop() 메서드 선언
	// <1> int형 len 변수 선언, 
	//	arrayStack으로 size() 메서드 호출하여 저장된 유효한 자료의 개수를 리턴받아서 대입
	// <2> len == 0 이라면
	// <3> null 리턴하며 함수 중단
	// <4> arrayStack으로 remove() 메서드 호출하여 맨 뒤에 있는 자료 반환하고 배열에서 제거
	//------------------------------------------
	public String pop() {
		int len = arrayStack.size();		// <1>
		if(len == 0) {						// <2>
			System.out.println("스택이 비었습니다.");
			return null;					// <3>
		}
		
		return arrayStack.remove(len-1);	// <4>
	}

}

public class Ex05_StackTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> MyStack형 stack 변수 선언, MyStack 인스턴스 생성하여 리턴된 메위주 대입
		// <2> stack으로 push() 메서드 호출, "A" 요소 추가
		// <3> stack으로 push() 메서드 호출, "B" 요소 추가
		// <4> stack으로 push() 메서드 호출, "C" 요소 추가
		//------------------------------------------
		MyStack stack = new MyStack();		// <1>
		stack.push("A");					// <2>
		stack.push("B");					// <3>
		stack.push("C");					// <4>
		
		//------------------------------------------
		// <1> stack으로 pop() 메서드 호출, 맨 마지막 요소 리턴하며 삭제, 리턴한 데이터 출력, C
		// <2> stack으로 pop() 메서드 호출, 맨 마지막 요소 리턴하며 삭제, 리턴한 데이터 출력, B
		// <3> stack으로 pop() 메서드 호출, 맨 마지막 요소 리턴하며 삭제, 리턴한 데이터 출력, A
		//------------------------------------------
		System.out.println(stack.pop());	// <1>
		System.out.println(stack.pop());	// <2>
		System.out.println(stack.pop());	// <3>
		
		
		/* =========================================
		 * 스택
		 * 맨 나중에 추가된 데이터를 먼저 꺼내는 방식(Last In First Out; LIFO)
		 * push(): 스택에 자료를 추가하는 것
		 * pop(): 스택에서 자료를 꺼내는 것
		 * top: 스택에 가장 최근에 추가된 자료의 위치
		 * =========================================
		 */

	}

}
