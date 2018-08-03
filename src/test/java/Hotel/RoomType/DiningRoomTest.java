package Hotel.RoomType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom room202;

    @Before
    public void before(){
        room202 = new DiningRoom(8, 100);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(8, room202.getCapacity());
    }
}