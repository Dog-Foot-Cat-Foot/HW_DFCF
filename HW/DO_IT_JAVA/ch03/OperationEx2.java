package com.heewon.ch03;


public class OperationEx2 {
	
	 

	public static void main(String[] args) {
	
		// 증가 감소연산자는 앞뒤 관계에 유의할 것. 
		
		int gameScore = 150; // 게임획득 점수
		
		int lastScore1 = ++gameScore; // 게임스코어에 1만큼 더한 값을 lastScore1에 대입함. 더하고 나서 대입.
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore;  // 게임스코어에 1만큼 뺀값을 lastScore1 에 대입함. 빼고나서 대입 
		System.out.println(lastScore2); //150 
		
		int myAge = 27;
		boolean value = (myAge > 25);
		System.out.println(value);
		
		
		
		// 강의 중 필기
		lastScore1 = gameScore++;
		System.out.println(gameScore + "," + lastScore1);
		
		lastScore2 = gameScore--;
		System.out.println(gameScore + "," + lastScore2);
		
		
	}
}
