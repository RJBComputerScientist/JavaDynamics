package game;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void printRoom(Player ThePlayer) {
		Player player = new Player();
//		player.getCurrentRoom();
		
	}
	
	public static String[] collectInput() {
		String UserInput = scan.nextLine();
//		String[] UserInput;
//		UserInput = scan.nextLine();
		String[] words = UserInput.split(" ");
		return words;
	}
	
	public static void parse(String[] input, Player player) {
//		String action = input[0].toUpperCase().intern();
//		String option = null;
//		
//		if(input.length > 1) {
//			option = input[1].toUpperCase().intern();
//		}
//		if(action == "ENTER" | action == "PROCEED") {
//			System.out.println("You Decided To Move: "+option);
////			Room move = player.getCurrentRoom().getExit(option);
//			player.setCurrentRoom(move);
////			player.getRoom();
//			player.setExits(move);
//		} else if(action.equalsIgnoreCase("INTERACT")) {
//			
//		}
	}
}
