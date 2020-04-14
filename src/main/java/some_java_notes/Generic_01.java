package some_java_notes;

class YourClass<Type1, Type2> {
	public Type1 bob1;
	public Type2 bob2;

	public void Abc(Type1 a, Type2 b) {
		this.bob1 = a;
		this.bob2 = b;
	}

	public Type1 getBob1() {
		return (this.bob1);
	}

	public Type2 getBob2() {
		return (this.bob2);
	}
}

public class Generic_01 {

	public static void main(String[] args) {
		YourClass<String, Integer> leBobs = new YourClass<String, Integer>();
		// in this case, <> is the same as putting <String, Integer>
        
		
        leBobs.Abc("str1", 2);
		String a = leBobs.getBob1();
		int b = leBobs.getBob2();
		System.out.println("bob1 is '" + a + "', and bob2 is '" + b + "'.");
	}

}
