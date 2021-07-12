package day0713.ch07;

public class Ex11_TwoDimension {

	public static void main(String[] args) {
		
		// int형 이차원 배열 선언과 동시에 초기화
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		
		// arr 행의 길이만큼 for문 반복 수행
		for(int i = 0; i < arr.length; i++) {
			// arr[i] 열의 길이만큼 for문 반복 수행
			for(int j = 0; j < arr[i].length; j++) {
				// arr 배열의 i 행 j 열의 데이터 출력
				System.out.println(arr[i][j]);
			}
			// 행 출력 끝난 후 한 줄 띄움
			System.out.println();
		}
		
		/* ===============================================
		 * 다차원 배열
		 * 이차원 이상으로 구현한 배열을 말한다
		 * 
		 * 2행 3열의 이차원 배열 선언
		 * int[][] arr = new int[2][3];
		 * =============================================== 
		 */

	}

}
