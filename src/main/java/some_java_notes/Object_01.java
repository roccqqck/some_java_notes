package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printPoint() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("method_01");
		//
		logger.error("(" + x + "," + y + ")");
	}

	Point center(Point other) {
		// 返回中心点
		// 因为我们使用的是integer, 这会得到一个约值
		return new Point((x + other.x) / 2, (y + other.y) / 2);
	}

}

public class Object_01 {

	public static void main(String[] args) {

		// call log4j to replace print
		Logger logger = LogManager.getLogger("method_01");
		//
		Point p1 = new Point();
		Point p2 = new Point(2, 3);

		logger.error(p1.x + "," + p1.y);
		logger.error(p2.x + "," + p2.y);
		p2.printPoint();

		Point p1p2average = p2.center(p1);
		logger.error(p1p2average.x + "," + p1p2average.y);
		
		

	}
}
