package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Student {
	String firstName;
	String lastName;

	public Student(String firstNam, String lastNam) {
		this.firstName = firstNam;
		this.lastName = lastNam;
	}

	public void printFullName() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("method_01");
		//
		logger.error(this.firstName + " " + this.lastName);
	}
}

public class Method_01 {
	public static void main(String[] args) {

		// call log4j to replace print
		Logger logger = LogManager.getLogger("method_01");
		//

		Student s1 = new Student("barry", "pan");
		Student s2 = new Student("po jui", "pan");
		logger.error(s1.firstName + " " + s1.lastName);
		logger.error(s1);
		s1.printFullName();
		// 我我我我我我我我我我我我我我我
		// a a a a a a a a a a a a a a a 

		logger.error(s2.firstName + " " + s2.lastName);
		s2.printFullName();

		Student[] students = new Student[] { new Student("Morgan", "Freeman"), new Student("Brad", "Pitt"),
				new Student("Kevin", "Spacey"), };
		for (Student s : students) {
			s.printFullName();
		}

		// the same for loop
		for (int i = 0; i < students.length; i++) {
			Student s = students[i];
			s.printFullName();
		}
		
	}
}
