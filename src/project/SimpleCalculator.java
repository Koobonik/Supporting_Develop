package project;

public class SimpleCalculator{
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