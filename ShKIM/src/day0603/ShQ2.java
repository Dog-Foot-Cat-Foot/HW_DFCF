package day0603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShQ2 {

	public static void main(String[] args) {
		// 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있다.
		// 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호 배열 lost, 여벌의 체육복을 가져온 학생들의 번호 배열 reserve
		// 체육수업을 들을 수 있응 학생의 최댓값 리턴
		// 2 <= n <= 30
		// lost, 1 <= length <= n, 중복 x
		// reserve, 1 <= length <= n, 중복 x
		// 여벌 있는 학생이 도난 당했을 수 있음, 남은 체육복 1개니까 못 빌려줌

		int[] a = { 1, 2, 3};
		int[] b = { 2, 3, 4};

		System.out.println(solution(5, a, b));

	}
	
//	public static int solution(int n, int[] lost, int[] reserve) {
//		int result = n - lost.length;
//		int num = reserve.length;
//		int size = 0, size2 = 0;
//		
//		for(int l : lost) {
//			size = 0;
//			for(int r : reserve) {
//				if(num > 0 && l != 0 && r!= 0 && l == r) {
//					result++;
//					num--;
//					lost[size2] = 0;
//					reserve[size] = 0;
//					break;
//				} 
//				size++;
//			}
//			size2++;
//		}
//		
//		
//		
//		for(int l : lost) {
//			for(int r : reserve) {
//				if(num > 0 && r!= 0 && l != 0 && (l-1 == r || l+1 == r)) {
//					result++;
//					num--;
//					break;
//				}
//			}
//		}
//		
//		return result;
//	}

	

	public static int solution(int n, int[] lost, int[] reserve) {
		int result = n - lost.length;
		int num = reserve.length;
		int size = 0, size2 = 0;
		
		List<Integer> lostArray = new ArrayList<>();
		List<Integer> reserveArray = new ArrayList<>();
		
		Arrays.stream(lost).sorted().forEach( c -> lostArray.add(c));
		Arrays.stream(reserve).sorted().forEach( c -> reserveArray.add(c));
		
		for(int l : lostArray) {
			size = 0;
			for(int r : reserveArray) {
				if(num > 0 && l !=0 && r != 0 && l == r) {
					result++;
					num--;
					lostArray.set(size2, 0);
					reserveArray.set(size, 0);
					break;
				} 
				size++;
			}
			size2++;
		}
		
		lostArray.remove(Integer.valueOf(0));
		reserveArray.remove(Integer.valueOf(0));
		
		size2 = 0;
		
		for(int l : lostArray) {
			size = 0;
			for(int r : reserveArray) {
				if(num > 0 && l !=0 && r != 0 && (l-1 == r || l+1 == r)) {
					result++;
					num--;
					lostArray.set(size2, 0);
					reserveArray.set(size, 0);
					break;
				}
				size++;
			}
			size2++;
		}
		
		return result;
	}
	
	

//	public static int solution(int n, int[] lost, int[] reserve) {
//		// 체육복 있는 학생 수
//		int result = n - lost.length;
//
//		// 체육복 개수
//		int num = reserve.length;
//
//		// 빌려줄 수 있는 학생 수 구하기
//		for (int i = 0; i < lost.length; i++) {
//
//			// 체육복 없으면
//			if (num == 0) {
//				break;
//			}
//
//			// 중복 요소 제거
//			for (int j = 0; j < reserve.length; j++) {
//
//				if (lost[i] == reserve[j]) {
//					reserve[j] = -2;
//					result++;
//					num--;
//					break;
//				}
//
//			}
//
//			// 체육복 없으면
//			if (num == 0) {
//				break;
//			}
//
//			// 중복 요소 제거
//			for (int j = 0; j < reserve.length; j++) {
//
//				if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
//					reserve[j] = -2;
//					result++;
//					num--;
//					break;
//				}
//			} // for 끝
//
//		}
//
//		return result;
//	}

}
