package project;
public class DiceGame{
	
	//1.이름
	//2.파라미터 --> 로직에 영향을 주는 데이터가 없으면 ()만 넣기
	//3.리턴타입 --> 기능의 호출에 대한 기대 타입 데이터
	static int makeDiceNumber(){
		int value = (int)(Math.random()*6+1);
		return value;
	}
	static void DiceGame_logic(){
		int userValue=DiceGame.makeDiceNumber();//주사위 숫자 생성
		int comValue=DiceGame.makeDiceNumber();
		System.out.println("유저의 주사위 숫자 : "+userValue);
		System.out.println("컴퓨터의 주사위 숫자 : "+comValue);
	}
	
}
