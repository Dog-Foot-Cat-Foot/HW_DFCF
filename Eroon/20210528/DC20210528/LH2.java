package DC20210528;

import java.util.Scanner;

public class LH2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("10이하의 자연수를 입력하세요.");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for(int i = 1; i<n+1; i++) {
			for(int j = 1; j<m+1; j++) {
				System.out.println(i+" "+j);
			}
		}

	}

}