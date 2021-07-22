package chapter_07;

public class aloneTest {

	public static void main(String[] args) {
		// alone형 배열 선언 
		alone[] student = new alone[3];
	
		// 변수에 이름과 학번을 호출받아 저장 
		student[0] = new alone("한승태",1234);
		student[1] = new alone("조은채",2345);
		student[2] = new alone("누구냐 넌",5555);
		
		// 배열 길이만큼 반복후 정보 출력 
		for(int i=0; i<student.length; i++) {
			student[i].showInfo();
		}
		

	}

}
