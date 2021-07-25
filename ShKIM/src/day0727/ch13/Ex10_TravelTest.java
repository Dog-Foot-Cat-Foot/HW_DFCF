package day0727.ch13;

import java.util.ArrayList;
import java.util.List;

public class Ex10_TravelTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> TravelCustomer형 customerKim 변수 선언, TravelCustomer 인스턴스 생성하여 리턴된 메위주 대입 
		// <2> TravelCustomer형 customerPark 변수 선언, TravelCustomer 인스턴스 생성하여 리턴된 메위주 대입 
		// <3> TravelCustomer형 customerMin 변수 선언, TravelCustomer 인스턴스 생성하여 리턴된 메위주 대입 
		// <4> TravelCustomer형으로 List 변수 customerList 선언, ArrayList 인스턴스 생성하여 리턴된 메위주 대입
		// <5> customerList 변수로 add() 메서드 호출하여 customerKim 데이터 추가
		// <6> customerList 변수로 add() 메서드 호출하여 customerPark 데이터 추가
		// <7> customerList 변수로 add() 메서드 호출하여 customerMin 데이터 추가
		//------------------------------------------
		TravelCustomer customerKim = new TravelCustomer("김석진", 30, 100);		// <1>	
		TravelCustomer customerPark = new TravelCustomer("박지민", 17, 100);	// <2>
		TravelCustomer customerMin = new TravelCustomer("민윤기", 29, 50);		// <3>
		List<TravelCustomer> customerList = new ArrayList<>();					// <4>
		customerList.add(customerKim);		// <5>
		customerList.add(customerPark);		// <6>
		customerList.add(customerMin);		// <7>
		
		//------------------------------------------
		// <1> customerList 변수로 stream 생성, map() 메서드로 고객 이름 가져오기
		//	forEach() 메서드로 가져온 고객 이름 하나씩 꺼내어 출력
		//	김석진
		//	박지민
		//	민윤기
		//------------------------------------------
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));	// <1>
		
		//------------------------------------------
		// <1> int형 total 변수 선언, 
		//	customerList 변수로 stream 생성, mapToInt() 메서드로 고객이 지불한 비용 가져오기
		//	sum() 메서드로 지불한 비용 합을 구하여 total 변수에 대입
		// <2> 출력 : 250
		//------------------------------------------
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();	// <1>
		System.out.println("총 여행 비용은 : " + total + "입니다.");			// <2>
		
		//------------------------------------------
		// <1> customerList 변수로 stream 생성, filter() 메서드로 고객 나이가 20 이상만 추출한 후
		//	map() 메서드로 고객 이름 가져오기
		//	sorted() 메서드로 고객 이름 정렬
		//	forEach() 메서드로 하나씩 꺼내서 출력
		//	김석진
		//	민윤기
		//------------------------------------------
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20)
			.map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));	// <1>
		
	}

}
