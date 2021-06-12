package DC20210610;

// https://st-lab.tistory.com/30

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;


public class JE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("테스트 케이스의 개수를 입력하세요.");
		long T = Long.parseLong(br.readLine());
		
		StringTokenizer st; //간단하게 문자열을 토큰 단위로 나눠주는 함
		StringBuilder sb = new StringBuilder();
		
		System.out.println("두개의 정수를 입력하세요. ");
		for(int i = 0; i<T; i++) {
			// 정수 두개 입력받아서 토큰 단위로 문자열 나누기 
			st = new StringTokenizer(br.readLine(), " ");
			// 문자열을 정수로 변환한 다음 더해서 StringBuilder에 넣
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();
		
		System.out.println(sb);
	}

}
