package day0713.ch07;

public class Ex07_ArrayCopy {

	public static void main(String[] args) {
		
		// int형 배열 선언과 동시에 데이터 초기화
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		// System.arraycopy() 메서드 사용
		// 배열 복사
		System.arraycopy(array1, 0, array2, 1, 4);
		// System.arraycopy(array1, 0, array2, 1, 5);
		// 만약 위와 같이 선언하면 java.lang.ArrayIndexOutOfBoundsException 오류 발생한다
		// array2 배열 길이보다 복사할 요소 개수가 많기 때문이다
		
		// array2 배열의 길이만큼 반복 수행
		for(int i = 0; i <array2.length; i++) {
			// array2의 0~4번째 배열 요소 데이터 출력
			System.out.println(array2[i]); // 1, 10, 20, 30, 40
		}
		
		/*
		 * 배열 복사하기
		 * System.arraycopy(src, srcPos, dest, destPos, length)
		 * src: 복사할 배열 이름
		 * srcPos: 복사할 배열의 첫 번째 위치
		 * dest: 복사해서 붙여 넣을 대상 배열 이름
		 * destPos: 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치
		 * length: src 에서 dest로 자료를 복사할 요소 개수
		 * 
		 * 복사할 대상 배열의 전체 길이가 복사할 요소 개수보다 작다면 오류가 난다
		 */

	}

}
