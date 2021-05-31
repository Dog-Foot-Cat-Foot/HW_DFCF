package DC20210528;

import java.util.Scanner;

public class SH2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("100이하 정수 두개를 입력하세요.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(n1<n2) {
			for(int i =n1; i<n2+1; i++) {
				System.out.print(i+" ");
			}
		}
		else {
			for(int i=n2; i<n1+1 ;i++) {
				System.out.print(i+" ");
			}
		}
	}

}
