package chapter_07;

public class Book {
		// 객체 배열 만들기(1)
		
		private String bookName;
		private String author;
		
		public Book() {
			// 디폴트 생성자 
		}
		
		// 책 이름과 저자 이름을 매개변수로 받는 생성자 
		public Book(String bookName, String author) {
			this.bookName = bookName;
			this.author = author;
		}
		
		// 클래스 변수를 private로 사용했기 때문에 외부에서 가져다 쓰고 세팅하기 위해서 get,set 메서드 구현 
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
		
		public void showBookInfo() { // 정보를 보여주는 메소드 구현 
			System.out.println(bookName + "," + author);
		}

}
