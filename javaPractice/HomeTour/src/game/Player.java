package game;
import fixtures.Room;

public class Player {
	private Room CurrentRoom;
	
	public Room getCurrentRoom() {
		return this.CurrentRoom;
		
		
	}
	
	public void setCurrentRoom(Room CurrentRoom) {
		this.CurrentRoom = CurrentRoom;
		
	}
	
	
	public void north() {
		System.out.println("The player has moved up");
	}
	public void south() {
		System.out.println("The player has moved down");
	}
	public void east() {
		System.out.println("The player has moved right");
	}
	public void west() {
		System.out.println("The player has moved left");
	}
}
