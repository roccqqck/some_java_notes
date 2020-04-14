package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Bird {
	private String name;

	public Bird() {
	}

	public Bird(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println("走路");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Chicken extends Bird { // 擴充Bird類別
	private String crest; // 新增私有成員，雞冠描述

	public Chicken() {
		super();
	}

	// 定義建構方法
	public Chicken(String name, String crest) {
		super(name);
		this.crest = crest;
	}

	// 新增方法
	public void setCrest(String crest) {
		this.crest = crest;
	}

	public String getCrest() {
		return crest;
	}

	public void wu() {
		System.out.println("咕咕叫…");
	}
}

public class Inheritence_03 {

	public static void main(String[] args) {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("inheritence_03");
		//

		Bird b = new Bird("louis");
		logger.error(b.getName());
		b.setName("Alice");
		logger.error(b.getName());

		Chicken c = new Chicken();
		c.wu();
		c.setName("amy"); // 直接套用父類別的method
		c.setCrest("amy_crest");

		logger.error(c.getName() + " " + c.getCrest());

		Chicken chicken1 = new Chicken("小克", "紅色小雞冠");
		Chicken chicken2 = new Chicken();

		System.out.printf("小雞1 - 名稱 %s, 雞冠是 %s。 \n", 
				chicken1.getName(), chicken1.getCrest());
		chicken1.wu();

		System.out.printf("小雞2 - 名稱 %s, 雞冠是 %s。 \n", 
				chicken2.getName(), chicken2.getCrest());
		chicken2.wu();

	}

}
