## 1.Hello, Java 문장 출력하기
```java
package kr.java.chapter01;

public class HelloJava {

	public static void main(String[] args) {
		//"Hello, Java" 출력하는 출력문
		System.out.println("Hello, Java"); 
	}

}
```

## 2.연습문제
1. 프로그램(코드)을 기계가 이해할 수 있는 언어로 바꾸는 작업을 [컴파일] 이라고 합니다.
2. [객체 지향 프로그래밍] 언어는 자바나 C++와 같이 대상이 되는 객체를 기반으로 프로그램을 구현하는 언어입니다.
3. 자바로 만든 프로그램은 [자바 가상 머신(JVM)]이 설치되어 있으면 운영체제와 상관없이 실행할 수 있습니다.
4. 자바 개발을 위해 설치하는 자바 라이브러리를 [JDK]라고 합니다.
5. 자바 프로그램이 실행되는 자바 실행 환경을 [JRE]라고 합니다.
6. 두 번째 자바 프로그램을 만들어 보세요. 이클립스에서 'Hello, Java'대신 여러분의 이름을 출력해 보세요.

    ```java
    package kr.java.chapter01;

    public class EunJi {

    	public static void main(String[] args) {
    		// 내 이름 출력
    		System.out.println("임은지");
    	}

    }
    ```
## 3.변수 선언하여 사용하기
```java
package kr.java.chapter02;

public class Variable1 {
	
	public static void main(String[] args) {
		//정수형 변수 level을 선언
		int level;
		//level 변수에 값 10을 대입
		level = 10;
		//level 값 출력
		System.out.println(level);
		
		//1분 복습 내 나이 출력
		//정수형 변수 age를 선언
		int age;
		//age에 내 나이 27 대입
		age = 27;
		//age 값 출력
		System.out.println(age);

	}

}
```

## 4.변수 초기화하기
```java
package kr.java.chapter02;

public class Variable2 {

	public static void main(String[] args) {
		//level 변수 선언과 동시에 값을 대입(초기화)
		int level = 10;
		System.out.println(level);
	}

}
```
## 5.자료형이 다른 정수끼리 더하면 어떻게 될까요?
```java
package kr.java.chapter02;

public class IntegerVariable {

	public static void main(String[] args) {
		//short 형 sVal에 10 대입
		short sVal =10;
		//byte 형 bVal에 20 대입
		byte bVal =20;
		//서로 다른 형을 계산
		System.out.println(sVal+bVal);
	}

}
```

## 6.문자형 연습
```java
package kr.java.chapter02;

public class CharacterEx1 {

	public static void main(String[] args) {
		//문자형 연습
		
		//char 형에 문자'A' 대입
		char ch1 ='A';
		//문자 출력
		System.out.println(ch1);
		//문자에 해당하는 정수 값(아스키 코드 값) 출력
		System.out.println((int)ch1);
		
		//char 형에 정수 값 대입
		char ch2 = 66;
		//정수 값에 해당하는 문자 출력
		System.out.println(ch2);
		
		//정수 값 대입
		int ch3 =67;
		//문자 정수 값 출력
		System.out.println(ch3);
		//정수 값에 해당하는 문자 출력
		System.out.println((char)ch3);
	}

}
```

## 7.문자형 연습
```java
package kr.java.chapter02;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
```

## 8.문자형 연습
```java
package kr.java.chapter02;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a =65;
		int b =-66;
		
		char a2 = 65;
		//문자형 변수에 음수를 넣으면 오류가 발생!
		//char b2 =-65;
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);

	}

}
```

## 9.실수형 연습

```java
package kr.java.chapter02;

public class DoubleEx1 {

	public static void main(String[] args) {
		//실수형 연습
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
	}

}
```

## 9.부동 소수점 방식의 오류
```java
package kr.java.chapter02;

public class DoubleEx2 {

	public static void main(String[] args) {
		// 부동 소수점 방식의 오류
		double dnum =1;
		
		for(int i= 0; i<10000; i++) {
			dnum = dnum +0.1;
		}
		System.out.println(dnum);
	}

}
```

## 10.논리형 연습
```java
package kr.java.chapter02;

public class BooleanEx {

	public static void main(String[] args) {
		//논리형 연습
		
		//boolean 변수를 선언하고 초기화
		boolean isMarried = true;

		System.out.println(isMarried);
	}

}
```

## 11.자료형 추론
```java
package kr.java.chapter02;

public class TypeInference {

	public static void main(String[] args) {
		//자료형 추론
		
		//int i=10 으로 컴파일됨
		var i =10;
		//double j=10.0 으로 컴파일됨
		var j =10.0;
		//String str ="hello" 로 컴파일됨
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		//다른 문자열은 대입 가능
		str = "test";
		//str 변수는 String 형으로 먼저 사용되었기 때문에
		//정수 값을 넣을 수 없음
		//str = 3;
	}

}
```

