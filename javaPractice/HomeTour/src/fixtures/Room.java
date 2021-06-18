package fixtures;

public class Room extends Fixture{
	String LivingRoom;
	String BedRoom;
	String BathRoom;
	String Kitchen;
	String ArcadeRoom;
//	private Room[] exits = new Room[5];
	private Room[] exits;
	private Fixture[] items;
//	
//	public String getExits() {
////		return this.LivingRoom, this.BathRoom;
//		String[] = this.BathRoom
//	}
//
////	public void getRoom(String RoomName) {
//////		int index = 0;
//////		RoomName = RoomName
////		switch(RoomName) {
////		case "Living Room":
////			RoomName = RoomName;
////		case "
////		}
//		public Room getExit(String g) {
//		int index = 0;
//		g = g.toUpperCase();
//			switch(g) {
//			case "UP":
//				index = 0;
//				break;
//			case "DOWN":
//				index = 1;
//				break;
//			case "RIGHT":
//				index = 2;
//				break;
//			case "LEFT":
//				index = 3;
//				break;
//			case "SPOT5":
//				index = 4;
//				break;
//			}
//			return exits[index];
//		
//	}
//	
	public Room getExit(String spot) {
		if(spot.equalsIgnoreCase("move down")) {
			return this.exits[0];
		}
		if(spot.equalsIgnoreCase("move down")) {
			return this.exits[1];
		}
		if(spot.equalsIgnoreCase("move down")) {
			return this.exits[2];
		}
		if(spot.equalsIgnoreCase("move down")) {
			return this.exits[3];
		}
		if(spot.equalsIgnoreCase("move down")) {
			return this.exits[4];
		} else {
			return this.exits[0];
		}
	}
	public void setExits(String exit) {
		this.LivingRoom = exit;
	}
	
	
	public Room(String name, String shortDescription, String longDescription){
//		this(name, shortDescription, longDescription);
		super(name, shortDescription, longDescription);
	}
	
//	public Room[] getExits() {
//		return this.exits;
//	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	
}
