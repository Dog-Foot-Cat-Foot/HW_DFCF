package C7;
import java.util.ArrayList;
public class ArrayListTest {

	// arraylist를 사용하여 String  으로 선언 후 add 메서드 사용하여 
	// 안녕하세요 , 반가워요 , 잘있어요. 다시 만나요 문구 출력 
	// 출력은 for문으로 size와 향상된 for문을 통해 다르게 2번 출력
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("안녕하세요");
		str.add("반가워요");
		str.add("잘있어요");
		str.add("다시 만나요~");
		
		
		 for(String s : str) // String  선언 스트링 변수 선언 : 인스턴스 객체명
		 {
			 System.out.println(s);
		 }

		for(int i = 0 ; i < str.size(); i++)
		 {
			 System.out.println(str.get(i));
		 }

	}

}
