import java.util.ArrayList;


public class Hotel {

	private Reservation[] rooms;
	
	
	private ArrayList<String> waitList;
	
	
	
	public Reservation requestRoom(String guestName){
	//if there are any empty rooms (rooms with no reservation)
		for (int i = 0; i<rooms.length; i++){
		if (rooms[i] == null){
		//then create a reservation for an empty room for the specified guest
		//and return the new Reservation;
			rooms[i] = new Reservation(guestName, i);
			return rooms[i];
		}
		}
		//Otherwise, add the guest into the end of waitList and return null
		waitList.add(guestName);
		return null;
	}
	
	public Reservation cancelAndReassign(Reservation res){
		//release the room associated with parameter res, effectively canceling the reservation
		int room = res.getRoomNumber();
		//if any names are stored in waitList, remove the first name
		//and create a Reservation for this person in the room reserved by res;
		//return that newReservation
		if (!waitList.isEmpty()){
			String newGuest = waitList.get(0);
			waitList.remove(0);
			rooms[room] = new Reservation(newGuest, room);
			return rooms[room];
		}	
		//if waitlList is empty, mark the room specified by res as empty and return null
		//precondition: res is a valid reservation for some room in this hotel 
		else if (waitList.isEmpty()){
			rooms[room] = null;
		}
			return null;
	}

}
