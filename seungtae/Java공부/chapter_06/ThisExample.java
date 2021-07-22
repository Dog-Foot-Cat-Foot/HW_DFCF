package chapter_06;

class BirthDay { // 클래스 파일 생성
	// 인스턴스 변수 선언(iv) = 인스턴스 변수는 자동초기화 
	int day;
	int month;
	int year;
	
	public void setYear(int year) { // 태어난 연도를 지정하는 메서드 
		this.year = year;			// bDay.year = year; 와 같음 
	}// this.year = 인스턴스 변수  , year = 지역변수 
	
	public void printThis() {		// this 출력 메서드 
		System.out.println(this); 	// System.out.printl(bDay)와 같음 
	}
}


public class ThisExample {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay(); // 객체 생성 
		bDay.setYear(2000);			// 태어난 연도를 지정 
		System.out.println(bDay);	// 참조 변수 출력 
		bDay.printThis();			// this 출력 메서드 호출 

	}

}
// 참조 변수를 출력하면 '클래스이름@메모리주소' 문자열 값이 나온다.
// this는 생성된 인스턴스 자신을 가리키는 역할을 한다.