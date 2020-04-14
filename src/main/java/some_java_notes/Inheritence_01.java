package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Father {

	// call log4j to replace print
	Logger logger = LogManager.getLogger("inheritence_01");
	//

	public int money = 100;

	public void getMoney() {
		logger.error("我有:" + money);
	}
}

class Son extends Father {

}

public class Inheritence_01 {

	public static void main(String[] args) {

		// call log4j to replace print
		Logger logger = LogManager.getLogger("inheritence_01");
		//

		Son son = new Son();
		son.getMoney();
		logger.error("son.money=" + son.money);
	}
}