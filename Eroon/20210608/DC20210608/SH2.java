package DC20210608;

import java.util.Scanner;

public class SH2 {
//가운데 글자 가져오기 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); // 입력받는 String
		String r = solution(s); // 출력할 결과 값
		System.out.println(r);
		
	}
	public static String solution(String s) {
		String[] toArray = s.split(""); //String을 배열로 변환
		String result = "";
		
		if(s.length()%2 ==1) { //홀수일 때 
			result = toArray[s.length()/2];
		}else { //짝수일 때
			result = toArray[(s.length()/2)-1]+toArray[s.length()/2];
		}
		return result;
	}
}
