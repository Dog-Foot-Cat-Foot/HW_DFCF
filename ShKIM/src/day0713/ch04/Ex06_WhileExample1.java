package day0713.ch04;

public class Ex06_WhileExample1 {

	public static void main(String[] args) {
		
		// 변수를 사용하여 연산을 하거나 그 값을 가져다 사용하려면
		// 변수는 반드시 어떤 값을 가지고 있어야 한다.
		// 초기화 하지 않으면 오류가 발생한다!
		int num = 1;
		int sum = 0;
		
		// while문의 조건식이 true 인 경우 while문 블록 안의 문장 반복 수행
		// 조건식이 false 인 경우 반복 수행 종료
		// 11 <= 10 인 경우 종료
		while(num <= 10) {
			sum += num;  // sum = sum + num 으로 sum 변수에 sum+num 데이터 대입
			num++;		 // num = num + 1
		}
		
		// 만약 num에 데이터를 초기화하지 않았을 경우, 반복문에 사용한 num값은 오류가 발생한다
		// the local variable num may not have been initialized
		// -> 변수를 선언만 하고 초기화 하지 않았는데 연산을 하려 해서 발생한 오류이다 
		
		// sum의 데이터 출력
		System.out.println("1부터 10까지의 합은 " + sum + "임"); // 55
		
		
		/*
		 * while문
		 * while(조건식){ 수행문1; }
		 * 조건식이 true인 동안 수행문을 반복해서 수행
		 * 조건의 true/false에 따라 반복문이 수행하는 경우 적합
		 */

	}

}
