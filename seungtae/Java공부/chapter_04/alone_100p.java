package chapter_04;

public class alone_100p {

	public static void main(String[] args) {
		// 앞에서 100 ~ 90점은 A , 89 ~ 80점은 B, 79 ~ 70점은 C, 69~60점은 D, 나머지는 F 입니다.
		// int형 변수score char형 변수grade를 사용하여 score에 따른 grade를 출력해보세요.
		
		int score = 90;
		char grade;
		
		if(score>=90) {
			grade = 'A';
			System.out.println("A학점 ");
		}else if(score>=80) {
			grade = 'B';
			System.out.println("B학점 ");
		}else if(score>=70) {
			grade = 'C';
			System.out.println("C학점 ");
		}else if(score>=60) {
			grade = 'D';
			System.out.println("D학점 ");
		}else {
			grade = 'F';
			System.out.println("F학");
		}
		System.out.println("당신의 최종 학점은 " + grade + "입니다. ");
	}
}
