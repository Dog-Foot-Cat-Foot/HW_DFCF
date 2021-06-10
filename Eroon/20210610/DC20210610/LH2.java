package DC20210610;

import java.util.Scanner;

public class LH2 {
	// 백준 1436
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n >10000) {
			System.out.println("범위를 벗어났습니다. ");
		}else {
			if(n == 1) System.out.println("666");
			else System.out.println(n-1+"666");
		}
	}
}
