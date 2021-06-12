package C7;
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("dddd");
		str.add("kfsdafka");
		str.add("안녕하세요");
		
		
		 for(String s : str) // String  선언 스트링 변수 선언 : 인스턴스 객체명
		 {
			 System.out.println(s);
		 }

		for(int i = 0 ; i < str.size(); i++)
		 {
			 System.out.println(str.get(i));
		 }
		/*
		ArrayList<Book> library = new ArrayList<Book>(); // ArrayList �꽑�뼵
		
		library.add(new Book("�깭諛깆궛留�","議곗젙�옒")); //add() 硫붿꽌�뱶濡� �슂�냼 媛� 異붽�
		library.add(new Book("�뜲誘몄븞","�뿤瑜대쭔 �뿤�꽭"));
		library.add(new Book("�뼱�뼸寃� �궡 寃껋씤媛�","�쑀�떆誘�"));
		library.add(new Book("�넗吏�","諛뺢꼍由�"));
		library.add(new Book("�뼱由곗솗�옄","�깮�깮伊먰럹由�"));
		
		
		for(int i = 0; i <library.size() ; i++)
		{
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		
		System.out.println("==========�뼢�긽�맂 for臾� �궗�슜");
		for( Book book : library) {
			book.showBookInfo();
		}
		*/
		
	}

}
