import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Scout Myall");
    }

    @Test
    public void guestHasName(){
      assertEquals("Scout Myall", guest1.getName());
    }

    @Test
    public void canChangeGuestName(){
        guest1.setName("Scout Taylor");
            assertEquals("Scout Taylor", guest1.getName());
    }

    @Test
    public void isGuestCheckedIn(){
        assertEquals(false, guest1.getCheckedInStatus());
    }

    @Test
    public void canChangeCheckedInStatus(){
        guest1.setCheckedInStatus(true);
        assertEquals(true, guest1.getCheckedInStatus());
    }

}
