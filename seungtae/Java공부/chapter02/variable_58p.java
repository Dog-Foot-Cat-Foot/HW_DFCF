package chapter_02;

public class variable_58p {

	public static void main(String[] args) {
		// 부동 소수점 방식의 오류
		
		double dnum = 1;
		
		for(int i = 0; i<10000; i++) { // 반복문실행 자세한 설명은 4장에
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}

}
