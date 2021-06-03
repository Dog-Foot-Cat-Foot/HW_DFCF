package day0528;

import java.util.ArrayList;
import java.util.Scanner;

public class EjQ4 {

	public static void main(String[] args) {
		// 테스트 케이스의 개수 C
		// 학생의 수 n(1 <= n <= 1000, 정수)
		// n명의 점수, 0 <= 점수 <= 100, 정수
		// 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("테스트 케이스 개수 입력");
		int cnt = sc.nextInt(); // 테스트 케이스 입력
		
		int num = 0, sum = 0, grade = 0, avg = 0, stuCnt = 0;
		ArrayList<Integer> stu = new ArrayList<Integer>();
		double[] array = new double[cnt];
		
		for(int i = 0; i < cnt; i++) {
			num = sc.nextInt(); // 학생 수 입력
			sum = 0;
			avg = 0;
			stuCnt = 0;
			
			if(num < 1 || num > 1000) {
				System.out.println("1이상, 1000이하의 숫자를 입력해 주세요.");
				i--;
				continue;
			} 
			
			// 점수 입력 받기
			for(int j = 0; j < num; j++) {
				grade = sc.nextInt();
				
				if(grade < 0 && grade > 100) {
					System.out.println("0이상 100이하의 점수를 입력해 주세요.");
					j--;
					continue;
				}
				
				sum += grade; 	// 합산 계산
				stu.add(grade); // 점수 저장 
			}

			avg = sum/num; // 평균 계산

			// 배열에서 점수 하나씩 꺼내서 지우기
			for(int k = stu.size()-1; k >= 0; k--) {
				if(stu.remove(k) > avg) {
					stuCnt++;	// 평균 넘으면 +1
				}
			}
			
			// 학생들의 비율 배열에 입력
			array[i] = (stuCnt*100)/(double)num;
		}
		
		// 출력
		for(double l : array) {
			System.out.printf("%.3f%%", l);
			System.out.println();
		}
		
	}

}
