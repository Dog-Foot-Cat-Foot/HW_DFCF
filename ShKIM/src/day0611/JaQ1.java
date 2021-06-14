package day0611;

import java.io.*;

public class JaQ1 {

	// BufferedReader, BufferedWriter
	// 첫 줄 테스트케이스 개수 T
	// 다음 줄 A, B -> A+B 출력
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		String[] temp = new String[2];
		int[] sum = new int[cnt];
		
		// 숫자 입력 받아서 sum 배열에 a+b 저장
		for(int i = 0; i < cnt; i ++) {
			temp = br.readLine().split(" ");
			
			sum[i] = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
		}
		
		// bw에 쓰기
		for(int i= 0; i < cnt; i ++) {
			bw.write(sum[i] + "\n");
		}
		
		// 출력, 닫기
		bw.flush();
		bw.close();
	}

}
