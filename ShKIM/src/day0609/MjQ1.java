package day0609;

public class MjQ1 {

	public static void main(String[] args) {
		
		System.out.println(solution(11, 10));
		
	}
	
	// 입력 : 게시물 총 건수, 한 페이지에 보여줄 게시물 수
	// 출력 : 총 페이지 수
	public static int solution(int m, int n) {
		
		return (m%n == 0)? m/n: m/n+1;
	}

}
