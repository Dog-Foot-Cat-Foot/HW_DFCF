package DC20210528;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		//while
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0보다 크거나 같고 99보다 작거나 같은 수를 입력하세요.");
		int n = scan.nextInt();
		
		int first = 0;
		int second = 0;
		int sum = 0;
		int count = 0;
		int temp = n;
		while(true) {
			first = temp/10;
			second = temp%10;
			sum = first+second;
			
			temp = second*10+sum%10;
			count++;
			
			if(temp == n) break;
		}
		System.out.println(count);
		
	}

}
