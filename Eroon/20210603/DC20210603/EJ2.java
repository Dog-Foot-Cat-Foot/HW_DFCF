package DC20210603;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요.");
		int n = scan.nextInt();
		int[][] array= new int[n][n];
		int num = 1;
		
		if(1<=n && n<=100) {	//n의 범위
			
			for(int i = 0; i < n; i++) { // 세로 줄 
				if(i%2==0) {	//홀수 줄 (오름차순)
					for(int j = 0; j < n; j++) { // 가
						array[i][j] = num;
						num++;
					}
				}
				else {	//짝수 줄 (내림차순)
					for(int j = n-1; j >= 0; j--) {
						array[i][j] = num;
						num++;
					}
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
				
		}
		
	}

}

