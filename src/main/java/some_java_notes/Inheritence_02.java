package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Father2 {
	String my_son_Name;

	Father2(String name) {
		my_son_Name = name;
	}

	public void getName() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("inheritence_01");
		//
		logger.error("我兒子叫做:" + my_son_Name);
	}
}

class Son2 extends Father2 {
	Son2() {
		super("Andy"); // 呼叫父類別中的建構子

		// this()) 和 super( ) 必須存在於建構子的第1行，且不能同時存在。
		// this( ) 和 super( ) 也不能存在於static成員的程式中實作
	}

}

public class Inheritence_02 {

	public static void main(String[] args) {

		Son2 son2 = new Son2();
		son2.getName();

	}

}
