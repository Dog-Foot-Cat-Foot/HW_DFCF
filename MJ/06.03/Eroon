//Eroon 문제 1번
package Practical;

import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int x = 0;
		int y = 1;
		int cnt = 3;

		for(int i = 1; i < 100; i++) {
			int j=0;
			if(X == 1) {
				System.out.println(1+"/"+1);
				break;
			}
			if(X == 2) {
				System.out.println(1+"/"+2);
				break;
			}
			if(y == 0) {
				while(j == 0) {//y가 0일때 y증가 x감소
					x--;
					y++;
					if(X == cnt) {
						System.out.println((x+1) + "/" + (y+1));
						j=1;
					}
					cnt++;
					if(x==0) {// x가 0일때 다시 y증가
						y++;
						j=1;
						if(X == cnt) {
							System.out.println((x+1) + "/" + (y+1));
							j=1;
						}
						cnt++;
					}
				}
			}
			if(x == 0) { // x가 0일때 x증가 y감소
				while(j == 0) {
					x++;
					y--;
					if(X == cnt) {
						System.out.println((x+1) + "/" + (y+1));
						j=1;
					}
					cnt++;
					if(y==0) { // y가 0일때 다시 x증가
						x++;
						j=1;
						if(X == cnt) {
							System.out.println((x+1) + "/" + (y+1));
							j=1;
						}
						cnt++;
					}
				}
			}
		}
	}
}


//Eroon 문제 2번
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하시오.");
		while(true) {
			int	N = sc.nextInt(); //숫자의 개수
			if(1<N && 100>=N) {

				String[] num = new String[N];
				num = sc.next().split(""); //String으로 된 연속된숫자를 각 배열에 하나씩 저장
				int sum = 0;
				for(int i = 0; i<num.length; i++) {// 저장된 배열 합
					sum += Integer.parseInt(num[i]);
				}
				System.out.println(sum);
				break;
				}
			else
				System.out.println("숫자를 다시 입력하시오.");
		}
	}
}
