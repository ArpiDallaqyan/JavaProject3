package homework190526.gen;

public class BookingService implements Comparable<BookingService> {
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
    public int compareTo(BookingService o) {
        return Integer.compare(this.numberOfRoom, o.numberOfRoom);
    }
}
