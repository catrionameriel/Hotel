package Hotel;

import Hotel.Guest.Guest;
import Hotel.Room.Room;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;

    public Hotel (String inputName){
        this.name = inputName;
        this.rooms = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }


    public int countRooms(){
        return rooms.size();

    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void setName(String name){
        this.name = name;
    }

    public void checkInGuest(Guest guest, Room room){
        room.addGuest(guest);
        guest.setCheckedInStatus(true);
        room.setRoomToFull();
    }

    public Room getAllAvailableRooms() {
        for(Room room : this.rooms) {
            if(room.getAvailabilityStatus()) {
                return room;
            }
        }
    }
}
