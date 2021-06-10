public class Constructors {
	public Constructors() {
		System.out.println("Default constructor ran.");
	}
	public Constructors(int value) {
		System.out.println(value);
	}
	public static void main(String[] args) {
		//create instances here
		Constructors c = new Constructors(5839);
		//^^ can run like this
		
		//use the no-arg constructor
//		Constructors cNoArg = new Constructors();
		/*							^^^^^^^^^
		 Typically the compiler creates a no-arg 
		 constructor, however, if you specify one 
		 (as we defined one with a single int parameter), 
		 then the compiler will not add the default no-arg 
		 constructor.		
		 */
		//added a no-arg constructor up top
		Constructors cNoArg = new Constructors();
	}
}
