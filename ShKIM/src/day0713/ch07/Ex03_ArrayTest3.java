package day0713.ch07;

public class Ex03_ArrayTest3 {

	public static void main(String[] args) {
		
		// 길이가 5인 double형 배열 선언
		double[] data = new double[5];
		// 유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언
		int size = 0;
		
		// 0, 1, 2 번째 배열 요소에 데이터 대입
		// 데이터를 저장한 후 size 변수 데이터 1씩 증가
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		// 유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
		for(int i = 0; i < size; i++) {
			// data 배열 변수의 0, 1, 2번째 배열 요소 데이터 출력
			System.out.println(data[i]); // 10.0, 20.0, 30.0
		}

	}

}