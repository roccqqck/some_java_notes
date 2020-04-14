package some_java_notes;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Generic_02 {

	public static void main(String[] args) {
		
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Generic_02");
		//
		
		// without Generic
		List list1 = new ArrayList();
		list1.add("hello1");
		list1.add("hello2");
		String s1 = (String) list1.get(0);
		
		logger.error(list1);
		logger.error(s1);
		
		
		// use Generic -> String
		List<String> list2 = new ArrayList<String>();
		list2.add("hello1");
		list2.add("hello2");
		String s2 = list2.get(0);   // no cast
		
		logger.error(list2);
		logger.error(s2);
		
		// use Generic -> int
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(999);
		list3.add(699);
		int s3 = list3.get(0);   // no cast
		
		logger.error(list3);
		logger.error(s3);

	}

}
