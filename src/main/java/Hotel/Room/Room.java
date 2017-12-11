package Hotel.Room;

import Hotel.Guest.Guest;

import java.util.ArrayList;

public class Room{

    int capacity;
    ArrayList<Guest> guests;
    boolean availabilityStatus;

    public Room(int inputCapacity){
        this.capacity = inputCapacity;
        this.guests = new ArrayList<>();
        this.availabilityStatus = true;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int countGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.countGuests() < this.getCapacity()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guestToRemove) {
        this.guests.remove(guestToRemove);
    }

    public boolean getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public void setAvailabilityStatus(boolean newAvailabilityStatus) {
        this.availabilityStatus = newAvailabilityStatus;
    }

    public void setRoomToFull(){
        if(this.countGuests() == this.getCapacity()){
            setAvailabilityStatus(false);
        }
    }

}
