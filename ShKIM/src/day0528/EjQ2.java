package day0528;

import java.util.Scanner;

public class EjQ2 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음
		// A+B를 출력하는 프로그램 작성
		// 테스트 케이스의 개수 T
		// 0 < A, B < 10
		// 테스트 케이스마다 "Case #x: " 출력, 번호는 1부터 시작

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");

		int cnt = sc.nextInt();
		int a = 0, b = 0;
		int num[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			if (a > 0 && b < 10) {
				num[i] = a + b;
			} else {
				System.out.println("첫번째 숫자는 0보다 큰 수, 두 번째 숫자는 10보다 작은 수를 입력해 주세요.");
				i--;
			}

		}

		for (int i = 1; i <= num.length; i++) {
			System.out.println("Case #" + i + ": " + num[i - 1]);
		}

	}

}
