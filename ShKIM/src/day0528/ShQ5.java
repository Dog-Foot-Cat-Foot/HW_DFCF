package day0528;

public class ShQ5 {

	public static void main(String[] args) {
		// '@'문자를 10개 출력하는 함수를 작성한 후 
		// 함수를 세 번 호출하여 아래와 같이 출력하는 프로그램 작성
		
		ShQ5 q5 = new ShQ5();
		q5.print();
		q5.print();
		q5.print();

	}
	
	// 클래스 변수 선언
	static int cnt = 0;
	
	// 함수 선언
	public void print() {
		cnt++;
		if(cnt == 1) {
			System.out.println("first");
		} else if (cnt == 2) {
			System.out.println("second");
		} else {
			System.out.println("third");
		}
		
		System.out.println("@@@@@@@@@@");
	}

}
