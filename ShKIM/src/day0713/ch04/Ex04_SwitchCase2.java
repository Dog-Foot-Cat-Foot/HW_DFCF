package day0713.ch04;

public class Ex04_SwitchCase2 {

	public static void main(String[] args) {

		//---------------------------------------------------
		// medal 변수에 "Gold" 데이터를 가진 String 객체의 메모리 위치 주소값 대입 
		//---------------------------------------------------
		String medal = "Gold";	
		
		//---------------------------------------------------
		// switch문의 조건인 medal 데이터와 case의 값 비교하여 일치하는 경우 case : ~ break; 문장 실행
		// <1> medal의 데이터인 Gold와 일치, 조건문 실행
		// <2> switch문 중단
		//---------------------------------------------------
		switch (medal) {
			case "Gold":  	// <1>
				System.out.println("금메달"); 
				break;		// <2> 	
			case "Silver":
				System.out.println("은메달");
				break;
			case "Bronze":
				System.out.println("동메달");
				break;
			default:
				System.out.println("메달 없음");
				break;
		}
		
		
		/* ========================================================
		 * 자바 7부터는 switch-case문의 case 값에 정수 값뿐 아니라 문자열도 사용할 수 있다.
		 * ========================================================
		 */

	}

}
