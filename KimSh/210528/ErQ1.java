import java.util.Scanner;

public class ErQ1 {

	public static void main(String[] args) {
		// 2메뉴의 칼로리 합이 500보다 크면 엄마 화냄, 500이하면 안화냄
		// 메뉴 치즈버거(400), 야채버거(340), 우유(170), 계란말이(100), 샐러드(70)
		// 2가지 메뉴를 선택했을 때 칼로리 합 계산
		// 그 칼로리 합이 500보다 크면 "angry", 500이하면 "no angry" 출력
		
		
		System.out.println("메뉴를 2가지 고르세요.");
		System.out.println("1: 치즈버거, 2: 야채버거, 3: 우유, 4: 계란말이, 5: 샐러드");
		
		Scanner sc = new Scanner(System.in);
		String[] choice = sc.nextLine().split(" ");
		int[] cal = {400, 340, 170, 100, 70};
		int result;
		
		result = cal[Integer.parseInt(choice[0])-1] + cal[Integer.parseInt(choice[1])-1];
		System.out.println(result);
		
		if(result > 500) {
			System.out.println("angry");
		} else {
			System.out.println("no angry");
		}
		
		
		
	}

}
