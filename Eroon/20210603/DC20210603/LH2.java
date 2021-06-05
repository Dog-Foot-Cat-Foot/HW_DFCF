package DC20210603;

import java.util.Scanner;

public class LH2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자의 갯수를 입력하세요.(1 이상 100 이하)");
		int N = scan.nextInt();
		int[] array = new int[N];
		int sum = 0;
		
		if (N <1|| N >100) {
			System.out.println("범위를 벗어났습니다.");
		}else {
			for(int i = 0; i<N; i++) {
				array[i] = scan.nextInt();
			}
		}
		
		for(int i = 0; i<array.length; i++) {
			sum+= array[i];
		}
		System.out.println(sum);

	}

}
