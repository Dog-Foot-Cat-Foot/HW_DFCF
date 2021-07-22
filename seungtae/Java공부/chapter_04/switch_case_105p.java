package chapter_04;

public class switch_case_105p {

	public static void main(String[] args) {
		// switch-case문
		// case 본래 자바7부터 case값에 문자열도 사용 가능 
		
		String medal = "Gold";
		
		switch(medal) { // 조건식에 문자열 사용가
		case "Gold": 
			System.out.println("금메달입니다.");
			break; // 조건에 맞으면 함수 빠져나옴 
		
		case "Silver":
			System.out.println("은메달입니다.");
			break;
			
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
			
		default : 
			System.out.println("메달이 없습니다.");
			break; // 위 조건들에 부합되는게 없으면 실행 
			
		}

	}

}
