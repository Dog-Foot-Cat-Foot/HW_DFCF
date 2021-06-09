package DC20210608;

import java.util.Scanner;

public class EJ1 {
//고객이 요구하는 가로, 세로 길이가 주어지면 절취선을 그리는 프로그램 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 가로 길이 
		int m = scan.nextInt(); // 세로 길이 
		
		for(int i = 0; i<m; i++) { // 세로 길이만큼 반복 
			if(i == 0||i == m-1) { // 첫번째 줄과 마지막 줄 출
				for(int j = 0; j<n; j++) { // 가로 길이만큼 반복 
					if(j == 0|| j==n-1) { //겹치는 부분 +로 출력 
						System.out.print("+");
					}else {
						System.out.print("-");
					}
				}
			}else { // 나머지 줄 출력 
				for(int j = 0; j<n; j++) { // 가로 길이만큼 반복 
					if(j == 0|| j==n-1) { // 첫번째 |출
						System.out.print("|");
					}else { // 나머지 공백 출
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
