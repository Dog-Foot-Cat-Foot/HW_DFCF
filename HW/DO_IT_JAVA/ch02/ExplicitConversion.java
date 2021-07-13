package com.heewon.ch02;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		
		// 실수자료형 double을 정수자료형으로 int 로 형변환.
		int iNum3 = (int)dNum1 + (int)fNum2;  // 두 실수가 각각 형 변환되어 더해짐 	
		int iNum4 = (int)(dNum1 + fNum2);  // 두 실수의 합이 먼저 계산되고 형 변환됨.
		//강제로 형을 바꾸려면 바꿀형을 괄호를 써서 명시해야 함.
		
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		// 묵시적 형변환과는 반대의 경우
		// 바이트크기가 큰 자료형에서 작은 자료형으로 대입.
		// 더 정밀한 자료에서 덜 정밀한 자료형으로.
		
	}

}
