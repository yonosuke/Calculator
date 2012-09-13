package sample.application.calculator;
//はabstract化するまえ　ほかAc Cも同様
//public class Bs implements FunctionLogic {
public class Bs extends AbstractLogic {

	@Override
	//public void doFunction(CalculatorActivity ca) {//ほか同　インターフェイスは必ずオーヴァーライドしないといけない
	public void doSomething(CalculatorActivity ca) {
		if(ca.strTemp.length() == 0){
			return;
		}else{
			ca.strTemp = ca.strTemp.substring(0,ca.strTemp.length()-1);
		}
		
		//ca.showNumber(ca.strTemp);
		
	}

}
