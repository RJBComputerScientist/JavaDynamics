public class Test {
	public static void main(String[] args) {
		A.staticCount = 2494;
		A a1 = new A();
		System.out.println(a1.instanceCount);
		System.out.println(a1.staticCount);
		/*						^^^^^
		 	Currently, we're trying to access the member 
		 	from an instance of A. Instead, we should 
		 	specify the class name.
		 */
		A a2 = new A();
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		a1.instanceCount = 15;
		System.out.println("object a1 instanceCount: "+a1.instanceCount);
		System.out.println("object a2 instanceCount: "+a2.instanceCount);
		System.out.println("class A staticCount: "+A.staticCount);
	}
}
