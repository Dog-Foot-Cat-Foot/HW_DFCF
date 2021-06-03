package day0528;

import java.util.Scanner;

public class ShQ4 {

	public static void main(String[] args) {
		// 호석이네 학교는 6학년이 네 반이 있는데 
		// 각 반의 대표를 세 명씩 선발하여 제기차기 시합을 하였다.
		// 반별로 세 명이 제기를 찬 개수를 입력받아 
		// 각 반별로 제기를 찬 개수의 합계를 출력하는 프로그램 작성
		// 반드시 배열을 이용하고 입력 후에 출력하는 방식으로 작성
		
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[4][3];
		String[] num;
		int sum;
		
		// 입력
		for(int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "class? ");
			num = sc.nextLine().split(" ");
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = Integer.parseInt(num[j]);
			}
		}
		
		// sum 계산, 출력
		for(int i = 0; i < array.length; i++) {
			sum = 0;
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			System.out.println(i+"class : " + sum);
		}
	}
}
