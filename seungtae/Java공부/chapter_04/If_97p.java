package chapter_04;

public class If_97p {

	public static void main(String[] args) {
		// if-else if-else
		
		int age = 9; 
		int charge; // 정수형 charge 선언 
		
		if(age < 8) { // 나이가 8살 미만이면 가격은 1000원이고 "취학 전 아동입니다." 출력 
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if( age < 14) { 
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if( age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입다.");
		}else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
			System.out.println("입장료는" + charge + "원입니다."); // if문이 끝난 후 실행 
	}

}
