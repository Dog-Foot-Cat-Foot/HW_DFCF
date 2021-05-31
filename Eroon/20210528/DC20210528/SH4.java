package DC20210528;

import java.util.Scanner;

public class SH4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[4][3];
		
		System.out.println("세명의 제기 찬 횟수를 입력하세요.");
		for(int i =0; i<4; i++) {
			System.out.println((i+1)+"Class?");
			for(int j =0; j<3; j++) {
				array[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			int sum =0;
			for(int j=0; j<3; j++) {
				sum += array[i][j];
			}
			System.out.println("Class"+(i+1)+" : "+ sum);
		}
		

	}

}
