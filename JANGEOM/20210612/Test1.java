package Array;

public class Test1 {

	public int[] arr() {
		int[] array = new int[100];
		return array;
	}

	public static void main(String[] args) {
		Test1 exam = new Test1();
		int[] arr2 = exam.arr(); // arr 메소드 호출

		for (int i = 0; i < 100; i++) {
			arr2[i] = i + 1;
			System.out.println(arr2[i]);
		}

	}
}
