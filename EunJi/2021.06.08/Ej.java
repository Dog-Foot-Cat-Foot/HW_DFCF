//Q1.
import java.util.*;

public class EjTest1 {

	public static void main(String[] args) {
		// 철수의 종이 자르기 : 은지
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("종이의 가로, 세로 입력 : ");
		int n = scanner.nextInt();	//종이의 가로 값 입력
		int m = scanner.nextInt();	//종이의 세로 값 입력
		
		if(2<=n&&m<=50) {	//n,m의 범위
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(i==0 || i==m-1) {
						if(j==0 || j==n-1) {
							System.out.print("+");
						}
						else {
							System.out.print("-");
						}
					}
					else if(j==0 || j==n-1) {
						System.out.print("|");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}

//Q2.
public class EjTest2 {

	public static void main(String[] args) {
		// 구구단 예쁘게 출력하기 : 은지
		
		for(int i = 1; i <= 9; i++) {	
			for(int j = 2; j<= 5; j++) {
				System.out.printf(j+"x"+i+"="+"%2d\t",i*j);
			}
			System.out.println();
		}
	}
}
