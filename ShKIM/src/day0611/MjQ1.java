package day0611;

public class MjQ1 {

	public static void main(String[] args) {
		solution(12, 53, 99, 45);
		solution(2, 75, 25, 50);
		solution(25, 100, 2, 50);
		solution(25, 100, 75, 50);
		solution(25, 100, 75, 98);
	}

	// 1 <= a,b / c,d <= 100
	// 교차하면 "cross", 아니면 "not cross"

	public static void solution(int a, int b, int c, int d) {
		if (a < c && c < b && (b < d || d < a)) {
			System.out.println("cross");
		} else if (a < d && d < b && (b < c || c < a)) {
			System.out.println("cross");
		} else {
			System.out.println("not cross");
		}
	}

}
