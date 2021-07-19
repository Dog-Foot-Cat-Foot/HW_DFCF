package day0720.ch10;

public interface Queue {
	
	//------------------------------------------
	// <1> 배열의 맨 마지막에 추가
	// <2> 배열의 맨 처음 항목 반환
	// <3> 현재 Queue에 있는 개수 반환
	//------------------------------------------
	void enQueue(String title);		// <1>
	String deQueue();				// <2>	
	int getSize();					// <3>

}
