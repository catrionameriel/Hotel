import Hotel.Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(30);
    }

    @Test
    public void roomHasName(){
        assertEquals(30, diningRoom.getCapacity());
    }


}
