package DC20210610;

import java.util.*;

public class LH1 {
// 콜라츠 추측 
	//1-1. 입력된 수가 짝수라면 2로 나눔
	//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더함 
	//2. 결과로 나온 수에 같은 작업을 1이 될때까지 반복 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long result= 0;
		
		if(n < 1|| n>8000000) {
			System.out.println("범위를 벗어났습니다. ");
		} else {
			result = solution(n);
		}
		System.out.println(result);		

	}

	public static int solution(long num) {
		int answer = 0;
	    while(num!=1) { 
	          if(num%2==0) { // 짝수일 때 
	              num = num/2;
	          } else { // 홀수일 때 
	              num = (num*3) + 1; 
	          }
	          answer++;
	          
	          //500번을 반복해도 1이 되지 않으면 -1 반
	          if(answer==500) {
	              answer=-1; 
	              break;
	          }
	      }
		
		return answer;
	}
}
