package Hotel.AbstractAndEnums;


public abstract class Room {
    private int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
