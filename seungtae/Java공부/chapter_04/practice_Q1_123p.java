package chapter_04;

public class practice_Q1_123p {

	public static void main(String[] args) {
		// 연습문제 
		
		// Q1 
		// operator값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 
		// switch-case문을 사용해 작성해 보세요.
		
		int num = 10;
		int num1 = 2;
		char operator = '+';
		int result = 0; // 결과저장할 변수 선언 및 초기화 
		
		if(operator=='+') {
			result = num + num1;
		}else if(operator=='-') {
			result = num - num1;
		}else if(operator=='*') {
			result = num * num1;
		}else if(operator=='/') {
			result = num / num1;
		}else {
			// else에 걸렸을 때 리턴하는 값이 없기때문에 초기화를 해줘야함 
			// 만약 오류 안나고 싶으면 result = 0; 이런식으로 else에도 result 값을 줘야
			System.out.println("수행값없음");
		}
	
		System.out.println("연산결과값은 " + result + "입니다.");
	}


}
