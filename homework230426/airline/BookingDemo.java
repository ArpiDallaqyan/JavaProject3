package homework230426.airline;

public class BookingDemo {
    static void main(String[] args) {
        int [] rooms = {1, 5, 7, 15, 24};
        BookingService b = new BookingService();
        Guest guest = new Guest(20, 15);
        Room room = new Room(rooms);

        Guest guest1 = new Guest(15, 20);
        Room room1 = new Room(rooms);
        try {
            b.bookRoom(guest, room);
        } catch (RoomUnavailableException | UnderAgeException u) {
            System.out.println(u.getMessage());
        }

        try {
            b.bookRoom(guest1, room1);
        } catch (RoomUnavailableException | UnderAgeException u) {
            System.out.println(u.getMessage());
        }

    }

}