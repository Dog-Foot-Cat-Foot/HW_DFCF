package day0528;

public class ErQ5 {

	public static void main(String[] args) {
		// 정수 n개가 주어졌을 때
		// n개의 합을 구하는 함수 작성

		int[] test = { 1, 10, 2999989 };

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
