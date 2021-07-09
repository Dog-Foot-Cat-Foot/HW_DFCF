package day0709.ch04;

public class Ex03_SwitchCase {

	public static void main(String[] args) {

		// int형 변수 ranking 에 데이터 1 초기화
		int ranking = 1;
		// char형 변수 medalColor 선언
		char medalColor;
		
		// switch-case문 ranking의 데이터와 case의 데이터가 같은 경우
		// case : ~ break; 까지 조건에 해당하는 문장을 실행함
		switch (ranking) {
			case 1:  		      // ranking의 데이터가 1 이므로 해당 case 의 수행문이 break; 전까지 실행된다
				medalColor = 'G'; // medalColor 변수에 G 데이터 대입
				break;  		  // break; 로 switch문 빠져나옴
			case 2:
				medalColor = 'S';
				break;
			case 3:
				medalColor = 'B';
				break;
			default:		// 어떤 case에도 해당하지 않는 경우 실행
				medalColor = 'A';
		}

		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
		// ranking의 데이터 1, medalColor의 데이터 G 출력
		
		/*
		 * switch-case문
		 * 조건의 데이터와 case의 값이 동일한 경우 조건문을 실행한다. 
		 * 주의!! case : ~ break; 까지가 조건에 해당하는 문장이다.
		 * case에 해당하면 break문을 만나야지만 switch문을 벗어난다.
		 * break문이 없다면 switch문 끝까지 실행된다. (case 조건값 무시, default문까지 실행됨)
		 */
		
	}

}
