package homework230426.airline;

public class BookingService {
    public void bookRoom(Guest g, Room r) throws RoomUnavailableException, UnderAgeException{
        if (g.getAge() < 18 ){
            throw new UnderAgeException();
        }
        System.out.println("The Age Entered Successfully!");

        if (!r.checkRooms(g.getDesiredRoom())) {
            throw new RoomUnavailableException();
        }
        System.out.println("Room Booked Successfully!");

    }



}
