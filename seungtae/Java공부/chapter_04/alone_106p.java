package chapter_04;

public class alone_106p {

	public static void main(String[] args) {
		// 5층 건물이 있다. 
		// 1층 약국 , 2층 정형외과 , 3층 피부과 , 4층 치과 , 5층 헬스클럽 
		
		int button = 3;
		String ele;
		
		switch(button) {
		case 1 : ele = "약국";
			break; 
		
		case 2 : ele = "정형외과";
			break;
			
		case 3 : ele = "피부과";
			break;
			
		case 4 : ele = "치과";
			break;
			
		case 5 : ele = "헬스클럽";
		 	break;
		 	
		default : ele = "없음";
		}
		System.out.println("이번 층은" + " " + ele + "입니다.");
	}

}
