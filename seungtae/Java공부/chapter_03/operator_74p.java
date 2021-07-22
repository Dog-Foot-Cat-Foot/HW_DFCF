package chapter_03;

public class operator_74p {

	public static void main(String[] args) {
		// 산술 연산자를 이용하여 총점과 평균 구하
		
		int mathScore = 90; 
		int engScore = 70;
		
		int totalScore = mathScore + engScore; // 90+70 이 total변수에 저장 
		
		System.out.println(totalScore); // 160 
		
		double avgScore = totalScore/2.0; // 평균을 구하는 변수의 자료형은 실수형이므로 나눌 때 
		                                  // 2.0 으로 해줘야함 
		
		System.out.println(avgScore); // 80.0
		
		
	}

}
