package day0528;

import java.util.Scanner;

public class ShQ1 {

	public static void main(String[] args) {
		// 1번은 개, 2번은 고양이, 3번은 병아리로 정하고
		// 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램 작성
		// 해당 번호가 없으면 "I don't know"라고 출력
		// 개 - dog, 고양이 - cat, 병아리 - chick

		String[] animalArray = { "dog", "cat", "chick" };

		System.out.println("숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt() - 1;

		if (num < animalArray.length && num > -1) {
			System.out.println(animalArray[num]);
		} else {
			System.out.println("I don't know");
		}

	}

}
