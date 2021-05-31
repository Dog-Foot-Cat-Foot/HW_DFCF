package DC20210528;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		//while
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0보다 크거나 같고 9보다 작거나 같은 수를 입력하세요.");
		String n = scan.next();
		
		if(Integer.parseInt(n)<10) {
			n = "0"+n;
		}

	}

}
