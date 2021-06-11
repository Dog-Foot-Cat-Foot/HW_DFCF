import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a==b||c==d||b==c||a==d)
			System.out.println("같은숫자가 입력되었습니다. 종료합니다.");
		if((a+b)-(c+d) > 50)// 크로스 되는 규칙
			System.out.println("cross");
		else
			System.out.println("not cross");
	}
}
