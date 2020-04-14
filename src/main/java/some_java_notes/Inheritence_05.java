package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class SimpleArray {
	protected int[] array;

	public SimpleArray(int i) {
		array = new int[i];
	}

	public void setElement(int i, int data) {
		array[i] = data;
	}

	public int getElement(int i) {
		return array[i];
	}

}

class SafeArray extends SimpleArray {

	public SafeArray(int i) {
		super(i);
	}

	// override 重新定義setElement()
	public void setElement(int i, int data) {
		if (i < array.length) {
			super.setElement(i, data);
		}
	}

}

public class Inheritence_05 {

	public static void main(String[] args) {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("inheritence_05");
		//

		SafeArray array1 = new SafeArray(10);
		array1.setElement(1, 9);

		logger.error(array1.getElement(1));

	}

}
