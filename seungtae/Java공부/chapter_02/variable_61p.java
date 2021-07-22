package chapter_02;

public class variable_61p {

	public static void main(String[] args) {
		// 상수 사용하기
		
		// 상수란? 항상 변하지 않는 값 
		// 상수를 사용할 땐 예약어 final을 사용해야한다.
		// 상수 선언할 때 변수명은 대문자가 좋다. 
		final int MAX_NUM = 100; 
		final int MIN_NUM;
		
		MIN_NUM = 0; // 사용하기 전에 초기화. 초기화하지 않으면 오류 발생 
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM = 1000; 이미 위에서 MAX_NUM 변수안에 상수 데이터 값을 넣었으므로 재사용 불가 
		

	}

}
