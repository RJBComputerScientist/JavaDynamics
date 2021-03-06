
public class SwitchStatement {
	public static void main(String[] args) {
		int x = 5;
		
		switch(x) {
			case 10: System.out.println("case 10 ran");
			default: System.out.println("The Default case ran");
		}
		
		switch(x) { //other cases will execute.
		default: System.out.println("The Default case ran");
		case 10: System.out.println("case 10 ran");
	}
		/* ^^^
		 switch statements support fall-through logic which means 
		 that whatever case is met first, all other cases below it 
		 will execute. In this scenario, case 10 was after the 
		 default case. The default case was the first to match the 
		 condition and thus both cases executed.
		 */
		
		 switch(x) {
         case 6: System.out.println("case 6 ran");
         default: System.out.println("The default case ran");
         case 7: System.out.println("case 7 ran");
         case 10: System.out.println("case 10 ran");
     }
		 
		 switch(x) {
		 case 6: 
			 System.out.println("case 6 ran");
			 break;
		default: System.out.println("The default case ran");
			break;
		case 7:
			System.out.println("case 7 ran");
			break;
		case 10: 
			System.out.println("case 10 ran");
		}
		 //same exact code with curly braces
	}
	
}
