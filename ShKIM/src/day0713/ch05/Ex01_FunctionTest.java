package day0713.ch05;

public class Ex01_FunctionTest {
	// main() 함수가 사용할 메모리 공간이 스택에 생성
	public static void main(String[] args) {
		
		// int형 변수 num1, num2 에 데이터 10, 20 초기화
		int num1 = 10;
		int num2 = 20;
		
		// int형 변수 sum 에 
		// add() 함수 호출, num1, num2의 데이터 10, 20을 매개변수로 넘겨줌
		// 함수가 호출되면 그 함수가 사용할 메모리 공간이 스택에 생성
		// 즉, add() 함수를 호출하면서 스택에 메모리 공간 생성
		// 수행이 끝나고 리턴값을 반환하며 함수에 할당했던 메모리 공간 해제됨
		// add() 함수의 리턴값 (int)30 대입
		int sum = add(num1, num2);
		// num1, num2, sum의 데이터 출력
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
		// 10, 20, 30

	}
	
	// 함수 반환형: int
	// 함수 이름: add
	// 매개변수: int n1, int n2
	public static int add(int n1, int n2) {
		// int형 변수 result 에 매개변수 n1, n2의 데이터를 더하여 대입
		int result = n1 + n2; 
		return result; 	   // return 예약어를 사용하여 result 데이터 반환
	}
	
	/*
	 * 반환형이란? 반환 값의 자료형을 말한다
	 * 			반환 값이 없을 경우 void 예약어를 사용한다(반환할 값이 없다는 뜻)
	 * 매개변수란? 함수 내부에서 사용할 괄호 안의 변수를 말한다
	 * return 예약어: 함수 수행을 끝내고 프로그램 흐름 중에서 호출한 곳으로 다시 되돌아갈 때 사용하기도 함
	 * 지역 변수: 함수 내부에서 사용하는 변수, 스택 메모리에 생성됨
	 */

}