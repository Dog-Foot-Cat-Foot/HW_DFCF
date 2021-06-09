package DC20210608;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MJ2 {
	// 피보나치 수열 구하기 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] fibo = new int[100];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2; i<100; i++) { // 피보나치 배열에 피보나치 수열 넣기 
			fibo[i] = fibo[i-2]+fibo[i-1];
		}
		
		for(int i = 0; fibo[i]<n;i++) { //n보다 적은 수까지 출력 
			System.out.print(fibo[i]+" ");

		}
	}
}

