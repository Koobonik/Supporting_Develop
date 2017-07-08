package project;

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
		System.out.println(userValue);
		System.out.println(comValue);
		
	}


}
