package day0713.ch07;

public class Ex10_EnhancedForLoop {

	public static void main(String[] args) {
		
		// String형 객체 배열 생성과 동시에 데이터 초기화
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		// 향상된 for문
		// strArray 배열의 모든 배열 요소의 데이터를 하나씩 가져온다
		// lang 변수에는 배열의 각 요소가 대입된다
		for(String lang : strArray) {
			// 가져온 데이터 출력
			System.out.println(lang); 
		}
		
		/* ===================================================
		 * 향상된 for문(enhanced for loop)과 배열
		 * 배열의 처음에서 끝까지 모든 요소를 참조할 때 사용하면 편리한 반복문이다
		 * 
		 * for(변수:배열){
		 * 	  반복 실행문;
		 * }
		 * 
		 * 배열 요소 값을 순서대로 하나씩 가져와서 변수에 대입한다.
		 * 따로 초기화와 종료 조건이 없기 때문에 모든 배열의 시작 요소부터 끝 요소까지 실행한다
		 * ===================================================
		 */

	}

}
