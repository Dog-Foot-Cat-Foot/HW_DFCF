package chapter_04;

public class break_121p {

	public static void main(String[] args) {
		// break문 
		
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { // for문 기본 형식 = for(초기화식;조건식;증감식;)  여기선 조건식 생략 
			sum = sum + num;    
			if(sum >= 100) 	// sum이 100보다 크거나 같을 때 (종료조건)
				break;			// 반복문 중단하고 반복문구문을 빠져나감 
		}  
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

	}

}
//  프로그램 실행 중에 반복문을 중단하려면 break문을 사용해야 정확한 결과 값을 얻을 수 있다.
