package chapter_04;

public class alone_114p {

	public static void main(String[] args) {
		// 나 혼자 코딩 
		
		// for문과 변수를 사용하여 "안녕하세요1" ... "안녕하세요10" 까지 차례로 출력하시
		
		int i;
		
		for(i = 1; i <= 10 ; i++) {
			System.out.println("안녕하세요" + i); //출력을 for문 안에서 해야 1~10까지 찍힘 
		}
			// System.out.println("안녕하세요" + i); 
		    // 출력을 밖에서 실행할시 i 값이 모두 더해진 후 안녕하세요 + 더해진값 출력 
	}

}
