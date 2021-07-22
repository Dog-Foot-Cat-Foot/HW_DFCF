package chapter_04;

public class for_114p {

	public static void main(String[] args) {
		// for문
		
		int i;
		int sum;
		
		for(i = 1, sum = 0; i <= 10 ; i++ ) {
			sum = sum + i ; // sum += i 같은 식 
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
