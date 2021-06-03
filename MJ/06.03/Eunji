//Eunji 1번 문제
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) { // *표 반복문
			for(int j = 0; j < i; j++) //공백 반복문
				System.out.print(" ");
			System.out.println("**");
		}
	}
}

//Eunji 2번 문제
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int cnt = 1; // 배열안에 연속되는 수
		int[][] arr = new int[n][n];

		for(int i=0;i<n;i++) {
			if(i%2 == 0) { //i가 짝수일때 정방향
				for(int j = 0; j<n; j++) {
					arr[i][j] = cnt;
					cnt++;
				}
			}
			else { // i가 홀수일때 역방향
				for(int j = n-1; j>=0; j--) {
					arr[i][j] = cnt;
					cnt++;
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
}
