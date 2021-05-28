//Eroon 1차원
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		System.out.println("숫자 10개를 입력해주세요.");
		for(int i = 0; i < num.length; i++)
			num[i] = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(k+"번 숫자는 뭘까요?");
		int a = sc.nextInt();
		if(num[k-1] == a)
			System.out.println("정답입니다!");
		else
			System.out.println("정답은 "+num[k-1]);
	}
}

//Eroon 다차원
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] bd = new int[19][19];

		int n = sc.nextInt();

		for(int i = 0; i< bd.length; i++) {
			for(int j = 0; j< bd.length; j++) {
				bd[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();

			bd[x-1][y-1] = 1;
		}
		for(int i = 0; i< bd.length; i++) {
			for(int j = 0; j< bd.length; j++) {
				System.out.print(bd[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//Eroon 반복문
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i = 1; i<=x; i++) {
			for(int j = 1; j<=y; j++) {
				System.out.println(i+" "+j);
			}
		}
	}
}

//Eroon 조건문
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		int menu1 = sc.nextInt();

		int kal = 0;
		switch(menu) {
			case 1 :
				kal += 400;
				break;
			case 2 :
				kal += 340;
				break;
			case 3 :
				kal += 170;
				break;
			case 4 :
				kal += 100;
				break;
			case 5 :
				kal += 70;
				break;
		}
		switch(menu1) {
			case 1 :
				kal += 400;
				break;
			case 2 :
				kal += 340;
				break;
			case 3 :
				kal += 170;
				break;
			case 4 :
				kal += 100;
				break;
			case 5 :
				kal += 70;
				break;
		}
		if(kal <= 500) {
			System.out.println("no angry");
		}
		else
			System.out.println("angry");
	}
}

//Eroon 함수
import java.util.*;

class Sum{

	public void Sum() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;

		for(int i = 0; i< a.length; i++) {
			double ran = Math.random();
			a[i] = (int) (ran*100);
			sum += a[i];
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println(sum);

	}
}

public class ProblemSloving {

	public static void main(String[] args) {
		Sum s1 = new Sum();
		s1.Sum();

	}
}
