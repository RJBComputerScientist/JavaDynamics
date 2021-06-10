
public class Example {
	public static void main(String[] args) {
		//initial values
		int i = 100;
		//cast to short
		short s =(short)i;
		System.out.println(s);
		//cast to double
		double d = (double)i;
		System.out.println(d);
		//cast to byte
		byte b = (byte)i;
		System.out.println(b);
		
		/*
		 A byte follows two’s complement numbering system, thus the 
		 leading 1 indicates a negative number. To find out what 
		 number this is we must find the two’s complement by 
		 inverting the bits and adding 1 to the number.
		 */
	}
}
