package DC20210528;

import java.util.Scanner;

public class LH3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for(int i =0; i< array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		int k = scan.nextInt();
		
		System.out.println(array[k-1]);
	}

}
