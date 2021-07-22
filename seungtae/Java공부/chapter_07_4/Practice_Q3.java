package chapter_07_4;

public class Practice_Q3 {

	public static void main(String[] args) {
		// 연습문제 3번 
		// 배열길이가 5인 정수형 배열을 선언하고 , 1~10중 짝수만을 배열에 저장한 후 그 합을 출력하시오. 
		
		// 배열길이가 5인 배열변수 선언 
		int[] num = new int[] {2,4,6,8,10};
		int total = 0; 
		
		for(int i=0; i<num.length; i++) {
			total += num[i];
		}
		System.out.println("1~10까지 짝수의 합은 :" + total);
	}

}
