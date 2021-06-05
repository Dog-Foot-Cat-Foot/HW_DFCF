package DC20210603;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계단의 높이를 입력하세요. ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j =0; j <i; j++) {
				System.out.print(" ");
			}
			System.out.print("**\n");
		}
		

	}

}
