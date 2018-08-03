package Hotel.RoomType;

import Hotel.AbstractAndEnums.BedroomType;
import Hotel.AbstractAndEnums.Room;

public class Bedroom extends Room {

    private BedroomType type;
    public Bedroom(BedroomType type, int roomNumber) {
        super(type.getCapacity(), roomNumber);
        this.type = type;
    }

    public BedroomType getType() {
        return type;
    }

    public String getReadableType(){
        return type.getHumanReadable();
    }

    public int getRate(){
        return type.getRate();
    }
}
