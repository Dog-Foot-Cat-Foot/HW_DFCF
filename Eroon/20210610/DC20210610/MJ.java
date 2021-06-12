package DC20210610;

import java.util.*;

public class MJ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 현의 정보를 나타내는 두 정수를 입력하세요.");
		int a= scan.nextInt();
		int b = scan.nextInt();
		System.out.println("두 번째 현의 정보를 나타내는 두 정수를 입력하세요.");
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if(a==b||c==d||b==c||a==d){
			System.out.println("같은 숫자가 입력되었습니다. 종료합니다.");
			System.exit(0);
		}else if(a<1||b<1||c<1||d<1||a>100||b>100||c>100||d>100) {
			System.out.print("입력된 숫자가 범위를 벗어났습니다. 종료합니다.");
			System.exit(0);
		}else {
			//a, b를 기준으로 c, d 둘 중 하나는 a, b 사이값을 갖고 나머지는 a, b의 범위를 넘는 값을 가져야 함
			int[] arr1 = new int[2];
			arr1[0] = a;
			arr1[1] = b;
			Arrays.sort(arr1);
			
			int[] arr2 = new int[2];
			arr2[0] = c;
			arr2[1] = d;
			Arrays.sort(arr2);
			
			if(arr2[0]>arr1[0]&&arr2[0]<arr1[1]) {
				if(arr2[1]>arr1[1]) System.out.println("cross");
				else System.out.println("not cross");
			}
			else if(arr2[1]>arr1[0]&&arr2[1]<arr1[1]) {
				if(arr2[0]<arr1[0]) System.out.println("cross");
				else System.out.println("not cross");
			}
			else System.out.println("not cross");
		}
	}
}
