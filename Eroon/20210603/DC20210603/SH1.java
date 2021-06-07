package DC20210603;

import java.util.Arrays;
import java.util.Scanner;

public class SH1 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] result = solution(array, commands);
		for(int r:result) {
			System.out.println(r+" ");
		}
	}
	
	public static int[] solution(int[] array, int[][] commands) {
	    int[] answer = new int[commands.length]; // 결과 값이 담기는 배열 
	    for(int i = 0; i<commands.length; i++) {
	    	int len = commands[i][1]-commands[i][0]+1; // 배열을 잘랐을때 길이
	    	int[] arrayCopy = new int[len]; // 정렬해서 저장할 배열을 생성 
	    	
	    	//배열 자르기 
	    	//(원본, 어느 부분부터 읽을지, 복사할 소스, 복사본에서 자료를 받을 때 어느부분부터 쓸 지,원본에서 복사본으로 읽어올 데이터 길이)
	    	System.arraycopy(array,commands[i][0]-1, arrayCopy, 0, len);
	    	
	    	int temp = 0;// 버블 정렬할 때 사용할 변수 선언
	    	
	    	//배열 오름차순 정렬하기
	    	/*
	    	for(int j = 0; j<len; j++) {
	    		for(int k = 0;k<len-j-1; k++) {
	    			if(arrayCopy[k]>arrayCopy[k+1]) {
	    				temp= arrayCopy[k];
	    				arrayCopy[k]=arrayCopy[k+1];
	    				arrayCopy[k+1]=temp;
	    			}
	    		}
	    	}
	    	*/
	    	//오름차순 버블정렬 매소드 
	    	Arrays.sort(arrayCopy);
	    	
	    	answer[i] = arrayCopy[commands[i][2]-1];
	    }
	    
	    
	    return answer;
	}
}



