package day0720.ch10;

import java.util.ArrayList;

public class Shelf {
	
	//------------------------------------------
	// 자료를 순서대로 저장할 ArrayList 선언
	//------------------------------------------
	protected ArrayList<String> shelf;
	
	//------------------------------------------
	// 디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성된다
	//------------------------------------------
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	//------------------------------------------
	// 저장되어 있는 배열 shelf 반환
	//------------------------------------------
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	//------------------------------------------
	// 배열 shelf에 저장된 요소 개수를 반환
	//------------------------------------------
	public int getCount() {
		return shelf.size();
	}

}
