package DC20210528;

import java.util.Scanner;

public class MJ1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("100보다 작은 정수를 입력하세요. ");
		int n = scan.nextInt();
		int a = 1;
		int b = 1;
		
		for(int i=1; i<=n; i++) {
			if(i>10) {
				a = i/10;
				b = i%10;
			}else {
				b=i;
			}
			
			if((a==3||a==6||a==9) && (b==3||b==6||b==9)){
				System.out.print("XX ");
			}else if(a==3||a==6||a==9||b==3||b==6||b==9) {
				System.out.print("X ");
			}else {
				System.out.print(i+" ");
			}
		}
		
	


	}

}
