package day0611;

import java.util.Scanner;

public class MjQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		solution(a, b, c, d);
	}

	// 1 <= a,b / c,d <= 100
	// 교차하면 "cross", 아니면 "not cross"

	public static void solution(int a, int b, int c, int d) {
		int temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		} else if (c > d) {
			temp = c;
			c = d;
			d = temp;
		}

		if (a < c && c < b && (b < d || d < a)) {
			System.out.println("cross");
		} else if (a < d && d < b && (b < c || c < a)) {
			System.out.println("cross");
		} else {
			System.out.println("not cross");
		}
	}

}
