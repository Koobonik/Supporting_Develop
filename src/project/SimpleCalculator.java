package project;
import java.util.Scanner;
public class SimpleCalculator{
	static void SimpleCalculator_logic(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("어떤 계산을 하실건가요?");
		String oper = scanner.nextLine();
		System.out.println("숫자 두개를 입력해주세요.");
		double input1 = scanner.nextDouble();
		double input2 = scanner.nextDouble();
		double result = SimpleCalculator.calc(oper, input1, input2);
		//결과출력
		System.out.println(result);
	}
	
	
	static double calc(String oper, double input1, double input2){
		double result = 0;
		switch(oper){
			case "+":
				result = SimpleCalculator.plus(input1, input2);//double 형 데이터가 들어가므로 변수도 double 형 이어야 함
			break;
				case "-":
				result = SimpleCalculator.minus(input1, input2);
				break;
				case "x":
				result = SimpleCalculator.multi(input1, input2);
				break;
				case "/":
				result = SimpleCalculator.div(input1, input2);
				break;
			default:
				System.out.println("연산자를 올바르게 선택하세요..");
		}
		return result;
	}
	
	static double plus(double d1, Double d2){
		return d1+d2;
	}
	static double minus(double d1, Double d2){
		return d1-d2;
	}
	static double multi(double d1, Double d2){
		return d1*d2;
	}
	static double div(double d1, Double d2){
		return d1/d2;
	}
	
}