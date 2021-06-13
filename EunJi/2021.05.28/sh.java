## 1

import java.util.Scanner;

public class AnimalEx {

	public static void main(String[] args) {
		//동물 숫자 : 소희
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int animal = scanner.nextInt();

		
		switch(animal){
			case 1 : 
				System.out.println("dog");
				break;
			case 2 :
				System.out.println("cat");
				break;
			case 3 :
				System.out.println("chick");
				break;
			default :
				System.out.println("I don't know");
		}

	}

}

## 2

import java.util.Scanner;

public class NumEx {

	public static void main(String[] args) {
		// 100이하의 자연수 입력 : 소희
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 2개 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1>num2) {
			for(;num1>=num2;num2++) {
				System.out.print(" "+num2);
			}
		}
		else if(num2>num1) {
			for(;num2>=num1;num1++) {
				System.out.println(" "+num1);
			}
		}

	}

}

## 3

import java.util.Scanner;

public class WeightEx {

	public static void main(String[] args) {
		// 6명의 몸무게 입력 후 평균 : 소희
		Scanner scanner = new Scanner(System.in);
		
		double[] person = new double[6];
		
		double sum = 0;
		double avg = 0;
		
		System.out.print("6명의 몸무게 입력 : ");
		
		for(int i = 0; i < person.length; i++ ) {	//0~9 반복
			
			person[i] = scanner.nextDouble();	//배열에 입력한 값 저장
			sum += person[i];
		}
		avg = sum/6;
		
		System.out.printf("%.1f",avg);
		
		//23.2 39.6 66.4 50.0 45.6 48.0

	}

}

## 4
package kr.java.study210528;

import java.util.Scanner;

public class ClassEx {

	public static void main(String[] args) {
		// 호식이네 제기차기 : 소희
		Scanner scanner = new Scanner(System.in);
		
		int[][] clas = new int[4][3];	//배열 선언
		int sum[] = new int[4];
		
		for(int i = 0; i < 4; i++ ) {		//1~4반 반복
			System.out.print((i+1)+"class?");
			for(int j = 0; j < 3; j++) {
				int num = scanner.nextInt();
				clas[i][j] = num;
				sum[i] += clas[i][j];	
			}
		}
		for(int i = 0; i < 4; i++)
			System.out.println((i+1)+"class : "+sum[i]);
	}
}


## 5


