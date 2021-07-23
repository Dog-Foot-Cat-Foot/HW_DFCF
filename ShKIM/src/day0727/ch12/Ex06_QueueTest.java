package day0727.ch12;

import java.util.ArrayList;

//------------------------------------------
// MyQueue 클래스 선언
//------------------------------------------
class MyQueue {
	
	//------------------------------------------
	// String형으로 ArrayList 변수 arrayQueue 선언, 
	// String형으로 ArrayList 인스턴스 생성하여 리턴된 메위주 대입
	//------------------------------------------
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	//------------------------------------------
	// enQueue() 메서드 선언
	// 매개변수로 받은 String형 데이터를 arrayQueue로 add() 메서드 호출하여 맨 뒤에 추가
	//------------------------------------------
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	//------------------------------------------
	// deQueue() 메서드 선언
	// <1> int형 len 변수 선언, 
	//	arrayQueue로 size() 메서드 호출하여 저장된 유효한 자료의 개수를 리턴받아서 대입
	// <2> 만약 len의 데이터가 0 이라면
	// <3> null 리턴하며 함수 중단
	// <4> arrayQueue로 remove() 메서드 호출하여 맨 앞의 자료 반환하고 배열에서 제거
	//------------------------------------------
	public String deQueue() {
		int len = arrayQueue.size();		// <1>
		if(len == 0) {						// <2>
			System.out.println("큐가 비었습니다.");
			return null;					// <3>
		}
		return arrayQueue.remove(0);		// <4>
	}
}

public class Ex06_QueueTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> MyQueue형 queue 변수 선언, MyQueue 인스턴스 생성하여 리턴된 메위주 대입
		// <2> queue변수로 enQueue() 메서드 호출, "A" 요소 추가
		// <3> queue변수로 enQueue() 메서드 호출, "B" 요소 추가
		// <4> queue변수로 enQueue() 메서드 호출, "C" 요소 추가
		// <5> queue변수로 deQueue() 메서드 호출, 맨 앞 자료 반환하여 출력, A
		// <6> queue변수로 deQueue() 메서드 호출, 맨 앞 자료 반환하여 출력, B
		// <7> queue변수로 deQueue() 메서드 호출, 맨 앞 자료 반환하여 출력, C
		//------------------------------------------
		MyQueue queue = new MyQueue();			// <1>
		queue.enQueue("A");						// <2>
		queue.enQueue("B");						// <3>
		queue.enQueue("C");						// <4>
		
		System.out.println(queue.deQueue());	// <5>
		System.out.println(queue.deQueue());	// <6>
		System.out.println(queue.deQueue());	// <7>
		
		
		/* =========================================
		 * 큐
		 * 선착순을 생각하자.
		 * 줄을 선 대기열처럼 먼저 추가된 데이터부터 꺼내서 사용하는 방식(First In First Out; FIFO)
		 * =========================================
		 */
		
	}

}
