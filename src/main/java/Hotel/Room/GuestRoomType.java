package Hotel.Room;

public enum GuestRoomType {
    DOUBLE(2),
    SINGLE(1),
    FAMILY(4);

    private final int capacity;

    private GuestRoomType(int capacity){
        this.capacity = capacity;
    }

    public int getNumberOfPeople(){
        return this.capacity;
    }

}
