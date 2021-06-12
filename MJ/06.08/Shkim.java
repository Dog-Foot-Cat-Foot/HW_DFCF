//SHKIM Q1
import java.util.*;

public class Main {

	public static ArrayList<Integer> solution(int[] numbers) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		
		for(int i = 0; i< numbers.length; i++) {
			for(int j = 1+i; j< numbers.length;j++)
				num.add(numbers[i]+numbers[j]);
		}
		
		Collections.sort(num);
		for(int i : num) {
			if(!result.contains(i))
				result.add(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {2,1,3,4,1};
		System.out.println(solution(arr));
	}
}

//SHKIM Q2
import java.util.*;

public class Main {

	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		if(arr.length%2 ==0) {
			answer = arr[arr.length/2-1]+arr[arr.length/2];
		}
		else if(arr.length%2 ==1) {
			answer = arr[arr.length/2];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "abcde";
		String a = "qwer";
		System.out.println(solution(a));
	}
}

