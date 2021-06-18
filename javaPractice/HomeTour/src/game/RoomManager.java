package game;

import fixtures.Room;

public class RoomManager {
	private Room StartingRoom;
	private Room[] House;
	
	public RoomManager(int RoomCount) {
		super();
		House = new Room[RoomCount];
	}
	
	public void init() {
		//Making Rooms
		Room room1 = new Room(
			"Living Room",
			"Short - The first room",
			"Long - The room of living"
		);
		this.House[0] = room1;
		this.StartingRoom = room1;
		
		Room room2 = new Room(
				"Home Theater",
				"Short - The second room",
				"Long - Watch your movies"
				);
		this.House[1] = room2;
		
		Room room3 = new Room(
				"Backyard",
				"Short - The third room",
				"Long - Get some fresh air"
				);
		this.House[2] = room3;
		
		Room room4 = new Room(
				"Bedroom",
				"Short - The fourth room",
				"Long - Go to sleep"
				);
		this.House[3] = room4;
		
		Room room5 = new Room(
				"Kitchen",
				"Short - The fifth room",
				"Long - Make some food"
				);
		this.House[4] = room5;
		
	Room[] BeginningRoom = new Room[] {room1, null, room3, null, room5};
	room1.setExits(BeginningRoom);
	
	Room[] room2exits = new Room[] {null, room2, room3, room4, null};
	room2.setExits(room2exits);
	
	Room[] room3exits = new Room[] {null, room2, room3, null, null};
	room3.setExits(room3exits);
	
	Room[] room4exits = new Room[] {room1, null, room3, room4, room5};
	room3.setExits(room4exits);
	
	Room[] room5exits = new Room[] {null, room2, room3, null, null};
	room3.setExits(room5exits);
		
	}
	
	
	
	public Room getRoom(int index) { //get room by index
		//possibly this
		return House[index];
	}
	
	public Room getRoom(String RoomName) { //get room by String
		//possibly this
		Player player = new Player();
		
		for(int e = 0; e < House.length; e++) {
			String t = House[e].getName().intern();
			if(t == RoomName) {
				System.out.println(House[e].getName());
				return House[e];
			}
//			System.out.println(House[e]);
			
		}
		return null;
		
	}
	
//	public Room[] getRoom(Room[] RoomName) { //get room by String
//		//possibly this
////		return null;
//		return this.House = RoomName;
//		
//	}
	
//	public Room setRoom(int index) { //get room by id
//		//possibly this
//		return House[index];
//	}
	
	public Room getStartingRoom() {
		return this.StartingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.StartingRoom = startingRoom;
	}
	
	public Room[] getHouse() {
		return this.House;
	}
	
	public void setHouse(Room[] House) {
		this.House = House;
	}
}
