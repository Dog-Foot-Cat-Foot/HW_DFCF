//게시판 문제
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 건수를 입력하시오. ");
		int m = sc.nextInt(); // 총 건수
		System.out.print("한 페이지에 보여줄 게시물수를 입력하시오. ");
		int n = sc.nextInt(); // 한 페이지에 보여줄 게시물수
		int p = 0; //총 페이지수
		if(n>=1) {
			p = m/n; // 페이지 수는 총건수 / 게시물 수
			if(m == 0) // 건수가 없을때 페이지는 없음.
				p = 0;
			else if(p == 0)  // 총건수보다 페이지 수가 많을때 p=0이되므로 1증가
				++p;
			else if(m%n != 0) //페이지 수가 총건수 / 게시물수 몫값을 넘어가면 페이지수 1증가
				++p;
		}
		System.out.println("총 페이지수 : "+p+"p");
	}
}
