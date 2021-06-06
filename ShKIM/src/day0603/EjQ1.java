package day0603;

import java.util.Scanner;

public class EjQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		function(n);
	}

	// n층의 별 계단 출력
	public static void function(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			System.out.println("**");
		}

	}

}
