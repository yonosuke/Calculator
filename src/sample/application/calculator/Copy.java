package sample.application.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.ClipboardManager;
import android.widget.TextView;

@SuppressLint("NewApi")
public class Copy implements FunctionLogic { //ほか同　インターフェイスは必ずオーヴァーライドしないといけない

	@SuppressWarnings("deprecation")
	@Override
	public void doFunction(CalculatorActivity ca) {
		ClipboardManager cm = (ClipboardManager) ca.getSystemService(Activity.CLIPBOARD_SERVICE);
		cm.setText(((TextView)ca.findViewById(R.id.displayPanel)).getText());
	}
	//Copyには（元のコードに）returnがあるのでbreak代わりのca.showNumber(ca.strTemp);はいらない
}
