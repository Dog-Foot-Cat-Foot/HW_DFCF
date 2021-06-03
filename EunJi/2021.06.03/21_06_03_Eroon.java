//Q1.


//Q2.
import java.util.*;

public class EroonTest2 {

	public static void main(String[] args) {
		// 숫자 더하기(공백없이 입력) : 이현
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int n = scanner.nextInt();
		
		String num = scanner.next();
		int sum = 0;
		
		if(1<=n&&n<=100) {
			for(int i = 0; i < num.length(); i++) {
				sum += (num.charAt(i)-'0');
			}
			System.out.println(sum);
			
		}
		
	}

}
