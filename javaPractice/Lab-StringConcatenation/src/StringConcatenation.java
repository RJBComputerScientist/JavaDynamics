
public class StringConcatenation {
	public static void main(String[] args) {
		String beginning = "Hello";
		String end = " World";
		String combo = beginning+end;
		System.out.println(combo);
		long L = 203L;
		System.out.println("The Value of l: "+L);
		boolean b = true;
		System.out.println(b+" is true");
		int x = 2;
		int y = 3;
		System.out.println("The values of x and y is " + x + y);
		//									`			^^^^^
		//^^ Not adding them together. it is concating them together
		System.out.println("The values of x and y is " + (x + y));
		//		`										^^^^^
		//^^ This is adding them in a concating line
		System.out.println(x + y + " is the sum of x and y");
	}
}
