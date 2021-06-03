package day0528;

import java.util.Scanner;

public class ShQ3 {

	public static void main(String[] args) {
		// 6명의 몸무게를 입력받아 
		// 몸무게의 평균을 춣력하는 프로그램 작성
		// 출력은 반올림하여 소수 첫째자리까지로 한다.
		
		Scanner sc = new Scanner(System.in);
		final int num = 6;
		String[] weightArray = new String[num];
		double sum = 0;
		
		System.out.println("6명의 몸무게를 입력해 주세요.");
		weightArray = sc.nextLine().split(" ");
		
		for(int i = 0; i < num; i++) {
			sum += Double.parseDouble(weightArray[i]);
		}
		
		System.out.printf("%.1f", sum/num);

	}

}
