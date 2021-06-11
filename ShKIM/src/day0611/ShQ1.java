package day0611;

public class ShQ1 {

	public static void main(String[] args) {
		
		System.out.println(solution(987));

	}
	
	// 각 자릿수 합을 구하여 리턴
	
	public static int solution(int n) {
		int answer = 0;
		int temp = n;
		
		while(temp != 0) {
			answer += temp%10;
			temp = temp/10;
		}
		
		return answer;
	}

}
