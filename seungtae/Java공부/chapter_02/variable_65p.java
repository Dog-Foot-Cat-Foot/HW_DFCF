package chapter_02;

public class variable_65p {

	public static void main(String[] args) {
		// 묵시적 형변환 
		
		// 묵시적 형변환이란 ? 
		// 바이트크기가 작은 수 -> 큰 수 
		// 덜 정밀한 수 -> 더 정밀한 수로 자동 형 변
		
		byte bNum = 10;  // 정수형 byte타입 선언 및 데이터 입력 
		int iNum = bNum; // 정수형 int타입 선언 및 데이터 입력  
		                 
		
		System.out.println(bNum); // 10 
		System.out.println(iNum); // 10
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum); // 10
		System.out.println(fNum); // 20.0 실수형 float이 정수형 int보다 더 정밀하기 때문에 
		                          // 대입 값이 float 형으로 변환
		          
		
		double dNum; 
		dNum = fNum + iNum; // int형보다 float형이 더 정밀하기 때문에 형변환 즉 20.0+10.0 = 30.0 
		
		System.out.println(dNum); // 30.0

	}

}
