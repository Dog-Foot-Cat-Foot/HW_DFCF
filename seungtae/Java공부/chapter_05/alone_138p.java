package chapter_05;

public class alone_138p {

	public static void main(String[] args) {
		// 나 혼자 코딩 
		
		int num1 = 20;	// int형 변수 선언 및 데이터 입력 
		int num2 = 10;  // int형 변수 선언 및 데이터 입력 
		
		// 각각의 함수호출 
		int sum = add(num1,num2);  
		System.out.println("합은" + " = " + sum + "입니다.");
		
		int subtract = sub(num1,num2);
		System.out.println("빼기" + " = "  + subtract + "입니다.");
		
		int division = div(num1,num2);
		System.out.println("나누기" + " = " + division + "입니다.");
		
		int multiply = mul(num1,num2);
		System.out.println("곱하기" + " = " + multiply + "입니다.");

	}
	// 각각 함수에 맞는 메소드 정의 
	public static int add(int n1 , int n2) { // 함수자료형 , 함수이름 , 받을 매개 변수 설정 
		int result = n1 + n2;  // 반환할 값의 형태 
		return result; // 반환 값 리턴 
	}
	
	public static int sub(int n1 , int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int div(int n1 , int n2) {
		int result = n1 / n2;
		return result;
	}
	
	public static int mul(int n1 , int n2) {
		int result = n1 * n2;
		return result;
	}


	

}
