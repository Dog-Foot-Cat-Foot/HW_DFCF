package chapter_07;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 초기화하고 출력하기
		
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10}; // 배열 선언 및 값 대입 
		int sum = 0; // 배열의 총합을 담을 변수 선언하고 변수에 데이터 0 대입 
		
		// 반복문을 이용한 배열 1~10 저장한 데이터 출력 
		// .num 속성 length를 사용해서 위에서 선언한 배열 num의 길이 까지 출력 
		// 참고로 배열은 인덱스번호가 있다. 인덱스 번호는 0부터 시작 
		for(int i=0; i<num.length; i++) { // 반복문 
			sum += num[i]; // sum = sum+num[i] 같은 의미 
			System.out.println(num[i]); // 모든 배열 데이터 출력 
		}
		System.out.println(sum); // 데이터 합 출력 
	} 

}
