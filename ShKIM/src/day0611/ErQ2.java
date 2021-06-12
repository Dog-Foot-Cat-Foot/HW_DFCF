package day0611;

import java.util.Scanner;

public class ErQ2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(solution(num));

	}

	// n 번째로 작은 종말의 숫자 구하기
	// 제일 작은 종말의 숫자 : 666 / 1666 / 2666 / 3666 / ...
	// 문자열 포함 여부 반환 메서드 : contains()

	public static int solution(int n) {

		int cnt = 1;
		int answer = 0;

		for (int i = 666; cnt <= n; i++) {
			if (("" + i).contains("666")) { // 666이 포함될 경우
				cnt++;
				answer = i;
			}
		}

		return answer;
	}

}
