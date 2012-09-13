package sample.application.calculator;

//public class Ac implements FunctionLogic {
public class Ac extends AbstractLogic {
	@Override
	public void doSomething(CalculatorActivity ca) {//ほか同　インターフェイスは必ずオーヴァーライドしないといけない doFunctionを書き換えた
		ca.strTemp = "";
		ca.strResult = "0";
		ca.operator = 0;
		
		//ca.showNumber(ca.strTemp);
		
	}
	

}
