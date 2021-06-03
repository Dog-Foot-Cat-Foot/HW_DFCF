//Q1.
public class MJTest1 {

	public static void main(String[] args) {
		// 주사위 : 명진
		for(int i = 0; i < 1; i++) {
			int dice = (int)(Math.random()*6)+1;
			System.out.println("출력 주사위 숫자는 "+dice);
		}
	}
}

//Q2.
import java.util.*;

public class MJTest2 {

	public static void main(String[] args) {
		// 컴퓨터랑 싸우는 가위,바위,보 : 명진
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력[1:가위 2:바위 3:보] ");
		
		for(int i = 0; i < 1; i++) {
			
			int user = scanner.nextInt();
			if(user == 1) {
				System.out.println("[유저: 가위]");
			}
			else if(user == 2) {
				System.out.println("[유저: 바위]");
			}
			else if(user == 3) {
				System.out.println("[유저: 보]");
			}
			else {
				System.out.println("다시!");
				break;
			}
			
			int com = (int)(Math.random()*3)+1;
			if(com == 1) {
				System.out.println("[컴퓨터: 가위]");
			}
			else if(com == 2) {
				System.out.println("[컴퓨터: 바위]");
			}
			else if(com == 3) {
				System.out.println("[컴퓨터: 보]");
			}
				
			if(user == com) {
				System.out.println("비겼습니다.");
			}
			else if((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2)){
				System.out.println("이겼습니다.");
			}
			else if((user==1&&com==2)||(user==2&&com==3)||(user==3&&com==1)) {
				System.out.println("졌습니다.");
			}
			
		}
		
	}

}
