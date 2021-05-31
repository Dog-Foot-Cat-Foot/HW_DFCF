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


## 3

## 4
