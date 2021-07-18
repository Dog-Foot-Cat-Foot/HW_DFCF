package day0720.ch09;

public class Ex05_UsingDefine {

	public static void main(String[] args) {
		
		//------------------------------------------
		// static으로 선언했으므로 인스턴스를 생성하지 않고 
		// 클래스 이름으로 참조 가능하다
		// <1> Good Morning!
		// <2> 최솟값은 1입니다.
		// <3> 최댓값은 99999입니다.
		// <4> 수학 과목 코드 값은 2001입니다.
		// <5> 영어 과목 코드 값은 1001입니다.
		//------------------------------------------	
		System.out.println(Define.GOOD_MORNING);					// <1>
		System.out.println("최솟값은 " + Define.MIN + "입니다.");	// <2>
		System.out.println("최댓값은 " + Define.MAX + "입니다.");	// <3>
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");	// <4>
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");	// <5>

	}

}
