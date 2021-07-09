package day0709.ch02;

public class Ex10_ImplicitConversion {

	public static void main(String[] args) {
		
		// byte형 변수 bNum 선언과 동시에 데이터 10 대입
		byte bNum = 10;
		// int형 변수 iNum 선언과 동시에 bNum의 데이터를 10을 int형으로 자동 형변환하여 대입
		// 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우 묵시적 형 변환 일어남
		// int iNum = (int)10;
		int iNum = bNum;
		
		// byte형 변수 bNum, int형 변수 iNum 데이터 출력
		System.out.println(bNum); // 출력: 10
		System.out.println(iNum); // 출력: 10
		
		// int형 변수 iNum2 선언과 동시에 데이터 20 대입
		int iNum2 = 20;
		// float형 변수 fNum 선언과 동시에 iNum2의 데이터를 20을 float형으로 자동 형변환하여 대입
		// 덜 정밀한 자료형(int)에서 더 정밀한 자료형(float)으로 대입하는 경우 실수형인 float으로 자동 변환됨
		// float fNum = (float)20.0;
		float fNum = iNum2;
		
		// int형 변수 iNum2, float형 변수 fNum 데이터 출력
		System.out.println(iNum2); // 출력: 20
		System.out.println(fNum); // 출력: 20.0
		
		// double형 변수 dNum 선언
		double dNum;
		// double형 변수 dNum에 fNum의 데이터 (float)20.0 + iNum의 데이터 (int)10 가
		// (float)20.0 + (float)10.0 으로 자동 형변환되어 계산된 값 (float)30.0 이
		// (double)30.0 으로 자동 형 변환되어 dNum에 대입됨
		dNum = fNum + iNum;
		// double형 변수 dNum의 데이터 30.0 출력
		System.out.println(dNum); // 출력: 30.0
		
	}

}
