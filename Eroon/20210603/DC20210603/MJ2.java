package DC20210603;

import java.util.Scanner;

public class MJ2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 [1: 가위 2: 바위 3:보]");
		int mine = scan.nextInt();
		int computer = (int) (Math.random() * (3) + 1);
		if(mine == 1) {
			System.out.print("[나 : 가위] ");
			if(computer == 1) System.out.print("[컴퓨터 : 가위] 비겼습니다.\n");
			else if(computer == 2) System.out.print("[컴퓨터 : 바위] 졌습니다.\n");
			else System.out.print("[컴퓨터 : 보] 이겼습니다.\n");
		}else if(mine ==2) {
			System.out.print("[나 : 바위] ");
			if(computer == 1) System.out.print("[컴퓨터 : 가위] 이겼습니다.\n");
			else if(computer == 2) System.out.print("[컴퓨터 : 바위] 비겼습니다.\n");
			else System.out.print("[컴퓨터 : 보] 습니다.\n");
		}else if(mine == 3) {
			System.out.print("[나 : 보] ");
			if(computer == 1) System.out.print("[컴퓨터 : 가위] 졌습니다.\n");
			else if(computer == 2) System.out.print("[컴퓨터 : 바위] 이겼습니다.\n");
			else System.out.print("[컴퓨터 : 보] 비겼습니다.\n");
		}else System.out.println("잘못된 숫자를 입력했습니다.");
	}
}
