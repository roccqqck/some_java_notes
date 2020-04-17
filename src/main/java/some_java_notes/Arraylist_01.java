package some_java_notes;

import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Arraylist_01 {

	public static void main(String[] args) {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Arraylist_01");
		//

		ArrayList list1 = new ArrayList(); // 不定義是哪種object的Arraylist 類似python list
		                                   // 跟linkedlist很像 資料結構比較像array

		list1.add("Item1");
		list1.add("Item2");
		list1.add(2, "Item3"); // 此條語句將會把“Item3”字符串增加到list的第3個位置。
		list1.add(new String("Item4")); // 放一個String才是正規寫法
		list1.add(5);
		list1.add(new Integer(6)); // 放一個Integer
		list1.add(new Float(7.00)); // 放一個Float
		list1.add(8.00);

		System.out.println(list1);
		logger.error(list1);

		// 移除第0個位置上的元素
		list1.remove(0);

		// 移除第一次找到的 "Item3"元素
		list1.remove("Item3");
		logger.error(list1);
		logger.error(list1.get(0));

		// for i in loop:
		// list.get(i)
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Index: " + i + " - Item: " + list1.get(i));
		}
		
		logger.error(list1.iterator());

		ArrayList<String> lists = new ArrayList<String>(); // 純string arraylist
		ArrayList<Float> listf = new ArrayList<Float>(); // 純float arraylist

		lists.add(new String("s1")); // 只能string
		listf.add(new Float(2.2)); // 只能float

		logger.error(lists);
		logger.error(listf);
		
		
		LinkedList list2 = new LinkedList(); // 跟Arraylist很像 但是資料結構是linkedlist
		list2.add("Item1");
		list2.add("Item2");
		list2.add(2, "Item3"); // 此條語句將會把“Item3”字符串增加到list的第3個位置。
		list2.add(new String("Item4")); // 放一個String才是正規寫法
		list2.add(5);
		list2.add(new Integer(6)); // 放一個Integer
		list2.add(new Float(7.00)); // 放一個Float
		list2.add(8.00);

		System.out.println(list2);
		logger.error(list2);

		// 移除第0個位置上的元素
		list2.remove(0);

		// 移除第一次找到的 "Item3"元素
		list2.remove("Item3");
		logger.error(list2);
		logger.error(list2.get(0));

	}

}
