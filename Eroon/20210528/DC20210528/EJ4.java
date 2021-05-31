package DC20210528;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		int N =0;
		int[] score=new int[N];
		
		for(int i = 0; i<C; i++) {
			N = scan.nextInt();
			for(int j = 0; j<N; j++) {
				 score[j] = scan.nextInt();
			}
		}
		int sum = 0;
		int avg = 0;
		int num = 0;
		
		for(int i = 0; i<C; i++) {
			for(int j=0; j< N; j++) {
				sum += score[j];
			}
			avg = sum/N;
			if(avg<score[i]) {
				num +=1;
			}
			System.out.println(num/N*100);
		}
	}
}
