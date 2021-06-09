package day0609;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ErQ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] array = new String[n][3];
		int[][] ageArray = new int[n][2];
		String temp = "";

		for (int i = 0; i < n; i++) {
			array[i][0] = Integer.toString(i);
		//	ageArray[i][0] = i;
			temp = sc.next();
			array[i][1] = temp;
		//	ageArray[i][1] = Integer.parseInt(temp);
			temp = sc.next();
			array[i][2] = temp;
		}

		soulation(n, array);
		// soulation1(n, array, ageArray);

	}

	// n명의 회원수
	// 나이, 이름 순 (가입 순으로 찍힘)
	// 나이 오름차순, 나이 같을 경우 가입순 오름차순
	public static void soulation(int n, String[][] array) {

		// 나이 정렬
		Arrays.sort(array, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[1].equals(o2[1])) {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				} else {
					return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
				}
			}
		});
		
		
		// 출력
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i][1] + " " + array[i][2]);
		}

	}
	
	// 이전에 푼거
	public static void soulation1(int n, String[][] array, int[][] ageArray) {
		String[][] answer = new String[n][2];

		// 나이 정렬
		Arrays.sort(ageArray, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) { // 나이가 같은 경우
					return o1[0] - o2[0]; // 가입일 기준 정렬
				} else {
					return o1[1] - o2[1]; // 나이 정렬
				}
			}
		});
		
		
		// 나이 입력
		for (int i = 0; i < answer.length; i++) {
			answer[i][0] = Integer.toString(ageArray[i][1]); // 나이 입력
			
			for(int j = 0; j < array[i].length;j++) {
				if(Integer.parseInt(array[i][0]) == ageArray[i][0]) {
					
				}
			}
		}
		
		// 가입순 매칭해서 이름 입력
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if(Integer.parseInt(array[j][0]) == i) {
					answer[i][1] = array[j][2];
				}
			}
		}
		
		// 출력
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i][0] + " " + answer[i][1]);
		}
		
	}

}
