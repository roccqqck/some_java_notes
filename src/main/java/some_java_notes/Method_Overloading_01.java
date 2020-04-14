package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Method_Overloading_01 {
	
	public static void Elephant(int a, int b) {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Const_01");
		//
		logger.error("Elephant(1, 2) = " + (a + b));
	}
	
	public static void Elephant(int a) {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Const_01");
		//
		logger.error("Elephant(2) = " + a );
	}

	public static void Elephant() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Const_01");
		//
		logger.error("Elephant() = " + 0);
	}

	public static void main(String[] args) {
		
		Elephant(1, 2);
		Elephant(2);
		Elephant();

	}

}
