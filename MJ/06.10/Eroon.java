//문제 1
class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;
        if(num2>=1 && num2<8000000) {
			while(true) {
                if(num2 == 1) {
					break;
				}
				else if (answer == 500) {
					return -1;
				}
				if(num2%2 == 0) {
					num2 = num2/2;
					answer++;
				}
				else if(num2%2 == 1) {
					num2 = num2*3+1;
					answer++;
				}
			}

		}
        return answer;
    }
}
//문제 2
import java.util.*;


public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 666;
		int cnt = 1;

		while(cnt != n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
	}
}
