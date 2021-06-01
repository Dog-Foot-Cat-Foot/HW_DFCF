package day01;

import java.util.Scanner;

public class MjQ1 {

	public static void main(String[] args) {
		// 369게임
		// 100보다 작은 정수 1개 입력 (1 ~ 99)
		// 1부터 그 수까지 순서대로 공백을 두고 수를 출력
		// 3, 6, 9 인 경우 X 출력
		// 33 처럼 숫자 두개이면 XX 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = 0, a = 1, b = 1;

		while (true) {
			// num 값 입력 받기
			num = sc.nextInt();

			if (num > 0 && num < 100) {
				break;
			} else {
				System.out.println("1부터 99까지의 정수를 입력하세요.");
			}

		}

		// 출력
		for (int i = 1; i <= num; i++) {
			if (i > 10) {
				a = i / 10;
				b = i % 10;
			} else {
				a = i;
			}

			if (a % 3 != 0 && (a == 0 || b == 0 )) {
				System.out.print(i + " ");
			} else if (a % 3 == 0 && (b % 3 == 0 && b != 0)) {
				System.out.print("XX ");
			} else if (a % 3 == 0 || b % 3 == 0) {
				System.out.print("X ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
