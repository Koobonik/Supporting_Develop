package project;
import java.util.Scanner;//외부클래스 : 스캐너 호출

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello goorm!");
		int a=3, b=4;
		System.out.println(a+b);
		
		math hll= new math();//math 클래스 활용
		hll.math();
		
		//주사위 게임 만들기
		DiceGame DG = new DiceGame();//주사위 객체 생성
		int userValue=DG.makeDiceNumber();//주사위 숫자 생성
		int comValue=DG.makeDiceNumber();
		System.out.println("유저의 주사위 숫자 : "+userValue);
		System.out.println("컴퓨터의 주사위 숫자 : "+comValue);
		
		
		//계산기 만들기
		SimpleCalculator.SimpleCalculator_logic();
		
		//배열 문제 숫자 10개 선언 및 임의의 수 넣기 + 그중 제일 작은수 찾기
		Ten_Array.randomNumber();
		
	}


}
