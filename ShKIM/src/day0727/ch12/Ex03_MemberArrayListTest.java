package day0727.ch12;

public class Ex03_MemberArrayListTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> MemberArrayList형 memberArrayList 변수 선언, MemberArrayList 객체 생성하여 메위주 대입
		// <2> Member형 memberKim 변수 선언, Member 인스턴스 생성 후 메위주 대입
		// <3> Member형 memberPark 변수 선언, Member 인스턴스 생성 후 메위주 대입
		// <4> Member형 memberMin 변수 선언, Member 인스턴스 생성 후 메위주 대입
		// <5> Member형 memberHong 변수 선언, Member 인스턴스 생성 후 메위주 대입
		//------------------------------------------
		MemberArrayList memberArrayList = new MemberArrayList();	// <1>
		
		Member memberKim = new Member(1001, "김석진");				// <2>
		Member memberPark = new Member(1002, "박지민");				// <3>
		Member memberMin = new Member(1003, "민윤기");				// <4>
		Member memberHong = new Member(1004, "홍길동");				// <5>
		
		//------------------------------------------
		// <1> memberArrayList로 addMember() 메서드 호출하여 memberKim 추가
		// <2> memberArrayList로 addMember() 메서드 호출하여 memberPark 추가
		// <3> memberArrayList로 addMember() 메서드 호출하여 memberMin 추가
		// <4> memberArrayList로 addMember() 메서드 호출하여 memberHong 추가
		// <5> memberArrayList로 showAllMember() 메서드 호출하여 전체 데이터 출력
		// <6> memberArrayList로 removeMember() 메서드 호출하여 memberHong의 회원 아이디를 넘겨주어 삭제
		// <7> memberArrayList로 showAllMember() 메서드 호출하여 전체 데이터 출력
		//	홍길동 회원은 삭제되어 출력됨
		//------------------------------------------
		memberArrayList.addMember(memberKim);		// <1>
		memberArrayList.addMember(memberPark);		// <2>
		memberArrayList.addMember(memberMin);		// <3>
		memberArrayList.addMember(memberHong);		// <4>
		
		memberArrayList.showAllMember();			// <5>
		
		memberArrayList.removeMember(memberHong.getMemberId());		// <6>
		memberArrayList.showAllMember();							// <7>
		
		
		/* ==========================================
		 * ArrayList, Vector 클래스
		 * 배열을 구현한 클래스로, 가장 큰 차이는 동기화 지원 여부이다.
		 * 멀티스레드 환경이 아닌 경우에는 ArrayList를 사용하도록 권장한다
		 * 동기화를 구현하기 위해서는 동시에 작업이 이루어지는 자원에 대해 잠금(lock)을 수행하기 떄문이다.
		 * 그렇기에 Vector은 ArrayList보다 수행 속도가 느리다.
		 * 
		 * 동기화(synchronization)
		 * 두 개 이상의 스레드가 동시에 Vector를 사용할 때 오류가 나지 않도록 실행 순서를 보장하는 것이다
		 * 
		 * 스레드
		 * 작업 단위로 프로그램이 메모리에서 수행되려면 스레드 작업이 생성되어야 한다.
		 * 하나의 스레드만 수행되면 단일 스레드(single thread)라 하고,
		 * 두 개 이상의 스레드가 동시에 실행되는 경우를 멀티 스레드(multi-thread)라 한다.
		 * 두 개 이상의 스레드가 동시에 실행되면 같은 메모리 공간(리소스)에 접근하기 때문에
		 * 변수 값이나 메모리 상태에 오류가 생길 수 있다.
		 * 메모리에 동시에 접근하지 못하도록 순서를 맞추는 것이 동기화이다.
		 * ==========================================
		 */

	}

}
