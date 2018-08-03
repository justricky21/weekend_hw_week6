package Hotel;

import Hotel.AbstractAndEnums.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }
}
