//나이순 정렬
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 회원수 입력
		String arr[][] = new String[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		//회원 나이에따른 정렬
		Arrays.sort(arr, Comparator.comparingInt(num1 ->Integer.parseInt(num1[0])));
		//회원 정렬한거 출력
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}

//카드 정리
import java.util.*;

public class ProblemSloving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();

		int n = sc.nextInt(); // 카드 장수 입력
		int a = 1;//연속되는 숫자 변수
		for(int i = 0; i < n; i++) {
			queue.add(a);
			a++;
		}
		for(int i = 0; i<n-1; i++) {
			queue.remove();//인덱스 앞 수 삭제
			queue.offer(queue.poll());// 인덱스 앞수 삭제 및 뒤로 옮김
		}
		System.out.println(queue.poll());

	}
}
