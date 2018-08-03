package Hotel.AbstractAndEnums;


import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;
    private boolean occupied;
    private int roomNumber;

    public Room(int capacity, int roomNumber) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.occupied = false;
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public boolean isOccupied() {
        return occupied;
    }
    public void reduceCapacity(){
        this.capacity -= 1;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<String> getGuestList(){
        ArrayList<String> guestList = new ArrayList<>();
        for (Guest guest : guests){
            guestList.add(guest.getName());
        }
        return guestList;

    }

}
