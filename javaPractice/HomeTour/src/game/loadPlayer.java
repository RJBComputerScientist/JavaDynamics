package game;
import java.util.Scanner;

public class loadPlayer {
	static RoomManager load = new RoomManager(5);
	
	static boolean running = true;
	
	public static void main(String[] args) {
		load.init();
		Player player = new Player();
		System.out.println(load.getRoom(""));
		System.out.println("\nHere is how the game works" +
				 "\nYou have 5 rooms so far, updates will be added to the game later"+
				  "\nYour commands are: 'Living Room', 'Home Theater', 'Backyard', 'Bedroom' & 'Kitchen'"+
				 "");
		
//		player.setCurrentRoom(load.getRoom(0));
		player.setCurrentRoom(load.getStartingRoom());
		
		Scanner a = new Scanner();
		String spot  = null;
		
		while (spot != "z") {
			Main.printRoom(player);
			String[] input = Main.collectInput();
			Main.parse(input, player);
		}
	}
}
