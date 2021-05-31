package DC20210528;
import java.util.Scanner;

public class LH1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu1 = scan.nextInt();
		int menu2 = scan.nextInt();
		
		int cal1=0;
		int cal2=0;
		
		if(menu1 == 1) cal1 = 400;
		else if(menu1 == 2) cal1 = 340;
		else if(menu1 == 3) cal1 = 170;
		else if(menu1 == 4) cal1 = 100;
		else if(menu1 == 5) cal1 = 70;
		else System.out.println("메뉴가 존재하지 않습니다.");
	
		if(menu2 == 1) cal2 = 400;
		else if(menu2 == 2) cal2 = 340;
		else if(menu2 == 3) cal2 = 170;
		else if(menu2 == 4) cal2 = 100;
		else if(menu2 == 5) cal2 = 70;
		else System.out.println("메뉴가 존재하지 않습니다.");
		
		if((cal1+cal2)> 500) System.out.println("angry");
		else System.out.println("no angry");
	}

}