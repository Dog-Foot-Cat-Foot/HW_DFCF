package chapter_04;

public class practice_Q2_123p {

	public static void main(String[] args) {
		// 연습문제
		
		//Q2 
		//구구단을 짝수 단만 출력하도록 프로그램을 만들어주세요. 
		
		int dan = 2;
		int i = 1;
		
		for(dan=2;dan<=9;dan++) {
			if(dan%2!=0) {
				continue;
			}
			for(i=1;i<=9;i++) {
				System.out.println(dan + "X" + i + "=" + dan * i);
			}
			System.out.println();
		}

	}

}
