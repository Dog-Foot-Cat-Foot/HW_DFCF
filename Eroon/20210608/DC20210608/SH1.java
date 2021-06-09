package DC20210608;

import java.util.TreeSet;

public class SH1 {
	// 두개 뽑아서 더하기 
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		TreeSet<Integer> result = solution(numbers);
		System.out.print(result);
	}
	public static TreeSet<Integer> solution(int array[]) {
		TreeSet<Integer> answer = new TreeSet<>(); // 더한 값 저장 TreeSet
		//TreeSet -> 중복제거 + 자동 오름차순 정
		for(int i = 0; i<array.length; i++) {
			for(int j = 1+i; j<array.length; j++) {
				answer.add(array[i]+array[j]); 
			}
		}
		return answer;
	}

}

