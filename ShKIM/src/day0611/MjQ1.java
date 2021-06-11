package day0611;

public class MjQ1 {

	public static void main(String[] args) {
		solution(12, 53, 99, 45);
		solution(2, 75, 25, 50);
	}

	// 1 <= a,b / c,d <= 100
	// 교차하면 "cross", 아니면 "not cross"

	public static void solution(int a, int b, int c, int d) {
		if (a <= c && c <= b && a >= d && b <= d) {
			System.out.println("cross");
		} else if (a <= d && d <= b && a <= c && b >= c) {
			System.out.println("cross");
		} else {
			System.out.println("not cross");
		}
	}

}
