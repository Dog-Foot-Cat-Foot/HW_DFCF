package day0709.ch03;

public class Ex05_OperationEx5 {

	public static void main(String[] args) {
		
		// int형 변수 num 에 5를 8비트 2진수로 나타낸 데이터 대입
		int num = 0B00000101;
		
		// num의 데이터 00000101을 왼쪽으로 2비트 이동한 데이터 00010100 출력
		System.out.println(num << 2);  // 20
		// num의 데이터 00000101을 오른쪽으로 2비트 이동한 데이터 00000001 출력
		System.out.println(num >> 2);  // 1
		// num의 데이터 00000101을 오른쪽으로 2비트 이동한 데이터 00000001 출력
		System.out.println(num >>> 2); // 1
		
		// num의 데이터 00000101 출력
		System.out.println(num);  // 5
		
		// 변수 num 에 num의 데이터 00000101을 왼쪽으로 2비트 이동한 데이터 00010100 대입
		num = num << 2; 
		System.out.println(num); // 20
		
		/*
		 * 비트 이동 연산자
		 * << 연산자 : 왼쪽으로 비트를 이동하는 연산자
		 * >> 연산자 : 오른쪽으로 비트를 이동하는 연산자
		 * >>> 연산자 : >> 연산과 동일하게 비트를 오른쪽으로 이동, 
		 * 			차이점은 왼쪽에 채워지는 비트 값이 부호 비트와 상관없이 무조건 0이 됨 
		 * 주의! 비트 연산자는 num 값을 참조하여 이동했을 뿐 이라서 num 값이 변하진 않는다.
		 */

	}

}
