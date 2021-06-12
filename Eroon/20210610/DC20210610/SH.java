package DC20210610;

import java.util.Scanner;

public class SH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		if(N>100000000|| N<0) {
			System.out.println("입력된 수가 범위를 벗어났습니다.");
			System.exit(0);
		}
		int result = solution(N);
		System.out.println(result);
	}
	
	public static int solution(long n) {
		int answer = 0;
		while(n != 0) {
			answer += n%10; // 정답에 나머지를 더해줌 
			n/= 10; //n을 10으로 나누고 몫을 다시 n에 저
		}
		return answer;
	}

}
