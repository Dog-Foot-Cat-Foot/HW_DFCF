package chapter_03;

public class operator_78p {

	public static void main(String[] args) {
		// 단락 회로 평가 실습
		
		int num1 = 10;
		int i = 2;
		
		boolean value = (( num1 = num1 + 10 )<10 && ( i = i + 2)<10 );
		// &&은 모두 참일 경우 true 리턴 
		// num1에 값 20이 저장 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = (( num1 = num1 + 10 )>10 || ( i = i + 2)>10 );
		//위 식에서 num1 의 값 20으로 변경 후 +10 값 30 저장 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 1분 복습
		int a = 5;
		int j = 10;
		
		value = (( a = a * 10)>45 || (j = j - 5)<10);
		System.out.println(value);
		System.out.println(a);
		System.out.println(j);
		
	}

}
