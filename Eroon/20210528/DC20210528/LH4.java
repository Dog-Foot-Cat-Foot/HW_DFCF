package DC20210528;

import java.util.Scanner;

public class LH4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[][] baduk = new int[19][19];
		for(int i =0; i<baduk.length; i++) {
			for(int j =0; j<baduk.length; j++) {
				baduk[i][j]=0;
			}	
		}
		
		for(int i =0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			baduk[x-1][y-1]=1;
		}
		
		for(int i=0; i<baduk.length; i++) {
			for(int j =0; j<baduk.length;j++) {
				System.out.print(baduk[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
