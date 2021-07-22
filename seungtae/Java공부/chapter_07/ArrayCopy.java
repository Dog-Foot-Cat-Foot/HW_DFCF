package chapter_07;

public class ArrayCopy {

	public static void main(String[] args) {
		// System.arraycopy()로 배열 복사하기 
		
		// int형 배열 array1 변수에 데이터 저장 
		int[] array1 = {10,20,30,40,50};
		// int형 배열 array2 변수에 데이터 저장 
		int[] array2 = {1,2,3,4,5};
		
		// (복사할 배열 , 복사할 첫 위치 , 대상 배열 , 붙여 넣을 첫 위치 , 복사할 요소 개수 ) 
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
