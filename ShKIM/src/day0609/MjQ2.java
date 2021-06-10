package day0609;

public class MjQ2 {

	public static void main(String[] args) {

		System.out.println(solution(12));

	}

	// 피보나치 수열: 첫 번째 항 0, 두 번째 항 1, 그 이후의 항은 앞의 두항을 더한값
	// 입력: 정수 n
	// 출력: n 이하 까지의 피보나치 수열 출력
	public static int solution(int n) {
		int a = 1;
		int b = 1;
		int sum = 0;

		for (int i = 3; i < n; i++) {
			sum = a + b;
			b = a;
			a = sum;
		}

		return sum;
	}

}
