package chapter_07;

public class alone {
	
	// 멤버변수 
	String name;
	int studentId;
	
	// 이름과 학번을 받는 생성자 
	public alone(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	// 정보를 출력하는 메서드 
	public void showInfo() {
		System.out.println(name + "," + studentId);
	}
}
