package day0603;

import java.util.Scanner;

public class MjQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 가위 2: 바위 3: 보");
		int num = sc.nextInt();
		function(num);

	}

	// 가위바위보
	public static void function(int num) {
		int com = (int) (Math.random() * 3) + 1;
		String[] array = { "가위", "바위", "보" };
		String result = "";

		switch (num - com) {
		case 0:
			result = "비겼습니다.";
			break;
		case -1:
		case 2:
			result = "졌습니다.";
			break;
		case -2:
		case 1:
			result = "이겼습니다.";
		}

		System.out.println("[나 : " + array[num - 1] + "] [컴퓨터 : " + array[com - 1] + "] " + result);

	}
}
