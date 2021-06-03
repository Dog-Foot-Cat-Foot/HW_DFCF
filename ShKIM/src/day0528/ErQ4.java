package day0528;

import java.util.Scanner;

public class ErQ4 {

	public static void main(String[] args) {
		// 바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때
		// n개의 흰 돌이 놓인 위치 출력
		// 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력
		// 둘째 줄 부터 n+1 번째 줄까지 흰 돌을 놓을 좌표(x, y)가 n줄 입력된다
		// n은 10이하의 자연수이고 x,y좌표는 1 ~ 19까지이며, 같은 좌표는 입력되지 않는다
		// 흰 돌이 있는 위치는 1, 없는 곳은 0

		Scanner sc = new Scanner(System.in);
		int cnt = 0, x = 0, y = 0;
		int[][] pan = new int[19][19];
		System.out.println("흰 돌의 개수를 입력하세요. ");

		while (true) {
			cnt = sc.nextInt();
			if (cnt > 0 && cnt <= 10) {
				break;
			} else {
				System.out.println("다시 입력해 주세요. (10이하의 자연수)");
			}

		}

		System.out.println("흰 돌을 놓을 좌표(x, y)를 입력해 주세요.");

		for (int i = 0; i < cnt; i++) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > 0 && x <= 19 && y > 0 && y <= 19) {
				pan[x - 1][y - 1] = 1;
			} else {
				System.out.println("잘못 입력하셨습니다. 1 ~ 19 중 입력해 주세요.");
				i--;
			}

		}

		for (int i = 0; i < pan.length; i++) {
			for (int j = 0; j < pan[i].length; j++) {
				System.out.print(pan[i][j] + " ");
			}
			System.out.println();
		}
	}

}
