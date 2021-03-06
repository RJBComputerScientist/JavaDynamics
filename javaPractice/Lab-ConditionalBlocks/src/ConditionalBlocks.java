
public class ConditionalBlocks {
	public static void main(String[] args) {
		boolean b = true;
		
		if(b) {
			System.out.println("Inside the if-statement");
			int g = 7;
			System.out.println(g + " is equal to a prime number");
		}
		
		System.out.println("Outside of the if-statement");
		
		boolean y = false;
//		if(y) {
//			System.out.println(y + " is true");
//		} else {
//			System.out.println(y + " is false");
//		}
//		System.out.println(" ALSO, Outside of the if-else-statement");
		
		//Same ^^ as line 24-29 
		
		if(y == true) {
			System.out.println(y + " is true");
		} else {
			System.out.println(y + " is false");
		}
		System.out.println(" ALSO, Outside of the if-else-statement");
		
		boolean firstCondition = true;
	    boolean secondCondition = true;

	    if (firstCondition){
	      System.out.println("inside the if-statement");

	      if (secondCondition){
	        System.out.println("inside the nested if-statement");
	      }
	    }else {
	      System.out.println("inside the else-statement");
	    }

	    System.out.println(" ALSO, Outside of nested if-statement");
	    
	    boolean firstElseIfCondition = false;
	    boolean secondElseIfCondition = true;

	    if (firstElseIfCondition){
	      System.out.println("inside the if-statement");

	      if (secondElseIfCondition){
	        System.out.println("inside the nested if-statement");
	      }
	    }else if (secondElseIfCondition){
	      System.out.println(17);
	    }else {
	      System.out.println("inside the else-statement");
	    }

	    System.out.println(" ALSO, Outside of nested else if-statement");
	}
	/*when the boolean is false, i see that only the code outside
	 is executed. when the boolean is true, 
	 it executes both the inside and outside code.
	 */
}
