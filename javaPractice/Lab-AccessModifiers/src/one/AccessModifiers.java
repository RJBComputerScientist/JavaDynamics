package one;
import two.ProtectedSubClass;

public class AccessModifiers {
	public static void main(String[] args) {
		//access class methods here
		Person Ryan = new Person();
		Ryan.age = 100;
		System.out.println(Ryan.age);
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
	}
}
