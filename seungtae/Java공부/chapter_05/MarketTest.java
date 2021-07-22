package chapter_05;

public class MarketTest {

	public static void main(String[] args) {
		
		Market m = new Market();
		
		m.num = 201803120001l;
		m.Id = "abc123";
		m.order = "2018년 3월 12일";
		m.name = "홍길순";
		m.orderId = "PD0345-12";
		m.add = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호:"+m.num);
		System.out.println("주문자아이디:"+m.Id);
		System.out.println("주문날짜:"+m.order);
		System.out.println("주문자이름:"+m.name);
		System.out.println("주문상품번호:"+m.orderId);
		System.out.println("배송주소:"+m.add);

	}

}
