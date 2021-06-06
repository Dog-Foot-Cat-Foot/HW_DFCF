package day0603;

public class MjQ1 {

	public static void main(String[] args) {
		function();
	}

	// 1 ~ 6까지 나오는 주사위
	public static void function() {
		int num = (int) (Math.random() * 6) + 1;

		System.out.println(num);
	}

}
