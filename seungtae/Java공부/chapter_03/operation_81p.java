package chapter_03;

public class operation_81p {

	public static void main(String[] args) {
		// 조건 연산자 사용
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch; // char형 ch변수 선언 
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		// 주어진 조건식이 참인 경우와 거짓인 경우에 다른 결과 값이 나옵니다.
		
		System.out.println(ch);

	}

}
