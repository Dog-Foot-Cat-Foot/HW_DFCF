package day0603;

public class ErQ1 {

	public static void main(String[] args) {

		// System.out.println(function(14));
		System.out.println(function2(14));

	}

	// 분수 문제 다시 푼다
	public static String function2(int x) {
		int a = 0; // 분모
		int b = 0; // 분자
		int size = 1; // 체크
		String result = "";
		int num = 0;

		while (num < x) {
			// 홀수
			if (size % 2 != 0) {
				System.out.println("size: " + size);
				for (int j = 1; j <= size; j++) {
					if (num == x)
						break;

					a = j;
					System.out.println("증가" + a);
					num++;
				}

				for (int j = size - 1; j > 0; j--) {
					if (num == x)
						break;

					a = j;
					System.out.println("감소" + a);
					num++;
				}
			}
			size++;
		}

		System.out.println("====");

		size = 0;
		num = 0;

		while (num < x) {
			// 짝수
			if (size % 2 == 0) {
				System.out.println("size: " + size);
				for (int j = 1; j <= size; j++) {
					if (num == x)
						break;

					b = j;
					System.out.println("증가" + b);
					num++;
				}

				for (int j = size - 1; j > 0; j--) {
					if (num == x)
						break;

					b = j;
					System.out.println("감소" + b);
					num++;
				}
			}
			size++;
		}

		result = a + "/" + b;

		return result;
	}

	// 분수 문제 (X)
	public static String function(int x) {
		// 배열에 숫자 대입
		int[] a = { 1, 1, 2, 3, 2, 3, 4, 5, 4 };
		int[] b = { 1, 2, 1, 1, 2, 2, 1, 1, 2 };

		// x에 대한 출력 값 대입
		String result = a[x % 9 - 1] + "/" + (b[x % 9 - 1] + 2 * (x / 9));

		return result;
	}
}
