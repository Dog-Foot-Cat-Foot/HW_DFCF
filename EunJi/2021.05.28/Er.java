## 1
import java.util.Scanner;

public class LotMenuEx {

	public static void main(String[] args) {
		// 조건문 메뉴 입력 : 이현
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("메뉴입력 : ");
		int menu1 = scanner.nextInt();
		int menu2 = scanner.nextInt();
		
		int cal1, cal2;
		
		if(menu1 == 1) {
			cal1 = 400;
		}
		else if(menu1 == 2) {
			cal1 = 340;
		}
		else if(menu1 == 3) {
			cal1 = 170;
		}
		else if(menu1 == 4) {
			cal1 = 100;
		}
		else {
			cal1 = 70;
		}
		
		if(menu2 == 1) {
			cal2 = 400;
		}
		else if(menu2 == 2) {
			cal2 = 340;
		}
		else if(menu2 == 3) {
			cal2 = 170;
		}
		else if(menu2 == 4) {
			cal2 = 100;
		}
		else {
			cal2 = 70;
		}
		
		if(cal1+cal2<500) {
			
			System.out.println("no angry");
		}
		else {
			System.out.println("angry");
		}
		
		

	}

}

## 2
import java.util.Scanner;

public class DiceEx {

	public static void main(String[] args) {
		// 주사위2개의 모든 경우의 수
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주사위 2개를 던졋!(나온 숫자) : ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				
				System.out.println(i +" "+ j);
			}
		}

	}

}

## 3

import java.util.Scanner;

public class Tobot {

	public static void main(String[] args) {
		//주현이가 또봇을 : 이현
		Scanner scanner = new Scanner(System.in);	
		int num[] = new int[10];	
		
		System.out.print("10개 숫자 입력 : ");
		
		for(int i = 0; i < num.length; i++ ) {	
			
			num[i] = scanner.nextInt();	
		}
		
		System.out.print("k번째 숫자는 뭘까요?? ");
		int k = scanner.nextInt();	
		
		System.out.println(num[k-1]);	
	}
}

## 4
import java.util.Scanner;

public class BadukEx {

	public static void main(String[] args) {
		// 바둑 : 이현
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("흰돌의 갯수를 입력하세요 : ");
		int n = scanner.nextInt();				

		int arr[][] = new int[19][19];
		
		for(int i = 1; i<=n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			arr[x-1][y-1]=1;
			
		}
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr.length; j++)
				System.out.print(arr[i][j]);
				System.out.println();
		}
		
	}

}


## 5


