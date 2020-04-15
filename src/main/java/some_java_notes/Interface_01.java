package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface Iface {

	int a = 5;

	void show(); // not implement yet
}

class Jface implements Iface {
//  @Override // 實現接口方法
	public void show() {

		// call log4j to replace print
		Logger logger = LogManager.getLogger("Interface_01.Jface");
		//
		logger.error(a);
	}
}

interface PetRestaurant {
	public void buyFood();
}

class PetDog implements PetRestaurant {
//	@Override // 實現接口方法
	public void buyFood() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Interface_01.PetDog");
		//
		logger.error("我是狗，我要買狗糧，汪汪!!");
	}
}

// 寵物貓想要買貓糧
class PetCat implements PetRestaurant {
//	@Override // 實現接口方法
	public void buyFood() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Interface_01.PetCat");
		//
		logger.error("我是貓，我要買貓糧，喵喵!!");
	}
}

class PetPig implements PetRestaurant {
//	  @Override
	public void buyFood() {
		// call log4j to replace print
		Logger logger = LogManager.getLogger("Interface_01.PetPig");
		//
		logger.error("我是豬，我吃屎!!");
	}
}

class Clerk { // 店員 //若傳進來 PetDog 物件 dog
	public void sellFood(PetRestaurant pet) { // 店員賣食物給實踐過的寵物
		// 傳進來是Dog 因此 PetRestaurant pet = dog
		// 自動判斷是PetRestaurant的子物件
		pet.buyFood(); // 寵物買糧食
		// 答應dog的方法
	}
}

class Interface_01 {

	public static void main(String[] args) {
		Jface j = new Jface();
		j.show();

		//
		PetDog p1 = new PetDog();
		p1.buyFood();

		PetCat p2 = new PetCat();
		p2.buyFood();

		//
		Clerk C = new Clerk(); // 實例店員
		PetDog dog = new PetDog(); // 實例狗
		PetCat cat = new PetCat(); // 實例貓
		PetPig pig = new PetPig(); // 實例貓
		C.sellFood(dog); // 我是狗，我要買狗糧，汪汪!! 自動判斷是PetRestaurant的子物件
		C.sellFood(cat); // 我是貓，我要買貓糧，喵喵!!
		C.sellFood(pig);

	}

}
