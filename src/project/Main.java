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
		System.out.println("커퓨터의 주사위 숫자 : "+comValue);
		
		
		//계산기 만들기
		Scanner scanner= new Scanner(System.in);
		System.out.println("어떤 계산을 하실건가요?");
		String oper = scanner.nextLine();
		System.out.println("숫자 두개를 입력해주세요.");
		double input1 = scanner.nextDouble();
		double input2 = scanner.nextDouble();
		
		double result = SimpleCalculator.calc(oper, input1, input2);
		
		//결과 출력
		System.out.println(result);
	}


}