## 12.상수 사용하기
```java
package kr.java.chapter02;

public class Constant {

	public static void main(String[] args) {
		// 상수 사용하기
		final int MAX_NUM =100;
		final int MIN_NUM;
		
		//사용하기 전에 초기화.
		//초기화하지 않으면 오류 발생
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//오류 발생. 상수는 값을 변경할 수 없음.
		//MAX_NUM = 1000;
		
		//정수 MY_AGE를 선언하고 값 22를 대입함
		final int MY_AGE = 22;
		//MY_AGE 값을 출력함
		System.out.println(MY_AGE);
	}

}
```

## 13.묵시적 형 변환
```java
package kr.java.chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 묵시적 형 변환
		byte bNum = 10;
		//byte형이 int형 변수로 대입됨
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		//int 형 값이 float형 변수로 대입됨
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);

	}

}
```

## 14.명시적 형 변환
```java
package kr.java.chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {
		//명시적 형 변환
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		//두 실수가 각각 형 변환이 되어 더해짐
		int iNum3 = (int)dNum1 + (int)fNum2;
		//두 실수의 합이 먼저 계산되고 형 변환됨
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
```

## 15.연습문제

```java
1. 예
2. 
3. 부동소수점방식
4.package kr.java.chapter02;

public class Java_Test02 {

	public static void main(String[] args) {
		//연습문제
		//Q4
		int num1 = 10;
		double num2 = 2.0;
		
		System.out.println((int)(num1+num2));
		System.out.println((int)(num1-num2));
		System.out.println((int)(num1*num2));
		System.out.println((int)(num1/num2));

		//Q5 은 귀찮;;
		

	}

}
```

## 16.산술 연산자를 사용하여 총점과 평균 구하기

```java
package kr.java.chapter03;

public class OperationEx1 {

	public static void main(String[] args) {
		//대입 연산자
		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		System.out.println(num);
		
		//산술 연산자를 사용하여 총점과 평균 구하기
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		//총점 구하기
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		//평균 구하기
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);	
	}

}
```

## 17.증가, 감소 연산자를 사용하여 값 연산하기
```java
package kr.java.chapter03;

public class OperationEx2 {

	public static void main(String[] args) {
		//증가, 감소 연산자를 사용하여 값 연산하기
		//게임에서 획득한 점수는 150점
		int gameScore = 150;
		
		//gameScore에 1만큼 더한 값을 lastScore1에 대입
		int lastScore1 = ++gameScore;
		//151
		System.out.println(gameScore + "," + lastScore1);
		
		//gameScore에 1만큼 뺀 값을 lastScore2에 대입
		int lastScore2 = --gameScore;
		//150
		System.out.println(gameScore + "," + lastScore2);
		
		//------
		//lastScore1 = gameScore++;
		//System.out.println(gameScore + "," + lastScore1);
		
		//lastScore2 = gameScore--;
		//System.out.println(gameScore + "," + lastScore2);
	}

}
```

## 18.단락 회로 평가 실습하기
```java
package kr.java.chapter03;

public class OperationEx3 {

	public static void main(String[] args) {
		//단락 회로 평가 실습하기
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1=num1+10)<10)&&((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value=((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//1분 복습
		System.out.println("----------");
		int num2 = 5;
		int i2 = 10;
		
		boolean value2=((num2=num2*10)>45)||((i=i-5)<10);
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(i2);
	}

}
```

## 19.조건 연산자를 사용하여 부모님의 나이 비교하기

```java
package kr.java.chapter03;

public class OperationEx4 {

	public static void main(String[] args) {
		//조건 연산자를 사용하여 부모님의 나이 비교하기
		int fatherAge=45;
		int motherAge=47;
		
		char ch;
		ch=(fatherAge>motherAge)?'T':'F';
		
		System.out.println(ch);
		
		//1분복습
		System.out.println("----------");
		
		int num=10;
		boolean isEven;
		isEven=(num%2==0)?true:false;
		System.out.println(isEven);
	}

}
```

## 20.비트 이동 연산자를 사용하여 연산하기

```java
package kr.java.chapter03;

public class OperationEx5 {

	public static void main(String[] args) {
		//비트 이동 연산자를 사용하여 연산하기
		//5를 8비트 2진수로 나타냄
		int num=0B00000101;
		
		//왼쪽으로 2비트 이동 00010100(20)
		System.out.println(num<<2);
		//오른쪽으로 2비트 이동 00000001(1)
		System.out.println(num>>2);
		//오른쪽으로 2비트 이동 00000001(1)
		System.out.println(num>>>2);
		
		//num에 값을 대입하지 않았으므로 비트 이동과
		//관계없이 기존 값 그대로 출력
		System.out.println(num);
		
		//왼쪽으로 2비트 이동한 값을 다시 num에 대입
		num = num <<2;
		System.out.println(num);
	}

}
```
