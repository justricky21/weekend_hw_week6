package Hotel.AbstractAndEnums;

public enum ConferenceRoomType {
    TOPAZ("Topaz", 10, 50),
    RUBY("Ruby", 14, 80),
    SAPPHIRE("Sapphire", 28, 110);

    private String humanReadable;
    private int capacity;
    private int rate;

    ConferenceRoomType(String humanReadable, int capacity, int rate) {
        this.humanReadable = humanReadable;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getHumanReadable() {
        return humanReadable;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
