package Room;

public enum Exit {

    NORTH(1),
    EAST(2),
    SOUTH(3),
    WEST(4);

    private int value;
    Exit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
