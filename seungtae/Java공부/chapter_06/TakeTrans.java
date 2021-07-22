package chapter_06;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student han = new Student("한승태",5000);  // 학생 2명 생성 
		Student han1 = new Student("한승혁",9000);
		Student han2 = new Student("한아름",10000);

		Bus bus10 = new Bus(100); // 노선번호가 10번인 버스 생성 
		han.takeBus(bus10); // 한승태가 10번 버스를 탐 
		han.showInfo();		// 한승태의 정보 출력 
		bus10.showInfo();   // 버스 정보 출력
		
		Subway subwayGreen = new Subway("김포골드라인");
		han1.takeSubway(subwayGreen);
		han1.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi = new Taxi(4885);
		han2.takeTaxi(taxi);
		han2.showInfo();
		taxi.showInfo();
		
	}

}
