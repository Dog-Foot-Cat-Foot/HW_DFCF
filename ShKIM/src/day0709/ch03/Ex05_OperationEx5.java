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
		
		num = num << 2;
		System.out.println(num);

	}

}
