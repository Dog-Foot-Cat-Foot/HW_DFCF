package day0609;

import java.util.TreeSet;

public class ShQ1 {

	public static void main(String[] args) {
		int[] num = { 2, 1, 3, 4, 1 };

		System.out.println(soulation(num));

	}

	// 배열에 있는 수 두 개 뽑아
	// 더해서 만들 수 있는 모든 수
	// 오름차순 return
	public static TreeSet<Integer> soulation(int[] numbers) {
		TreeSet<Integer> hash = new TreeSet<Integer>();

		// 더한 값 배열에 저장
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1 + i; j < numbers.length; j++) {
				hash.add(numbers[i] + numbers[j]);
			}
		}

		return hash;

	}
}
