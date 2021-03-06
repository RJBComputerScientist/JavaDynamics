
public class MathematicalOperators {
	public static void main(String[] args) {
		//define variables
		int x = 5;
		int y = 3;
		int z;
		
		//simple addition
		z = x + y;
		System.out.println(z);
		//simple subtraction
		z = x - y;
		System.out.println(z);
		//simple multiplication
		z = x * y;
		System.out.println(z);
		//simple division
		z = x / y;
		System.out.println(z);
		//simple modulus
		z = x % y;
		System.out.println(z);
		//float vs. int
//		float f = 3.6f;
//		int i = 22;
//		int result = f + i;
//		System.out.println(result);
		
		/* ^^^^^^^^^^
		 This error occurs because we're trying to save the result 
		 of a float added to an int to an int variable. Recall that 
		 a float is a 32-bit floating-point number and an integer is 
		 a 32-bit integer. We'll potentially lose the precision of 
		 our data (the decimal places) if we store a floating-point 
		 number as an integer, so the compiler complains by default. 
		 */
		
		float f = 3.6f;
		int i = 22;
		int resultInt = (int)f + i;
		//			^^^^^^ adding a cast here
		/*^^ (Essentially, you're rounding the 
		result to the nearest whole number).*/
		
		//Also have to input a long cast as well
		double resultDouble = f + i;
		System.out.println(resultInt);
		System.out.println(resultDouble);
		System.out.println(resultInt + resultDouble);
		
		//^^ i can also concat ints and doubles

	}
}
