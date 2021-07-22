package chapter_05_7;

public class MyDate {
	/*
	public int day;
	public int month;
	public int year; */ 
	// 이렇게 public으로 선언시 값이 오류가 생길 수 있다.
	
	private int day; // 외부에서 사용 불가 
	private int month;
	private int year;
	
	// 메소드 생성 
	public void setDay(int day) { //set으로 메서드를 활용해서 값을 대입할 수 있음 
		if(month==2) { // 만약 2월이고 
			if(day<1||day>28) { // 일짜가 1일보다 작거나 또는 일짜가 28일보다 크면  
				System.out.println("오류입니다."); // 오류입니다 출력 
			}else { 
				this.day = day; 
			}
		}
	}
	
}


