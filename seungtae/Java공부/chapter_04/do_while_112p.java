package chapter_04;

public class do_while_112p {

	public static void main(String[] args) {
		// do-while문 
		
		int num = 1; // 1씩 늘려갈 변수 설정 
		int sum = 0; // 증가한 숫자를 모두 더한 결과 값 저장  변수 설정 
		
		do {                      // 조건식이 참이 아니더라도 무조건 한 번 수
			sum += num;
			num++;
		} while( num <= 10);
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
//     do-while문은 중괄호 안의 문장을 무조건 한 번 수행한 후에 조건식을 검사
//     따라서 중괄호 안의 문장을 반드시 한 번 이상 수행해야 할 때 while문 대신 사