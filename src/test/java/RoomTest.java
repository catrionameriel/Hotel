import Hotel.Guest.Guest;
import Hotel.Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room bedroom;
    private Room diningRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        bedroom = new Room(2);
        diningRoom = new Room(20);
        guest1 = new Guest("Sam Smith");
        guest2 = new Guest("Jemima Puddleduck");
        guest3 = new Guest("Winston Churchill");
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(20, diningRoom.getCapacity());
    }

    @Test
    public void canChangeCapacity(){
        diningRoom.setCapacity(30);
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void roomStartsWithNoGuest(){
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void cannotAddGuestWhenFull(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void roomStartsAvailable(){
        assertEquals(true, bedroom.getAvailabilityStatus());
    }

    @Test
    public void canChangeRoomStatus(){
        bedroom.setAvailabilityStatus(false);
        assertEquals(false, bedroom.getAvailabilityStatus());
    }

    @Test
    public void roomCanBeSetToFull(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.setRoomToFull();
        assertEquals(false, bedroom.getAvailabilityStatus());
    }

    @Test
    public void roomCannotBeSetToFullIfNotFull(){
        bedroom.addGuest(guest1);
        bedroom.setRoomToFull();
        assertEquals(true, bedroom.getAvailabilityStatus());
    }

}
