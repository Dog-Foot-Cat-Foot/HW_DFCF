package day0603;

public class ErQ1 {

	public static void main(String[] args) {

		System.out.println(function(14));

	}

	// 분수 문제
	public static String function(int x) {
		// 배열에 숫자 대입
		int[] a = { 1, 1, 2, 3, 2, 3, 4, 5, 4 };
		int[] b = { 1, 2, 1, 1, 2, 2, 1, 1, 2 };

		// x에 대한 출력 값 대입
		String result = a[x % 9 - 1] + "/" + (b[x % 9 - 1] + 2 * (x / 9));

		return result;
	}
}
