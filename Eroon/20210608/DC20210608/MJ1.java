package DC20210608;

import java.util.Scanner;

public class MJ1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt(); // 총 건수
		int n = scan.nextInt(); // 한 페이지에 보여줄 게시글 
		
		int result = -1; // 결과 초기 
		if(n<1) {
			System.out.println("1보다 크거나 같은 수를 입력하세요.");
		}else {
			if(m == 0) result = 0;
			else if(m<n || m==n) result = 1;
			else {
				if(n==1) result = m;
				else result = (m/n)+1;
			}
		}
		System.out.println(result);
	}
}
