package DC20210603;

public class MJ1 {

	public static void main(String[] args) {
		int max = 6;
		int min = 1;
		int random = (int) (Math.random() * (max - min + 1) + min);
		
		System.out.println(random);

	}

}
