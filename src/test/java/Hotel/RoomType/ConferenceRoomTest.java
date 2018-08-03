package Hotel.RoomType;

import Hotel.AbstractAndEnums.ConferenceRoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom room101;

    @Before
    public void before(){
        room101 = new ConferenceRoom(ConferenceRoomType.RUBY);
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(14, room101.getCapacity());
    }
    @Test
    public void bedroomHasType(){
        assertEquals("Ruby", room101.getReadableType());
    }
    @Test
    public void bedroomHasRate(){
        assertEquals(80, room101.getRate());
    }
}
