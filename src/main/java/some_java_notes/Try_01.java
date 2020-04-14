package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Try_01 {

	public static void main(String[] args) {

		// call log4j to replace print
		Logger logger = LogManager.getLogger("Try_01");
		//

		int[] arr = new int[10];

		try {

			System.out.println(arr[9001]);

		} catch (ArrayIndexOutOfBoundsException ex) {

			logger.error("try catch error code detected");
		}

	}

}
