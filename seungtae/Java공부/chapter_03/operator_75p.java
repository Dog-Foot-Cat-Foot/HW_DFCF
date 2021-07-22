package chapter_03;

public class operator_75p {

	public static void main(String[] args) {
		// 증가-감소 연산자를 사용하여 값 연산하기
		
		int gameScore = 150;
		
		int lastScore = ++gameScore; // +1 하고 대입 
		System.out.println(lastScore); // 151
		
		int lastScore2 = --gameScore; // -1 하고 대입 
		System.out.println(lastScore2); // 150 
		
		int lastScore3 = gameScore++; // 대입 후 +1
		System.out.println(lastScore3); // 150
		
		int lastScore4 = gameScore--; // 대입 후 -1
		System.out.println(lastScore4); // 151
	}

}
