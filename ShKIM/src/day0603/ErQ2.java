package day0603;

import java.util.Scanner;

public class ErQ2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String num = sc.next();
		String[] array = num.split("");
		
		System.out.println(function(array));

	}

	// n개의 숫자가 공백 없이 쓰여있음, 합산 출력
	public static int function(String[] array) {
		int result = 0;

		for (String s : array) {
			result += Integer.parseInt(s);
		}

		return result;
	}

}
