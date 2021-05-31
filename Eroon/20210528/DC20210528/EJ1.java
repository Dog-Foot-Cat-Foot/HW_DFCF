package DC20210528;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1보다 크거나 같고 4000보다 작거나 같은 년도를 입력하세요.");
		
		int year = scan.nextInt();
		if(year%4==0 && year%100 !=0) {
			System.out.println("1");
		}
		else if(year%4==0 && year%400 ==0) {
			System.out.println("1");
		}
		else System.out.println("0");
	}

}
