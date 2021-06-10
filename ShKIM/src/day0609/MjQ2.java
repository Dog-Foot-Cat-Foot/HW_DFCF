package day0609;

import java.util.*;

public class MjQ2 {

	public static void main(String[] args) {

		solution(12);

	}

	// 피보나치 수열: 첫 번째 항 0, 두 번째 항 1, 그 이후의 항은 앞의 두항을 더한값
	// 입력: 정수 n
	// 출력: n 이하 까지의 피보나치 수열 출력
	public static void solution(int n) {
		int a = 1;
		int b = 1;
		int sum = 0;
		List<Integer> array = new ArrayList<>();
		
		array.add(0);
		array.add(a);
		array.add(b);

		for (int i = 3; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
			array.add(sum);
		}

		System.out.println(array);
	}

}
