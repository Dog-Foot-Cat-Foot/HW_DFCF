package day0528;

import java.util.Scanner;

public class ShQ2 {

	public static void main(String[] args) {
		// 100이하의 두 개의 정수를 입력받아 
		// 작은 수부터 큰 수까지 차례대로 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("100 이하의 두 개의 정수를 입력해 주세요.");
		
		String[] num = sc.nextLine().split(" ");
		
		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[1]);
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			for(int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}

	}

}
