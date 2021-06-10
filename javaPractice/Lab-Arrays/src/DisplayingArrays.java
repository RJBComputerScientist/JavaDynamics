
public class DisplayingArrays {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		System.out.println(intArray);
		//lines 4-5 is the location in memory of the array
		intArray[0] = -5123;
		intArray[2] = 32;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[3]);
		//^^ this logically is outside of the array bounds
		//^^^ could throw a exception here
		
	}
}
