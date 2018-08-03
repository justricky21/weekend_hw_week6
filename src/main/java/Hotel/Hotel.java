package Hotel;

import Guest.Guest;
import Hotel.AbstractAndEnums.BedroomType;
import Hotel.AbstractAndEnums.Room;
import Hotel.RoomType.Bedroom;
import Hotel.RoomType.ConferenceRoom;
import Hotel.RoomType.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void addBedroom(Bedroom room) {
        this.bedrooms.add(room);
    }

    public void addConferenceRoom(ConferenceRoom room) {
        this.conferenceRooms.add(room);
    }

    public void addDiningRoom(DiningRoom room) {
        this.diningRooms.add(room);
    }

    public void signInToBronzeBedroom(Guest guest) {
        for (Bedroom room : bedrooms) {
            if (room.getCapacity() > 0 && (room.getReadableType().equals("Bronze"))) {
                room.reduceCapacity();
                room.setOccupied(true);
                room.getGuests().add(guest);
            }
        }
    }

    public void signInToSilverBedroom(Guest guest) {
        for (Bedroom room : bedrooms) {
            if ((room.getCapacity() > 0 &&
                    (room.getReadableType().equals("Silver"))) && (!room.isOccupied())) {
                room.reduceCapacity();
                room.getGuests().add(guest);
            }
        }
    }

    public void signInToSilverBedroomOccupy(Guest guest) {
        for (Bedroom room : bedrooms) {
            if ((room.getCapacity() > 0 &&
                    (room.getReadableType().equals("Silver"))) && (!room.isOccupied())) {
                room.reduceCapacity();
                room.setOccupied(true);
                room.getGuests().add(guest);
            }
        }
    }

    public void signInToGoldBedroom(Guest guest) {
        for (Bedroom room : bedrooms) {
            if ((room.getCapacity() > 0) &&
                    (room.getReadableType().equals("Gold")) && (!room.isOccupied())) {
                room.reduceCapacity();
                room.getGuests().add(guest);
            }
        }
    }

    public void signInToGoldBedroomOccupy(Guest guest) {
        for (Bedroom room : bedrooms) {
            if ((room.getCapacity() > 0) &&
                    (room.getReadableType().equals("Gold")) && (!room.isOccupied())) {
                room.reduceCapacity();
                room.setOccupied(true);
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToTopazConferenceRoom(Guest guest){
        for (ConferenceRoom room : conferenceRooms){
            if ((room.getCapacity() > 0) && (room.getReadableType().equals("Topaz"))
                && (!room.isOccupied())){
                room.reduceCapacity();
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToRubyConferenceRoom(Guest guest){
        for (ConferenceRoom room : conferenceRooms){
            if ((room.getCapacity() > 0) && (room.getReadableType().equals("Ruby"))
                    && (!room.isOccupied())){
                room.reduceCapacity();
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToSapphireConferenceRoom(Guest guest){
        for (ConferenceRoom room : conferenceRooms){
            if ((room.getCapacity() > 0) && (room.getReadableType().equals("Sapphire"))
                    && (!room.isOccupied())){
                room.reduceCapacity();
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToTopazConferenceRoomOccupy(Guest guest){
        for (ConferenceRoom room : conferenceRooms){
            if ((room.getCapacity() > 0) && (room.getReadableType().equals("Topaz"))
                    && (!room.isOccupied())){
                room.reduceCapacity();
                room.setOccupied(true);
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToRubyConferenceRoomOccupy(Guest guest){
        for (ConferenceRoom room : conferenceRooms){
            if ((room.getCapacity() > 0) && (room.getReadableType().equals("Ruby"))
                    && (!room.isOccupied())){
                room.reduceCapacity();
                room.setOccupied(true);
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToSapphireConferenceRoomOccupy(Guest guest){
        for (ConferenceRoom room : conferenceRooms){
            if ((room.getCapacity() > 0) && (room.getReadableType().equals("Sapphire"))
                    && (!room.isOccupied())){
                room.reduceCapacity();
                room.setOccupied(true);
                room.getGuests().add(guest);
            }
        }
    }
    public void signInToDiningRoom(Guest guest){
        for (DiningRoom room : diningRooms){
            if (room.getCapacity() > 0){
                room.reduceCapacity();
                room.getGuests().add(guest);
            }
        }
    }

}
