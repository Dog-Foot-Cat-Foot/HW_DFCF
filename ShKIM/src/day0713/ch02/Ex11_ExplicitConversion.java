package day0713.ch02;

public class Ex11_ExplicitConversion {

	public static void main(String[] args) {
		
		//--------------------------------------------------
		// <1> double형 변수 dNum1 선언과 동시에 1.2 데이터 대입
		// <2> float형 변수 fNum2 선언과 동시에 (float)0.9 데이터 대입
		//--------------------------------------------------
		double dNum1 = 1.2;						// <1>
		float fNum2 = 0.9f;						// <2>
		
		//------------------------------------------------------------------------
		// <3> int형 변수 iNum3 선언과 동시에 
		// dNum1의 데이터 (double)1.2 가 (int)1 로 형변환
		// fNum2의 데이터 (float)0.9 가 (int)0 으로 형변환
		// (int)1 + (int)0 의 데이터 (int)1이 대입됨
		// 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우 형 변환을 명시해야 함
		// 자료가 손실될 수 있으므로 (이와 같은 경우 소수점 버림)
		// (int)dNum1를 명시하지 않을 경우 오류 : Type mismatch: cannot convert from double to int
		// (int)fNum2를 명시하지 않을 경우 오류 : Type mismatch: cannot convert from float to int
		// <4> int형 변수 iNum4 선언과 동시에 
		// dNum1의 데이터 (double)1.2 와
		// fNum2의 데이터 (float)0.9 가 (double)0.9 으로 자동 형변환됨
		// (double)1.2 + (double)0.9 로 연산된 (double)2.1이
		// (int)2 로 강제 형변환되어 (소수점 버림, 명시적) 대입됨
		// (int)(dNum1 + fNum2)을 명시하지 않을 경우 오류 : Type mismatch: cannot convert from double to int
		//------------------------------------------------------------------------
		int iNum3 = (int)dNum1 + (int)fNum2;	// <3>
		int iNum4 = (int)(dNum1 + fNum2);		// <4>
		
		//--------------------------------------------------
		// <1> int형 변수 iNum3의 데이터 출력
		// <2> int형 변수 iNum4의 데이터 출력
		//--------------------------------------------------
		System.out.println(iNum3); // <1> 출력: 1
		System.out.println(iNum4); // <2> 출력: 2
		
	}

}
