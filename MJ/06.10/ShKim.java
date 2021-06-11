import java.util.*;


public class ProblemSloving {

	public static int solution(String n) {
		int sum=0;
		 String[] arr = n.split("");
		 for(int i = 0; i<arr.length; i++){
			 sum += Integer.parseInt(arr[i]);
		 }
		 return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		System.out.println(solution(n));

	}
}
