import java.util.*;

public class Game369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오.");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			if((i%10 == 3 || i%10 == 6 || i%10 == 9) &&
					(i/10 == 3 || i/10 == 6 || i/10 == 9)) {
				System.out.print("짝짝 ");
				continue;
			}
			if(i%10 == 3 || i%10 == 6 || i%10 == 9 || i/10 == 3)	{

				System.out.print("짝 ");
				continue;
			}
			else
				System.out.print(i+" ");
		}
	}
}
