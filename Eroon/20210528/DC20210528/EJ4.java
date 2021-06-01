package DC20210528;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("테스트 케이스 수를 입력하세요.");
		int c = scan.nextInt(); //테스트 케이스의 
		
		int temp = 0;
		double count = 0;
		int sum = 0;
		double avg = 0;
		double[] students = new double[c]; //각 케이스마 평균 점수가 넘는 학생들의 비
		
		
		for(int i = 0; i<c; i++) {
			int n = scan.nextInt();
			if(1 <= n && n <= 1000) {
				int[] score = new int[n];
				for(int j = 0; j<n; j++) {
					temp = scan.nextInt();
					if(0 <= temp && temp <= 100) {
						score[j] = temp;
						sum += score[j];
					}
				}
				avg = sum/n;
				for(int j =0; j<n; j++) {
					if(score[j]>avg) {
						count++;
					}
				}
				students[i] = (count/n)*100;
			}else {
				System.out.println("1이상, 1000이하의 숫자를 입력해 주세요.");
				i--;
				continue;
			}
			temp = 0;
			sum = 0;
			count = 0;
		}
		for(int i=0; i< students.length;i++) {
			System.out.printf("%.3f%%\n", students[i]);
		}
	}
}
