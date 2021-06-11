package day0611;

public class ErQ1 {

	public static void main(String[] args) {

		System.out.println(solution(626331));

	}

	// 입력한 수 짝수 : 2로 나눔
	// 홀수 : 3을 곱하고 1을 더함
	// 1이 될 때 까지 반복, 500번 반복해도 안나오면 -1 반환

	public static int solution(int num) {
		int answer = 0;
		long num2 = num;

		while (num2 != 1) {
			if (answer == 500) {
				answer = -1;
				break;
			} else if (num2 % 2 == 0) { // 짝수
				num2 = num2 / 2;
			} else if (num2 % 2 != 0) { // 홀수
				num2 = 3 * num2 + 1;
			}
			answer++;
		}

		return answer;
	}

}
