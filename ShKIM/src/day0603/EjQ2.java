package day0603;

import java.util.Scanner;

public class EjQ2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		function(n);

	}

	// n*n 배열 구조 출력, ㄹ자 형태
	public static void function(int n) {
		int num = 0;
		boolean isEven = true;
		int size = 0;

		while (size < n) {

			if (isEven) {
				for (int i = 0; i < n; i++) {
					System.out.print(++num);
				}
			} else {
				for (int i = 0; i < n; i++) {
					System.out.print(num--);
				}
			}
			
			System.out.println();
			isEven = !isEven;
			num += n;
			size++;
		}

	}

}
