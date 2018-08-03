package Hotel.Abstract;

public enum BedroomType {
    BRONZE("Bronze", 1),
    SILVER("Silver", 2),
    GOLD("Gold", 4),
    PLATINUM("Platinum", 6);

    private String humanReadable;
    private int capacity;

    BedroomType(String humanReadable, int capacity) {
        this.humanReadable = humanReadable;
        this.capacity = capacity;
    }

    public String getHumanReadable() {
        return humanReadable;
    }

    public int getCapacity() {
        return capacity;
    }
}
