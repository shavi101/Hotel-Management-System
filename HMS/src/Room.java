import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {
	 private String roomId;
	 private String roomType;
	 private String availability;
	 
	 List<Room> Rooms = new ArrayList<Room>();
	Scanner sc = new Scanner(System.in);

	public Room( String roomId, String roomType,String availability) {
		super();
	    this.roomId = roomId;
		this.roomType = roomType;
		this.availability = availability;
		
	}
	
	public void Array(){
		Rooms.add(new Room("100","A",availability));
		Rooms.add(new Room("101","B",availability));
		Rooms.add(new Room("102","A",availability));
		Rooms.add(new Room("103","B",availability));
		Room r4=new Room("104","C",availability);
		Rooms.add(r4);
	}
	public void isAvailable() {
		
		for (Room x : Rooms) {
			
			if (availability == "Empty") {
				System.out.println(x);
			}
		}
	}
	
	public void viewRooms() {
		// method used to view rooms
			for (Room x : Rooms) {
				System.out.println(x);
	            }
	      }
	public void addCustomer() {

		System.out.print("Enter Room Number");
        String roomId = sc.nextLine();
        System.out.print("Enter Customer Name");
		String custName = sc.nextLine();
		
		System.out.println("[Customer: "+custName+"][Room ID: "+roomId+"]");
		
		switch (roomId) {
		case "100":
			(Rooms.get(0)).availability=custName;
			 viewRooms();
			break;
		case "101":
			(Rooms.get(1)).availability=custName;
			viewRooms();
			break;
		case "102":
			(Rooms.get(2)).availability=custName;
			viewRooms();
			break;
		case "103":
			(Rooms.get(3)).availability=custName;
			viewRooms();
			break;
		case "104":
			(Rooms.get(4)).availability=custName;
			viewRooms();
			break;
		case "105":
			(Rooms.get(5)).availability=custName;
			viewRooms();
			break;
		case "106":
			(Rooms.get(6)).availability=custName;
			 viewRooms();
			break;
		case "107":
			(Rooms.get(7)).availability=custName;
			viewRooms();
			break;
		case "108":
			(Rooms.get(8)).availability=custName;
			viewRooms();
			break;
		case "109":
			(Rooms.get(9)).availability=custName;
			viewRooms();
			break;
		default: // error message
		}
		
	}
	
public  String getAvailability() {
		return availability;
	}
	
@Override
	
	public String toString() {
		return "Room [Room ID=" + roomId + ", Room Type=" + roomType +", Availability="+availability+"]";
	}
}
