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
		System.out.println("주사위 게임을 시작합니다.");
		DiceGame DG = new DiceGame();
		int userValue = DG.makeDiceNumber();
		int comValue = DG.makeDiceNumber();
		System.out.println("USER :" + userValue);
		System.out.println("COM :" + comValue);
		if(userValue > comValue){
		
		}
	}


}
