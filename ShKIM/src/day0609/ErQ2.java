package day0609;

import java.util.ArrayList;
import java.util.Scanner;

public class ErQ2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(solution(n));
	}

	// 카드 뽑아서 버림
	// 다음 카드 뽑아서 아래로
	// 마지막 한 장 남을 때 까지 반복
	public static int solution(int n) {
		int result;
		boolean isCheck = true;
		int temp;

		ArrayList<Integer> array = new ArrayList<>();

		// 카드 넣기
		for (int i = 0; i < n; i++) {
			array.add(i + 1);
		}

		// 반복
		while (n > -1) {
			if (isCheck) {
				array.remove(0);
				isCheck = false;
			} else {
				temp = array.remove(0);
				array.add(temp);
				isCheck = true;
			}
			n--;
		}

		result = array.get(0);

		return result;
	}

}
