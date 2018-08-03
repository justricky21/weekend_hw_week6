package Hotel.RoomType;

import Hotel.Abstract.BedroomType;
import Hotel.Abstract.Room;

public class Bedroom extends Room {

    private BedroomType type;
    public Bedroom(BedroomType type) {
        super(type.getCapacity());
        this.type = type;
    }
}
