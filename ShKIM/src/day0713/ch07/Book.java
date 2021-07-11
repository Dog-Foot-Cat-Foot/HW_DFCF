package day0713.ch07;

public class Book {
	
	// 멤버 변수
	// private로 String형 참조 변수 선언
	private String bookName;
	private String author;
	
	// 디폴트 생성자
	public Book() {}
	
	// 매개변수가 있는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// get(), set() 메서드 ===================
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// =============== get(), set() 메서드 끗
	
	// 책 정보를 출력해 주는 메서드
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
}
