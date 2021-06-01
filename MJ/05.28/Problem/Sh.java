//shKim 조건문

import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int n = sc.nextInt();
		if(n == 1)
			System.out.println("dog");
		else if(n == 2)
			System.out.println("cat");
		else if(n == 3)
			System.out.println("chick");
		else
			System.out.println("I don't know.");
	}
}

//shKim 반복문

import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1<=100 && n2 <=100) {
			if(n1<n2) {
				for(int i = n1; i <= n2; i++) {
					System.out.print(i + " ");
				}
			}
			if(n1>n2) {
				for(int i = n2; i <= n1; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
}

//shKim 1차원 배열

import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] weight = new double[6];
		double sum = 0;

		for(int i = 0; i < weight.length; i++) {
			weight[i] = sc.nextDouble();
			sum+= weight[i];
		}
		System.out.printf("%.1f",sum/weight.length);
	}
}

//shKim 다차원 배열

import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jegi[][] = new int[4][3];
		for(int i = 0; i < 4; i++) {
			System.out.print(i+1 + "class? ");
			for(int j = 0; j < 3; j++) {
				int n = sc.nextInt();
				jegi[i][j] = n;
			}
		}
		for(int i = 0; i < 4; i++) {
			int sum = 0;
			for(int j = 0; j < 3; j++)
				sum +=jegi[i][j];
			System.out.println(i+1 + "class : " + sum);
		}
	}
}

//shKim 함수

import java.util.*;

class Hamsu {
	String m;

	public Hamsu(String m) {
		this.m = m;
		System.out.println(m);
	}

	public String toString() {
		return "@@@@@@@@@@";
	}
}

public class ProblemSloving {

	public static void main(String[] args) {
		Hamsu hamsu1 = new Hamsu("first");
		System.out.println(hamsu1.toString());

		Hamsu hamsu2= new Hamsu("second");
		System.out.println(hamsu2.toString());

		Hamsu hamsu3 = new Hamsu("third");
		System.out.println(hamsu3.toString());
	}
}
