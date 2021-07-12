package day0713.ch07;

public class Ex12_TwoDimension2 {

	public static void main(String[] args) {
		
		// 2행 3열의 int형 이차원 배열 생성
		int[][] arr = new int[2][3];
		
		// arr 배열의 행 길이만큼 반복 수행
		for(int i = 0; i < arr.length; i++) {
			// arr 배열읠 열 길이만큼 반복 수행
			for(int j = 0; j < arr[i].length; j++) {
				// i행 j 열의 데이터 출력
				System.out.println(arr[i][j]); // 0 
				// 2차원 배열을 선언만 하고 초기화를 따로 하지 않았기 때문에,
				// 모두 0으로 자동 초기화되었다
			}
			System.out.println();
		}
		// 행 길이
		System.out.println(arr.length);
		// 열 길이
		System.out.println(arr[0].length);

	}

}
