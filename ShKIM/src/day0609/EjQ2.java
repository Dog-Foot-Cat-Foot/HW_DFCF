package day0609;

public class EjQ2 {

	public static void main(String[] args) {
		solution();
	}

	// 구구단 예쁘게 출력(2 ~ 5단)
	public static void solution() {
		int a = 2;
		int b = 1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%d x %d = %2d", a++, b, a * b);
				if (j != 3) {
					System.out.printf("\t");
				}
			}
			a = 2;
			b++;
			System.out.println();
		}
	}

}
