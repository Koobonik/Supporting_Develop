package project;
class DiceGame{
	
	//1.이름
	//2.파라미터 --> 로직에 영향을 주는 데이터가 없으면 ()만 넣기
	//3.리턴타입 --> 기능의 호출에 대한 기대 타입 데이터
	static int makeDieceNumber(){
		int value = (int).(math.random()*6)+1;
		return value;
	}
}