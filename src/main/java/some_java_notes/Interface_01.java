package some_java_notes;

interface Iface {
	
	int a = 5;
	void show();
}

class Jface implements Iface {
	public void show() {
		System.out.println(a);
	}
}

public class Interface_01 {

	public static void main(String[] args) {
		Jface j = new Jface();
		j.show();

	}

}
