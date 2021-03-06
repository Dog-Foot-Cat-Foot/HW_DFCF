package day0713.ch07;

public class Ex02_ArrayTest2 {

	public static void main(String[] args) {
		
		//---------------------------------------------------
		// <1> double형으로 길이가 5인 배열 선언
		// <2> data 변수의 0, 1, 2번째 배열 요소에 데이터 대입
		//---------------------------------------------------
		double[] data = new double[5];	// <1>
		data[0] = 10.0; 				// <2>
		data[1] = 20.0;
		data[2] = 30.0;
		
		//---------------------------------------------------
		// 배열 전체 길이만큼 반복 수행
		// <1> 배열의 0~4번째 인덱스 연산
		//---------------------------------------------------
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]); // <1> 10.0, 20.0, 30.0, 0.0, 0.0  
		}
		
		/* =========================================
		 * 전체 배열 길이와 유효한 요소 값
		 * 전체 배열 길이와 현재 배열에 유효한 값이 
		 * 저장되어 있는 배열 요소 개수가 같다고 혼동하면 안된다
		 * =========================================
		 */

	}

}
