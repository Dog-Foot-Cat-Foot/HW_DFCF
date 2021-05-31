package DC20210528;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시스템 케이스 수를 입력하세요. ");
		int t = scan.nextInt();
		
		for(int i =0; i< t; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();	
			System.out.println("Case #"+i+":"+(A+B));
		}
	}	
}

