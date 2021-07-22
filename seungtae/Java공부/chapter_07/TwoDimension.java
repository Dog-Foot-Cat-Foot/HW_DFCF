package chapter_07;

public class TwoDimension {

	public static void main(String[] args) {
		// 이차원 배열 초기화하기 
		
		// 이차원 배열 선언과 동시에 초기화 
		int[][]	arr = { {1,2,3},{4,5,6} };
	
		// 행을 골라내는 반복문 
		for(int i=0; i<arr.length; i++) { 
			// 각열에대한 데이터를 집어 넣는 반복문 
			for( int j=0; j< arr[i].length; j++) {  
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

	}

}
