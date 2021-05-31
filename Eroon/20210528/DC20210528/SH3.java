package DC20210528;

import java.util.Scanner;

public class SH3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] array = new double[6];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		
		double avg = sum/array.length;
		
		System.out.printf("%.1f", avg);
		
	}
}
//23.2 39.6 66.4 50.0 45.6 48.0