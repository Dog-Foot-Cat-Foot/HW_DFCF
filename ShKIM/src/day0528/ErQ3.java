package day0528;

import java.util.ArrayList;
import java.util.Scanner;

public class ErQ3 {

	public static void main(String[] args) {
		// 10개의 숫자를 차례대로 입력
		// k번째 숫자는 무엇인지 입력
		// k번째 숫자가 무엇인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 10개를 입력해 주세요.");
		String[] numS = sc.nextLine().split(" ");
		
		System.out.println("위치를 입력해 주세요.");
		int index = 0, result = 0;
		
		while(true) {
			index = sc.nextInt();
			if(index - 1 < numS.length && index > 0) {
				result = Integer.parseInt(numS[index-1]);
				System.out.println(result);
				break;
			} else { 
				System.out.println("위치를 다시 입력해 주세요.");
			}
		}
		
	}

}
