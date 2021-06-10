
public class VariableDeclaration {
	public static void main(String[] args) {
		boolean onFalse = false;
		boolean onTrue = true;
		System.out.println(onFalse);
		System.out.println(onTrue);
		
		short s = 16;
		System.out.println(s);
		
		int i = -32;
		System.out.println(i);
		
//		float f = 3839.34839; 
		//^^The complier is expecting a double data type
/* So --> */ float f = 3839.34839f; //<-- has to be 'f' | 'F'
		System.out.println(f);
		
		long l = 4294967296l; //<-- has to 'l' | 'L'
		System.out.println(l);
		
//		char c = "a"; //no "" do ''
		char c = 'a'; //no "" do ''
		System.out.println(c);
	}
}
