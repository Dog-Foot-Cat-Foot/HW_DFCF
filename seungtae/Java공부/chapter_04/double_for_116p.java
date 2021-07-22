package chapter_04;

public class double_for_116p {

	public static void main(String[] args) {
		// 중첩된 반복문
		
		int dan;
		int a; 
		
		for(dan = 2; dan <= 9; dan++) {  // 2단부터 9단까지 반복하는 외부 반복문 
			for(a = 1; a <= 9; a++) { 	 // 각 단에서 1~9까지 곱해주는 내부 반복문 
				System.out.println(dan + "X" + a + "=" + dan * a); 
			}
			System.out.println(); // 한 줄 띄어서 출력해주기위해 공백을 넣어서 내부반복문 밖에 써준다 
		}

	}
}
	