package Hotel;
import Hotel.Guest.Guest;
import Hotel.Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Room bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void before(){
       hotel = new Hotel("Polwarth Paradise");
       bedroom = new Room(2);
        guest1 = new Guest("Sam Smith");
        guest2 = new Guest("Jemima Puddleduck");
        guest3 = new Guest("Winston Churchill");
    }

    @Test
    public void hotelHasName(){
        assertEquals("Polwarth Paradise", hotel.getName());
    }

    @Test
    public void hotelStartsWithNoRooms(){
        assertEquals(0, hotel.countRooms());
    }

    @Test
    public void canAddRoom(){
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.countRooms());
    }

    @Test
    public void canChangeHotelName(){
        hotel.setName("Polwarth Party");
        assertEquals("Polwarth Party", hotel.getName());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest1, bedroom);
        assertEquals(1, bedroom.countGuests());
        assertEquals(true, guest1.getCheckedInStatus());
    }

    @Test
    public void cannotCheckInTooManyGuests(){
        hotel.checkInGuest(guest1, bedroom);
        hotel.checkInGuest(guest2, bedroom);
        hotel.checkInGuest(guest3, bedroom);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void canGetAllRooms(){
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.getAllAvailableRooms());
    }


}
