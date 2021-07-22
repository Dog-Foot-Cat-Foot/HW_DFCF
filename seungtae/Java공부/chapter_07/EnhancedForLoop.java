package chapter_07;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// 향상된 for문 사용하기 
		
		// String형으로 선언된 strArray배열에 문자열 5개를 저장 
		String[] strArray = {"Java" , "Android" , "C" , "JavaScript" , "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}

	}

}
