package homework190526.gen;

public class BookingServiceDemo {
    static void main(String[] args) {
        Integer [] rooms = { 5, 7, 8, 9, 11, 15, 20, 35};
        findAvailableRoom(rooms, 25);
        findAvailableRoom(rooms, 9);
        findAvailableRoom(rooms, -9);
    }

    public static <T extends Comparable<T>> void findAvailableRoom(T [] arr, T room){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(room) == 0){
                System.out.println("You Are Successfully Booked Room " + room);
            }
        }
        System.out.println("This Room Is Not Available");
    }
}
