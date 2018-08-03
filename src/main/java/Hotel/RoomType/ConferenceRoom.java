package Hotel.RoomType;

import Hotel.AbstractAndEnums.ConferenceRoomType;
import Hotel.AbstractAndEnums.Room;

public class ConferenceRoom extends Room {

    private ConferenceRoomType type;

    public ConferenceRoom(ConferenceRoomType type, int roomNumber) {
        super(type.getCapacity(), roomNumber);
        this.type = type;
    }


    public ConferenceRoomType getType() {
        return type;
    }

    public String getReadableType(){
        return type.getHumanReadable();
    }

    public int getRate(){
        return type.getRate();
    }
}
