package day0609;

public class ShQ2 {

	public static void main(String[] args) {
		String s = "abcde";
		String s1 = "qwer";

		System.out.println(solution(s));
		System.out.println(solution(s1));
	}

	// 단어 s의 가운데 글자 반환
	// 짝수라면 두글자
	public static String solution(String s) {
		String answer = "";
		int cut = s.length() / 2;	// String 길이 구하기

		// substring(시작위치, 끝위치) : String 자르기
		if (s.length() % 2 != 0) {
			answer = s.substring(cut, cut + 1);
		} else {
			answer = s.substring(cut - 1, cut + 1);
		}
		return answer;
	}

}
