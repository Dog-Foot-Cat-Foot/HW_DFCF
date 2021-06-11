package day0611;

public class EjQ1 {

	public static void main(String[] args) {
		solution(5);
	}

	// 세로형 n*n 배열 구조 숫자 출력
	public static void solution(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((i + 1) + (n * j) + " ");
			}
			System.out.println();
		}

	}

}
