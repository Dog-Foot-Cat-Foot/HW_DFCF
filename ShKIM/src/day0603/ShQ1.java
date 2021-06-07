package day0603;

import java.util.Arrays;

public class ShQ1 {

	public static void main(String[] args) {
		// 배열 array i번째 숫자부터 j번째 숫자까지 자르고
		// 정렬했을 때
		// k번째에 있는 수 구하기

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] result = solution(array, commands);

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public static int[] solution(int[] array, int[][] commands) {
		int result[] = new int[commands.length];

		for (int k = 0; k < commands.length; k++) {
			int length = commands[k][1] - commands[k][0] + 1;
			int[] arrayCopy = new int[length];
			int temp, cnt = 1;

			// 배열 자르기
			System.arraycopy(array, commands[k][0] - 1, arrayCopy, 0, length);

			// 배열 오름차순 정렬하기, 버블버블
//			while (cnt < length) {
//				for (int i = 0; i < length - cnt; i++) {
//					if (arrayCopy[i] > arrayCopy[i + 1]) {
//						temp = arrayCopy[i];
//						arrayCopy[i] = arrayCopy[i + 1];
//						arrayCopy[i + 1] = temp;
//					}
//				}
//				cnt++;
//			}
//			
			// sort() 메서드 사용
			Arrays.sort(arrayCopy);
			

			// k번째 수 구하기
			result[k] = arrayCopy[commands[k][2] - 1];
		}

		return result;
	}

}
