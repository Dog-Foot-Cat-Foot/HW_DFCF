//ShKim 1번 문제
package Practical;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i<answer.length; i++) {
        	int s = commands[i][0];//시작점
        	int e = commands[i][1];//끝점
        	int n = commands[i][2];//n번째
        	int cnt = 0;
        	int[] result = new int[e-s+1];

        	for(int j = s-1; j<e; j++) {
        		result[cnt] = array[j];// 0 1 /1 2 /2 3 /3 4
        		cnt++;
        	}
        	for(int j = 0; j<result.length; j++) {
        		for(int k = j+1; k < result.length; k++) {
	        		if(result[j] > result[k]) {
	        			int temp = result[j];
	        			result[j] = result[k];
	        			result[k] = temp;
	        		}
        		}
        	}
        	answer[i] = result[n-1];
        }
        return answer;
    }
}

public class ProblemSloving {

	public static void main(String[] args) {

		int[] a = {1,5,2,6,3,7,4};
		int[][] b = {{2,5,3},{4,4,1},{1,7,3}};

		Solution.solution(a,b);
	}
}
