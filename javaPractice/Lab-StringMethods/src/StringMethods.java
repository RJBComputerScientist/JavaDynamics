public class StringMethods {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.equals(str)); //same as line 5
		System.out.println(str.equals("Hello"));
		String s = new String("Hello");
		System.out.println(str.equals(s));
		//use the length() method
		System.out.println(str.length());
		//length counts how many - 1,2,3,...
		//use the indexOf() method
		System.out.println(str.indexOf("H"));
		//indexOf counts index position - 0,1,2,...
	}
}
