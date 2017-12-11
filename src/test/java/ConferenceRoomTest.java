import Hotel.Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(50, "Blue Room", 500.00);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void canChangeCapacity(){
        conferenceRoom.setCapacity(60);
        assertEquals(60, conferenceRoom.getCapacity());
    }

    @Test
    public void roomHasRate(){
        assertEquals(500.01, conferenceRoom.getRate(), 0.01);
    }

    @Test
    public void canChangeRate(){
        conferenceRoom.setRate(510.50);
        assertEquals(510.51, conferenceRoom.getRate(), 0.01);
    }

    @Test
    public void roomHasName(){
        assertEquals("Blue Room", conferenceRoom.getName());
    }

    @Test
    public void canChangeRoomName(){
        conferenceRoom.setName("The Blue Sky Suite");
        assertEquals("The Blue Sky Suite", conferenceRoom.getName());
    }

    @Test
    public void roomStartsWithNoAV(){
        assertEquals(0, conferenceRoom.howMuchAV());
    }

    @Test
    public void canAddAVToRoom(){
        conferenceRoom.addTechToRoom("Sound system");
        conferenceRoom.addTechToRoom("HD TV");
        assertEquals(2, conferenceRoom.howMuchAV());
    }

    @Test
    public void canDeleteAVFromRoom(){
        conferenceRoom.addTechToRoom("Sound system");
        conferenceRoom.addTechToRoom("HD TV");
        conferenceRoom.deleteTechFromRoom("HD TV");
        assertEquals(1, conferenceRoom.howMuchAV());
//        assertEquals("Sound System", conferenceRoom.getSetupAV());
    }

    @Test
    public void canCheckIfRoomHasSpecificTech(){
        conferenceRoom.addTechToRoom("HD TV");
        assertEquals(true, conferenceRoom.doesRoomContainSpecifiedTech("HD TV"));
    }

    @Test
    public void canCheckIfRoomDoesNotHaveSpecificTech(){
        conferenceRoom.addTechToRoom("HD TV");
        assertEquals(false, conferenceRoom.doesRoomContainSpecifiedTech("Sound System"));
    }


}
