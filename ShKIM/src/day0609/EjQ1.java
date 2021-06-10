package day0609;

public class EjQ1 {

	public static void main(String[] args) {

		solution(12, 4);

	}

	// 가로 n, 세로 m 절취선 그리기
	// 가로 -, 세로 | 겹침 +
	public static void solution(int n, int m) {

		for (int i = 0; i < m; i++) {  // 행
			for (int j = 0; j < n; j++) {  // 열
				if ((i == 0 || i == m - 1) && (j == 0 || j == n - 1)) { 
					System.out.print("+");
				} else if (i == 0 || i == m - 1) {
					System.out.print("-");
				} else if (j == 0 || j == n - 1) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
