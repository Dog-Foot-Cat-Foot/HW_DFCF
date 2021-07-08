package day0709.ch02;

public class Ex08_TypeInference {

	public static void main(String[] args) {
		
		// 자바 10 부터 var 를 사용하여 변수 선언 가능
		// 변수에 대입되는 자료를 보고 컴파일러가 추측함
		
		// int i = 10 으로 컴파일
		var i = 10;
		// double j = 10.0 으로 컴파일
		var j = 10.0;
		// String str = "hello" 으로 컴파일
		var str = "hello";
		
		// 변수 i, j, str 데이터 출력
		System.out.println(i); // 출력: 10
		System.out.println(j); // 출력: 10.0
		System.out.println(str); // 출력: hello
		
		// str 변수에 "test" 데이터 대입
		str = "test";
		// str 변수는 String형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없다
		// Type mismatch: cannot convert from int to String
		// str = 3;

	}

}
