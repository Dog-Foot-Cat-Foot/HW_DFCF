package chapter_04;

public class while_109p {

	public static void main(String[] args) {
		// while문 활용 1부터 10까지 더하기 
		
		int num = 1; // 1씩 늘려갈 변수 설정 
		int sum = 0; // 증가한 숫자를 모두 더한 결과 값 저장  변수 설정 
		
		while( num <= 10 ) { // num 값이 10보다 작거나 같을동안 조건식 설
			sum += num;  // sum = sum + num 
			num++;		// num에 1씩 더해 나감 
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
// 		while문은 조건을 먼저 검사하기 때문에 조건식에 맞지 않으면 반복 수행이 한 번도 일어나지 않는다.