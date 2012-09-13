package sample.application.calculator;

//public class C implements FunctionLogic {doFunctionを書き換えた
public class C extends AbstractLogic {
	@Override
	public void doSomething(CalculatorActivity ca) {
		ca.strTemp = "";
		
		//ca.showNumber(ca.strTemp);
	}
	

}
