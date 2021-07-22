package chapter_05;

public class FunctionTest_137p {

	public static void main(String[] args) {
		// 함수 구현하고 호출하기 
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2); // add 함수 호출 
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다. ");
	}
	
	// add 함수 정의 
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; // 결과 값 반환 
	}

}
