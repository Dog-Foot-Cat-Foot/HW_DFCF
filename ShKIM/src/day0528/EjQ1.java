package day0528;

import java.util.Scanner;

public class EjQ1 {

	public static void main(String[] args) {
		// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력
		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		// 연도는 1보다 크거나 같고 4000보다 작거나 같은 자연수
		// 윤년이면 1, 아니면 0 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = 0;

		while (true) {
			num = sc.nextInt();
			if (num >= 1 && num <= 4000) {
				break;
			} else {
				System.out.println("1보다 크거나 같고, 4000보다 작거나 같은 자연수를 입력해주세요.");
			}
		}

		if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
