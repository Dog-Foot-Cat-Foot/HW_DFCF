package day0528;

import java.util.Scanner;

public class ErQ2 {

	public static void main(String[] args) {
		// 1부터 n까지, 1부터 m까지 숫자가 적힌 (n, m 10이하의 자연수)
		// 서로 다른 주사위 2개를 던졌을 때 나올 수 있는
		// 모든 경우를 출력해보자

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		System.out.println("10이하의 자연수 숫자 2개를 입력해 주세요.");
		while (true) {
			String[] numArray = sc.nextLine().split(" ");

			num1 = Integer.parseInt(numArray[0]);
			num2 = Integer.parseInt(numArray[1]);

			if (num1 <= 10 && num2 <= 10 && num1 > 0 && num2 > 0) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}

		}

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + " " + j);
			}
		}

	}

}
