package DC20210610;

import java.util.*;

public class EJ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] array = new int[n][n];
		int out = 1;
		
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				array[j][i] = out;
				out++;
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
