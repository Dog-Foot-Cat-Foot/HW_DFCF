package day0603;

public class ErQ1 {

	public static void main(String[] args) {

		System.out.println(function2(14));

	}

	// 분수 문제 다시 푼다
	public static String function2(int x) {
		int a = 0;
		int b = 0;
		int size = 1; // 체크
		String result = "";
		int num = 0;

		while (num < x) {
			// 홀수
			if (size % 2 != 0) {
				for (int j = 1; j <= size; j++) {
					if (num == x)
						break;

					a = j;
					num++;
				}

				for (int j = size - 1; j > 0; j--) {
					if (num == x)
						break;

					a = j;
					num++;
				}
			}
			size++;
		}

		size = 0;
		num = 0;

		while (num < x) {
			// 짝수
			if (size % 2 == 0) {
				for (int j = 1; j <= size; j++) {
					if (num == x)
						break;

					b = j;
					num++;
				}

				for (int j = size - 1; j > 0; j--) {
					if (num == x)
						break;

					b = j;
					num++;
				}
			}
			size++;
		}

		result = a + "/" + b;

		return result;
	}

}
