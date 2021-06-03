package day0528;

import java.util.ArrayList;
import java.util.Scanner;

public class EjQ3 {

	public static void main(String[] args) {
		// 0보다 크거나 같고, 99보다 작거나 같은 정수
		// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고
		// 각 자리의 숫자를 더한다
		// 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면
		// 새로운 수를 만들 수 있다
		// n이 주어졌을 때, n의 사이클의 길이를 구하는 프로그램 작성
		// n은 0보다 크거나 같고, 99보다 작거나 같은 정수

		Scanner sc = new Scanner(System.in);
		int num = 0, a = 0, b = 0, sum = 0, c = 0, newNum = 0, cnt = 0;

		System.out.println("숫자를 입력해 주세요.");

		while (true) {
			num = sc.nextInt();

			if (num >= 0 && num <= 99) {
				a = num / 10; // 주어진 수의 왼쪽 자리 수
				b = num % 10; // 주어진 수의 오른쪽 자리 수

				break;
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}

		while (true) {
			sum = a + b; // 각 자리 숫자 더함
			c = sum % 10; // 합의 가장 오른쪽 자리 수
			newNum = b * 10 + c; // 새로운 수
			a = newNum / 10;
			b = newNum % 10;

			cnt++; // 사이클 길이 체크

			if (num == newNum) {
				break;
			}
		}

		System.out.println(cnt);

	}

}
