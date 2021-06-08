package DC20210608;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LH1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("온라인 저지 회원의 수를 입력하세요.");
		int n = scan.nextInt(); // 회원의 수 입력 
		
		String[][] members = new String[n][2];// 회원들의 정보를 담을 이차원 배열 생성 
		//	회원의 수 만큼 나이와 이름 입력받기
		for(int i = 0; i<n; i++) {
			members[i][0]= scan.next();
			members[i][1]= scan.next();
		}
		
		Arrays.sort(members, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]); // 오름차순
				// 내림차순 Integer.parseInt(s2[0])-Integer.parseInt(s1[0]);
			}
			
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(members[i][0]+" "+members[i][1]);
		}
	}
}
