package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//您可以宣告這些成員為「被保護的」（protected）成員，保護的意思表示存取該成員是有條件限制的，
//當您將類別的成員宣告為受保護的成員之後，繼承的類別就可以直接使用這些成員，
//但這些成員仍然受到保護，不同套件（package）的物件不可直接呼叫使用 protected 成員

class Rectangle {
	// 受保護的member
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return width * height;
	}
}

//成員如果被宣告為 "protected"，則擴充它的子類別就可以直接使用該資料成員，
//而不用透過 "public" 方法成員來呼叫

class Cubic extends Rectangle {
	protected int z;
	protected int length;

	public Cubic() {
		super();
	}

	public Cubic(int x, int y, int z, int length, int width, int height) {
		super(x, y, width, height);
		this.z = z;
		this.length = length;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getZ() {
		return z;
	}

	public int getLength() {
		return length;
	}

	public int getVolumn() {
		// 可以直接使用父類別中的width、height成員
		return length * width * height;
	}
}

public class Inheritence_04 {

	public static void main(String[] args) {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("inheritence_04");
		//

		Rectangle p = new Rectangle(1, 2, 3, 4);
		logger.error(p.x + " " + p.y + " " + p.width + " " + p.height);
		logger.error(p.getArea());

		Cubic c = new Cubic(1, 2, 3, 4, 5, 6);
		logger.error(c.x + " " + c.y + " " + c.z + " " + c.width + " " + c.height + " " + c.length);
		logger.error(c.getArea());
		logger.error(c.getVolumn());

	}

}
