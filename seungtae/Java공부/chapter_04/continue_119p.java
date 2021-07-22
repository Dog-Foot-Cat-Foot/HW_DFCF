package chapter_04;

public class continue_119p {

	public static void main(String[] args) {
		// continue
		
		int total = 0; // 더한 값을 저장할 변수 선언 
		int num; 
		
		for(num = 1; num <= 100; num++) { 	// 100까지 반복 
			if(num % 2 == 0)				// num 값이 짝수인 경우
				continue;  					// 이후 수행문을 수행하지 않고 바로 반복실행 구문으로 넘어감 
			total = total + num;			// num 값이 홀수인 경우에만 수행 
		}
		System.out.println("1부터 100까지의 홀수의 합은" + total + "입니다.");
		
	}
}
//	반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고 for문의 처음으로 돌아가 증감식을 수행!!  
