package chapter_04;

public class practice_Q3_123p {

	public static void main(String[] args) {
		// 연습문제
		
		//Q3
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
		
		int dan = 2;
		int i = 1;
		
		for(dan=2;dan<=9;dan++) { // 구구단 밖 2,3...9 까지의 반복문 
			for(i=1;i<=9;i++) { //구구단 안쪽 반복문 
				if(i > dan)     //조건 설정 i가 dan보다 크다면 
					break;      //break로 안쪽 반복문을 빠져 나온다.
					System.out.println(dan + "X" + i + "=" + dan * i);
			}
	
		}

	}

}
