package C7;
import java.util.ArrayList;
public class ArrayListTest {

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
