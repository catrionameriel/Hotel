package Hotel.Room;

public class GuestRoom extends Room{

    private String name;
    private double rate;
    private GuestRoomType roomType;

    public GuestRoom(int inputCapacity, String name, double rate, GuestRoomType guestRoomType) {
        super(inputCapacity);
        this.name = name;
        this.rate = rate;
        this.roomType = guestRoomType;
    }

    public String getName() {
        return this.name;
    }

    public double getRate() {
        return this.rate;
    }

    public GuestRoomType getRoomType() {
        return this.roomType;
    }

    public void setName(String newRoomName) {
        this.name = newRoomName;
    }

    public int getCapacityFromRoomType() {
        return this.roomType.getNumberOfPeople();
    }

    public void setRoomType(GuestRoomType newGuestRoomType) {
        this.roomType = newGuestRoomType;
    }

    public void setRate(double newRate) {
        this.rate = newRate;
    }
}
