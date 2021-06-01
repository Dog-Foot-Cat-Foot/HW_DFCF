## 1

import java.util.Scanner;

public class IFEx1 {

	public static void main(String[] args) {
		//if문 예제
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		
		 if((year%4==0)&&(year%100 != 0|| year%400==0)){
			System.out.println("1");
		}
	
		else {
			System.out.println("0");
		}
		

	}

}


## 2 
import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		//A+B
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = scanner.nextInt();
		
		int a,b;
		int arr[] = new int[n];

		
		while(0<=n&&n<=99) {
			for (int i =  0; i < n; i++) {
				
				a = scanner.nextInt();
				b = scanner.nextInt();
				
				arr[i] = a + b;	
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println("Case #"+(i+1)+": "+arr[i]);
			}
			
		}

	}

}

## 3

## 4
