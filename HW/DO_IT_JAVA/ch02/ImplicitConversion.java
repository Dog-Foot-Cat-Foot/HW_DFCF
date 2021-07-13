package com.heewon.ch02;


public class ImplicitConversion {

	public static void main(String[] args) {

		//묵시적 형변환
		byte bNum = 10; // 자료형이 byte
		int iNum = bNum; // byte형 변수 bNum값을 int형 변수 iNum에 대입함. 더 큰 자료형으로.
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 =20;
		float fNum = iNum2; //  int형 값이  float형 변수로 대입됨.
		// 덜 정밀에서 더 정밀한 자료형으로.
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum; // 연산중에 자동으로 변환.
		dNum = fNum + iNum;
		System.out.println(dNum);
		
	}

}
 // 형변환의 기본원칙    -->  ★ Casting 했을시의 주의사항! 
 // 1. 바이트 크기가 작은 자료형에서 큰 자료형으로 형변환은 자동으로!
 // 2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이뤄진다!

