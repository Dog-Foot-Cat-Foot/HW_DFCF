package day0713.ch07;

public class Subject {
	
	//---------------------------------------------------
	// 멤버 변수
	// <1> 과목 이름
	// <2> 과목 점수
	//---------------------------------------------------
	private String name;	// <1>
	private int scorePoint; // <2>
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	//---------------------------------------------------
	// 매개변수로 받은 데이터를 scorePoint 멤버 변수에 대입
	//---------------------------------------------------
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
}
