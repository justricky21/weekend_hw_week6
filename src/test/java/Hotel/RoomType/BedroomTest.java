package Hotel.RoomType;


import Hotel.Abstract.BedroomType;
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
    public void bedroomHasCApacity(){
        assertEquals(2, room404.getCapacity());
    }
}
