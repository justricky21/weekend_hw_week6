package Hotel.RoomType;


import Hotel.AbstractAndEnums.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom room404;

    @Before
    public void before(){
        room404 = new Bedroom(BedroomType.SILVER);
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(2, room404.getCapacity());
    }
    @Test
    public void bedroomHasType(){
        assertEquals("Silver", room404.getReadableType());
    }
    @Test
    public void bedroomHasRate(){
        assertEquals(50, room404.getRate());
    }
}
