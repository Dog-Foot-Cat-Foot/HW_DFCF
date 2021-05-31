package DC20210528;

import java.util.Scanner;

public class SH1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Number? ");
		int n = scan.nextInt();
		
		if(n == 1) {
			System.out.println("dog");
		}
		else if(n == 2) {
			System.out.println("cat");
		}
		else if(n==3) {
			System.out.println("chick");
		}
		else System.out.println("해당되는 동물이 없습니다.");

	}

}
