package chapter_07;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열 길이만큼 출력하기 
		
		// 배열 변수 data 선언 및 초기화 
		double[] data = new double[5];
		
		data[0] = 10.0; // 배열변수 첫 번째 값 대입 
		data[1] = 20.0; // 배열변수 두 번째 값 대입 
		data[2] = 30.0; // 배열변수 세 번째 값 대입 
		
		// 반복문으로 배열변수 길이만큼 반복 
		for(int i=0; i<data.length; i++) { 
			System.out.println(data[i]); // 배열변수 출력 
		}
	}

}
