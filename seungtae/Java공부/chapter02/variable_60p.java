package chapter_02;

public class variable_60p {

	public static void main(String[] args) {
		// 자료형 추론
		
		// 지역변수 안에서만 사용가능
		// 아래 예제들은 자료형 없이 변수 선언 
		// 자바 10이상 버전부터 사용가능 
		// 데이터값을 보고 자료형을 추측 
		var i = 10;  // 데이테값을 보고 int형 추측 
		var j = 10.0; // 데이터값을 보고 실수형 추측 
		var str = "hello"; // 데이터값을 보고 string형 추
		
		
		System.out.println(i); 
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 위에서 이미 str 변수 선언 이후 데이터를 보고 string 형으로 추측했기때문에 다른형의 값은 대입불가 
		//str = 3; // str 변수는 string형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없
	}

}
