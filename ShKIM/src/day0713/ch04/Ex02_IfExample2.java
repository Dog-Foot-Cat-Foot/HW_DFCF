package day0713.ch04;

public class Ex02_IfExample2 {

	public static void main(String[] args) {
		
		// int형 변수 age 에 데이터 9 초기화
		int age = 9;
		// int형 변수 charge 선언
		int charge;
		
		// if 조건식 age < 8 이 true인 경우 if문 블록 안의 문장 실행
		// 9 < 8 은 false 로 다음 조건식 비교
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동임");
		} else if(age < 14) {  // age < 14 true 인 경우, 9 < 14 는 true 로 else if문 블록 안의 문장 실행			
			charge = 2000;   			    // 변수 charge 에 2000 대입
			System.out.println("초등학생임");  // 출력
			// 해당 조건을 만족했기에 더 이상 비교하지 않고 조건문을 빠져나온다.
		} else if(age < 20) {  // age < 20 true 인 경우 
			charge = 2500;
			System.out.println("중, 고등학생임");
		} else {  // 위의 조건이 모두 해당하지 않는 경우
			charge = 3000;
			System.out.println("일반인임");
		}
		
		System.out.println("입장료는 " + charge + "원임"); // charge의 데이터 출력
		
		/*
		 * if-else if-else문
		 * 하나의 조건을 만족하면 이후의 조건은 비교하지 않는다.
		 * 하나의 상황에 여러 조건을 비교하는 경우에 구현한다.
		 */
		
	}

}
