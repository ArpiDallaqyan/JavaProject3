package homework230426.airline;

public class Room {
    int [] rooms ;
    int room;
    public Room(int [] rooms) {
        this.rooms = rooms;
    }
    public boolean checkRooms(int room) {
        for (int num : rooms) {
            if (num == room) {
                System.out.println("This is Valid Room Number");
                return true;
            }
        }

        System.out.print("Please choose between these rooms: ");
        for (int num : rooms) {
            System.out.print(num + " ");
        }
        return false;
    }
}

