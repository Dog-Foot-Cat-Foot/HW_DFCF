package day0611;

import java.util.Scanner;

public class ErQ2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(solution(num));

	}

	// n 번째로 작은 종말의 숫자 구하기
	// 제일 작은 종말의 숫자 : 666 / 1666 / 2666 / 3666 / ...
	// int 길이 구하는 메서드 : (int)(Math.log10(num) + 1)

	public static int solution(int n) {
		int length = (int) (Math.log10(n) + 1);
		StringBuilder buffer = new StringBuilder(); // 앞 자리

		//다시 풀기!!!
		// 6660, 6661 인 경우도 고려해야 함
		
/* 
		if (n % 10 == 1) {
			buffer.append("66");
		} else if (n % 10 == 0) {
			buffer.append("966");
			length--;
		} else {
			buffer.append((n % 10 - 1) + "66");
		}

		// length 길이만큼 "6" buffer에 추가
		while (length > 0) {
			buffer.append("6");
			length--;
		}
*/
		return Integer.parseInt(buffer.toString());
	}

}
