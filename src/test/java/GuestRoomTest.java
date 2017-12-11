import Hotel.Room.GuestRoom;
import Hotel.Room.GuestRoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestRoomTest {

    private GuestRoom guestRoom;

    @Before
    public void before(){
        guestRoom = new GuestRoom(2,"Glasgow Room", 100.00, GuestRoomType.DOUBLE);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(2, guestRoom.getCapacity());

    }

    @Test
    public void roomHasName(){
        assertEquals("Glasgow Room", guestRoom.getName());
    }


    @Test
    public void canChangeRoomName(){
        guestRoom.setName("Anniesland Room");
        assertEquals("Anniesland Room", guestRoom.getName());
    }

    @Test
    public void roomHasRate(){
        assertEquals(100.00, guestRoom.getRate(), 0.01);
    }

    @Test
    public void canChangeRate(){
        guestRoom.setRate(110.50);
        assertEquals(110.50, guestRoom.getRate(), 0.01);
    }

    @Test
    public void roomHasType(){
        assertEquals(GuestRoomType.DOUBLE, guestRoom.getRoomType());
    }

    @Test
    public void aDoubleRoomHasACapacityOfTwo(){
        assertEquals(2, guestRoom.getCapacityFromRoomType());
    }

    @Test
    public void canChangeRoomType(){
        guestRoom.setRoomType(GuestRoomType.SINGLE);
        assertEquals(GuestRoomType.SINGLE, guestRoom.getRoomType());
    }






}
