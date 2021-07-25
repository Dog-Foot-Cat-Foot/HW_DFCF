package day0727.ch13;

public class StringConcatImpl implements StringConcat {
	
	//------------------------------------------
	// 추상 메서드 구현
	//------------------------------------------
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}

}
