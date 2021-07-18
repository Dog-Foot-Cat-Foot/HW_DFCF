package day0720.ch09;

//------------------------------------------
// 여러 자바 파일에서 공유하는 상수 값 정의하기
// 자바로 프로젝트를 진행할 떄 여러 파일에서 공유해야 하는 상수 값은
// 한 파일에 모아 public static final로 선언하여 사용하면 좋다
//------------------------------------------
public class Define {
	
	public static final int MIN = 1;
	public static final int MAX = 99999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MORNING = "Good Morning!";

}
