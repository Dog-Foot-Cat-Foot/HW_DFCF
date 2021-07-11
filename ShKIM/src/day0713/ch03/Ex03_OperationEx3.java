package day0713.ch03;

public class Ex03_OperationEx3 {

	public static void main(String[] args) {
		
		// int형 정수 num1에 데이터 10 초기화, int형 정수 i에 데이터 2 초기화
		int num1 = 10;
		int i = 2;
		
		// boolean형 변수 value 선언과 동시에
		// num1 = 10 + 10 연산, num1 = 20
		// 20 < 10 관계 연산 시, false 리턴
		// && 는 두 항 모두 true인 경우만 true이므로, 뒤에 나오는 항과 관계없이 false 임
		// 자바에서는 이런 경우 뒤에 나오는 항은 실행조차 되지 않음(단락 회로 평가)
		// value 변수에 false 대입
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // false
		System.out.println(num1);  // 20
		System.out.println(i);     // 2
		
		// value 변수에 
		// num1 = 20 + 10 연산, num1 = 30
		// 30 > 10 관계 연산 시, true 리턴
		// || 는 하나만 true여도 true 이므로, 뒤에 나오는 항과 관계없이 true 임
		// 단락 회로 평가로 뒤에 나오는 항은 실행하지 않음
		// value 변수에 true 대입
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value); // true
		System.out.println(num1);  // 30
		System.out.println(i);     // 2
		
		/*
		 * 관계 연산자( >, <, >=, <=, ==, != )는 true, false 리턴
		 * 논리 연산자
		 * && (논리 곱) : 두 항이 모두 true인 경우에만 true, 그렇지 않은 경우는 false
		 * || (논리 합) : 두 항 중 하나의 항만 true이면 결과 값은 true, 두 항이 모두 false이면 false
		 * ! (부정) : true -> false, false -> true 바꿈
		 * 
		 * 단락 회로 평가(Short Circuit Evaluation; SCE)란?
		 * 논리 곱, 논리 합 연산 시 두 항을 모두 실행하지 않더라도 결과 값을 알 수 있는 경우
		 * 나머지 항은 실행되지 않는 것을 말한다
		 */
		
	}

}
