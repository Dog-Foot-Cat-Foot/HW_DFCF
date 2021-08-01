package day0727.ch14;

public class Ex08_IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	//------------------------------------------
	// IDFormatException 예외를 setUserID() 메서드가 호출될 때 처리하도록 미룸
	// 아이디에 대한 제약 조건 구현
	//------------------------------------------
	public void setUserID(String userID) throws IDFormatException {
		//------------------------------------------
		// <1> userID 가 null 이라면
		// <2> 예외 메시지를 생성자에 넣어 예외 클래스를 생성한 후 throw문으로 직접 예외를 발생시킨다
		// <3> userID의 길이가 8 미만, 20 초과라면
		// <4> 예외 메시지를 생성자에 넣어 예외 클래스를 생성한 후 throw문으로 직접 예외를 발생시킨다
		// <5> 매개변수로 받은 userID를 userID 멤버 변수에 대입
		//------------------------------------------
		if(userID == null) {			// <1>
			throw new IDFormatException("아이디는 null일 수 없습니다.");			// <2>
		} else if(userID.length() < 8 || userID.length() > 20) {					// <3>
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");	// <4>
		}
		this.userID = userID;			// <5>
	} 

	public static void main(String[] args) {
		
		Ex08_IDFormatTest test = new Ex08_IDFormatTest();
		
		//------------------------------------------
		// 아이디 값이 null 인 경우
		// <1> 매개변수로 userID를 넘겨주며, setUserID() 메서드 호출, 
		//	userID의 데이터가 null 이므로 예외가 발생한다.
		// <2> IDFormatException 예외 처리, setUserID() 메서드는 이 예외를 미루었으므로, 
		//	이 예외는 catch 블록에서 처리된다.
		//------------------------------------------
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		//------------------------------------------
		// 아이디 값이 8자 미만인 경우
		// <1> 매개변수로 userID를 넘겨주며, setUserID() 메서드 호출,
		//	userID의 데이터가 8자 미만이므로 예외가 발생한다.
		// <2> IDFormatException 예외 처리, setUserID() 메서드는 이 예외를 미루었으므로,
		//	이 예외는 catch 블록에서 처리된다.
		//------------------------------------------
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		/* =========================================
		 * 예외 처리를 할 때는 로그를 잘 남기자
		 * 프로그램 개발할 때는 로그(log)를 남기는 것이 매우 중요하다.
		 * 오류가 발생했을 때 로그를 보고 오류가 발생하는 코드를 순서대로 따라가며 확인할 수 있고,
		 * 원인을 찾을 수 있다.
		 * 
		 * throw 예약어
		 * 사용자가 예외를 직접 발생시키기 위해 사용하는 예약어이다.
		 * =========================================
		 */

	}

}
