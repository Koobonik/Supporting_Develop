package project;
import java.util.Scanner;//외부클래스 : 스캐너 호출

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello goorm!");
		
		
		//주사위 게임 만들기
		DiceGame.DiceGame_logic();
		
		//계산기 만들기
		SimpleCalculator.SimpleCalculator_logic();
		
		//배열 문제 숫자 10개 선언 및 임의의 수 넣기 + 그중 제일 작은수 찾기
		Ten_Array.randomNumber();
		
	}


}
