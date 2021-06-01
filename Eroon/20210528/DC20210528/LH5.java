package DC20210528;

import java.util.Scanner;

public class LH5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] test = new int[3];
		
		for(int i = 0; i<test.length; i++) {
			test[i]=scan.nextInt();
		}

		long num = sum(test);

		System.out.println(num);

	}

	static long sum(int[] a) {
		long result = 0;

		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}

		return result;
	}
}
