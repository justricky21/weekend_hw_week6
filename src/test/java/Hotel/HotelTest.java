package Hotel;

import Hotel.AbstractAndEnums.BedroomType;
import Hotel.AbstractAndEnums.ConferenceRoomType;
import Hotel.RoomType.Bedroom;
import Hotel.RoomType.ConferenceRoom;
import Hotel.RoomType.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel salvador;
    Bedroom room101;
    DiningRoom room202;
    ConferenceRoom room303;

    @Before
    public void before(){
        salvador = new Hotel();
        room101 = new Bedroom(BedroomType.BRONZE);
        room202 = new DiningRoom(8);
        room303 = new ConferenceRoom(ConferenceRoomType.SAPPHIRE);
        salvador.addRoom(room101);
        salvador.addRoom(room202);
        salvador.addRoom(room303);
    }

    @Test
    public void hotelHasRooms(){
        assertEquals(3, salvador.getRooms().size());
    }

}
