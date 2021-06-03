package day0603;

public class ShQ2 {

	public static void main(String[] args) {
		// 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있다.
		// 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호 배열 lost, 여벌의 체육복을 가져온 학생들의 번호 배열 reserve
		// 체육수업을 들을 수 있응 학생의 최댓값 리턴
		// 2 <= n <= 30
		// lost, 1 <= length <= n, 중복 x
		// reserve, 1 <= length <= n, 중복 x
		// 여벌 있는 학생이 도난 당했을 수 있음, 남은 체육복 1개니까 못 빌려줌

		int[] a = { 5, 4, 3, 2, 1 };
		int[] b = { 3, 1, 2, 5, 4 };

		System.out.println(solution(10, a, b));

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		// 체육복 있는 학생 수
		int result = n - lost.length;

		// 체육복 개수
		int num = reserve.length;

		// 빌려줄 수 있는 학생 수 구하기
		for (int i = 0; i < lost.length; i++) {

			// 체육복 없으면
			if (num == 0) {
				break;
			}

			// 중복 요소 제거
			for (int j = 0; j < reserve.length; j++) {

				if (lost[i] == reserve[j]) {
					reserve[j] = -2;
					result++;
					num--;
					break;
				}

			}

			// 체육복 없으면
			if (num == 0) {
				break;
			}

			// 중복 요소 제거
			for (int j = 0; j < reserve.length; j++) {

				if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
					reserve[j] = -2;
					result++;
					num--;
					break;
				}
			} // for 끝

		}

		return result;
	}

}
