package homework190526.gen;

import java.util.Objects;

public class BookingService  {
    private int numberOfRoom;
    BookingService(int numberOfRoom){
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfRoom);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
