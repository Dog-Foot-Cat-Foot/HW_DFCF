package day0609;

import java.util.*;

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
		boolean isCheck = true;
		
		Queue<Integer> array = new LinkedList<>();

		
		// 카드 넣기
		for (int i = 0; i < n; i++) {
			array.add(i + 1);
		}

		// 반복
		while (array.size() > 1) {
			if (isCheck) {
				array.remove();
				isCheck = false;
			} else {
				array.offer(array.poll());
				isCheck = true;
			}
		}

		return array.poll();
	}

}
