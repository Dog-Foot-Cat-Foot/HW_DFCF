//Q1.
public class EJTest1 {

	public static void main(String[] args) {
		// 별 계단 출력
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("몇 층 계단을 만들겠습니까?? ");
		int n = scanner.nextInt();	//입력한 정수 -> 변수 n에 저장
		
		if(1<=n && n<=100) {	//1<= n <=100 범위 지정
			
			for(int i = 0; i < n ; i++) {	// n동안 반복
				
				for(int j = 0; j < i; j++) {	//i보다 작을 동안 반복
					System.out.print(" ");		//공백
				}
				for(int k = 0; k < 2; k++) {	// *이 2개니까 2개일때까지 반복
					System.out.print("*");		// *
				}
				System.out.println();
			}
		}
		else {
			
			System.out.println("다시 입력하세요!");
		}
	
	}

}

//Q2.
