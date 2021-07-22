package chapter_04;

public class switch_case_102p {

	public static void main(String[] args) {
		// switch-case문
		
		int ranking = 2;
		char medalColor; 
		
		switch(ranking) {
		case 1 : medalColor = 'G';
				break; // break를 써주지 않으면 뒤에있는 수행구문까지 넘어가버림 
		case 2 : medalColor = 'S';
				break;
		case 3 : medalColor = 'B';;
				break;
		default : medalColor = 'A'; // 조건에 만족하지 않으면 수행구문 실행 
				
		}
		System.out.println(ranking + "등 메달의 색상은" + medalColor + "입니다.");

	}

}
