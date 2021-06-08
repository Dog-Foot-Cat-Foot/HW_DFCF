package DC20210608;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class LH2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1부터 500,000까지의 숫자를 입력하세요.");
		int n = Integer.parseInt(br.readLine()); // 숫자 입력
		
		if(n<1||n>500000) {
			System.out.println("범위를 벗어났습니다.");
		}else {
		ArrayList<Integer> cards = new ArrayList<>(); // 카드들을 담을 큐 ArrayList 생성 

		//ArrayList에 숫자 넣기
		for(int i = 1; i<=n; i++) {
			cards.add(i);
		}
		
		//마지막 남는 카드 찾기
		while (cards.size() > 1) {
			cards.remove(0); // 첫번째 카드 삭제 
			cards.add(cards.get(0)); // 삭제 후 처음 오는 카드 제일 뒤에 추가 
			cards.remove(0); // 해당 카드 삭제 
		}
		
		System.out.println(cards.get(0));
	
		}
	}
}
