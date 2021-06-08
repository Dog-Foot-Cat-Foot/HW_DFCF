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


//피보나치수열 문제
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		//정수 활용
		int a = 0;
		int b = 1; // 1 1
		int temp = 0;
		System.out.print(a+ " " + b + " "); //0과 1출력
		for(int i = 0; i < n; i++) {
			temp = a + b; //빈 메모리에 a+b입력
			a = b; // 1항에 2항 입력
			b = temp; // 2항에 이전 두항 더한값 입력
			System.out.print(temp+" ");
			if(a+b>n) //마지막 수열이 n보다 크면 종료
				break;
		}
		System.out.println();
		// 배열 활용
		int[] nums = new int[n];
        nums[0] = 0;
        nums[1] = 1;

        for(int i = 0; i < n; i++) {
            nums[i+2] = nums[i+1] + nums[i];// 배열 num[0+2] = nums[0+1] + nums[0]
            if(nums[i] > n) // 배열이 n보다 크면 종료
            	break;
            System.out.print(nums[i] + " ");
        }
	}
}
