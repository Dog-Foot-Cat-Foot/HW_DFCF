package chapter_07;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열의 유효한 요소 값 출력하기 
		
		double[] data = new double[5];
		int size = 0; // 유효 값 저장 
		
		data[0] = 10.0;size++;// 배열변수 첫 번째 값 대입  + 유효값 1씩 증가 
		data[1] = 20.0;size++; // 배열변수 두 번째 값 대입 + 유효값 1씩 증가 
		data[2] = 30.0;size++; // 배열변수 세 번째 값 대입 + 유효값 1씩 증가 
		
		// size++ 증가값에 따른 반복문 
		for(int i = 0; i<size; i++) { 
			System.out.println(data[i]);
		}

	}

}
