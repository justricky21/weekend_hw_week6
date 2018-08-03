package Hotel;

import Guest.Guest;
import Hotel.AbstractAndEnums.BedroomType;
import Hotel.AbstractAndEnums.ConferenceRoomType;
import Hotel.RoomType.Bedroom;
import Hotel.RoomType.ConferenceRoom;
import Hotel.RoomType.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom room101;
    Bedroom room102;
    DiningRoom room202;
    ConferenceRoom room303;
    Guest guest;
    ConferenceRoom room304;
    ConferenceRoom room302;
    Bedroom room103;
    Bedroom room104;

    @Before
    public void before() {
        hotel = new Hotel();
        room101 = new Bedroom(BedroomType.BRONZE, 101);
        room102 = new Bedroom(BedroomType.SILVER, 102);
        room104 = new Bedroom(BedroomType.SILVER, 104);
        room103 = new Bedroom(BedroomType.GOLD, 103);
        room202 = new DiningRoom(32, 202);
        room302 = new ConferenceRoom(ConferenceRoomType.TOPAZ, 302);
        room303 = new ConferenceRoom(ConferenceRoomType.SAPPHIRE, 303);
        room304 = new ConferenceRoom(ConferenceRoomType.RUBY, 304);
        hotel.addBedroom(room101);
        hotel.addBedroom(room102);
        hotel.addBedroom(room103);
        hotel.addBedroom(room104);
        hotel.addDiningRoom(room202);
        hotel.addConferenceRoom(room303);
        hotel.addConferenceRoom(room302);
        hotel.addConferenceRoom(room304);
        guest = new Guest("Jerry");
    }

    @Test
    public void hotelHasRooms() {
        assertEquals(4, hotel.getBedrooms().size());
        assertEquals(3, hotel.getConferenceRooms().size());
        assertEquals(1, hotel.getDiningRooms().size());
    }

    @Test
    public void hotelCanSignInGuestToSingleBedroom() {
        hotel.signInToBronzeBedroom(guest);
        assertEquals(1, room101.getGuests().size());
    }

    @Test
    public void hotelCannotSignInGuestToFullSingleBedroom() {
        hotel.signInToBronzeBedroom(guest);
        hotel.signInToBronzeBedroom(guest);
        assertEquals(1, room101.getGuests().size());
    }

    @Test
    public void hotelCanSignInGuestToDoubleBedroom() {
        hotel.signInToSilverBedroom(guest);
        hotel.signInToSilverBedroom(guest);
        assertEquals(2, room102.getGuests().size());
    }

    @Test
    public void hotelCannotSignInGuestToFullDoubleBedroom() {
        hotel.signInToSilverBedroom(guest);
        hotel.signInToSilverBedroom(guest);
        hotel.signInToSilverBedroom(guest);
        assertEquals(2, room102.getGuests().size());
    }

    @Test
    public void hotelCanSignInGuestToBigBedroom() {
        int i = 0;
        while (i < 4) {
            i++;
            hotel.signInToGoldBedroom(guest);
        }
        assertEquals(4, room103.getGuests().size());
    }

    @Test
    public void hotelCannotSignInGuestToFullBigBedroom() {
        int i = 0;
        while (i < 5) {
            i++;
            hotel.signInToGoldBedroom(guest);
        }
        assertEquals(4, room103.getGuests().size());
    }

    @Test
    public void hotelIsAbsolutelyBananas() {
        int i = 0;
        while (i < 5) {
            i++;
            hotel.signInToGoldBedroom(guest);
        }
        assertEquals(4, room103.getGuests().size());
        assertEquals(0, room104.getGuests().size());
    }

    @Test
    public void hotelBedroomsAreFull() {
        hotel.signInToGoldBedroomOccupy(guest);
        hotel.signInToGoldBedroomOccupy(guest);
        hotel.signInToSilverBedroomOccupy(guest);
        hotel.signInToSilverBedroomOccupy(guest);
        hotel.signInToSilverBedroomOccupy(guest);
        assertEquals(1, room102.getGuests().size());
        assertEquals(1, room103.getGuests().size());
        assertEquals(1, room104.getGuests().size());
    }

    @Test
    public void hotelCanSignInGuestToTopazConferenceRoomUpToFullCapacity() {
        int i = 0;
        while (i < 11) {
            i++;
            hotel.signInToTopazConferenceRoom(guest);
        }
        assertEquals(10, room302.getGuests().size());
    }


    @Test
    public void hotelCanSignInGuestRubyConferenceRoomUpToFullCapacity() {
        int i = 0;
        while (i < 15) {
            i++;
            hotel.signInToRubyConferenceRoom(guest);
        }
        assertEquals(14, room304.getGuests().size());
    }

    @Test
    public void hotelCanSignInGuestSapphireConferenceRommUpToFullCapacity() {
        int i = 0;
        while (i < 29) {
            i++;
            hotel.signInToSapphireConferenceRoom(guest);
        }
        assertEquals(28, room303.getGuests().size());
    }

    @Test
    public void hotelConferenceRoomsAreFull() {
        hotel.signInToSapphireConferenceRoomOccupy(guest);
        hotel.signInToSapphireConferenceRoomOccupy(guest);
        hotel.signInToTopazConferenceRoomOccupy(guest);
        hotel.signInToTopazConferenceRoomOccupy(guest);
        hotel.signInToRubyConferenceRoomOccupy(guest);
        hotel.signInToRubyConferenceRoomOccupy(guest);
        assertEquals(1, room303.getGuests().size());
        assertEquals(1, room304.getGuests().size());
        assertEquals(1, room302.getGuests().size());
    }

    @Test
    public void hotelCanSingInGuestDiningRoomToFullCapacity() {
        int i = 0;
        while (i < 33) {
            i++;
            hotel.signInToDiningRoom(guest);
        }
        assertEquals(32, room202.getGuests().size());
    }
    @Test
    public void canGetGuestList(){
        ArrayList<String> guestListTest = new ArrayList<>();
        guestListTest.add("Jerry");
        hotel.signInToGoldBedroom(guest);
        assertEquals(guestListTest, room103.getGuestList());
    }

}
