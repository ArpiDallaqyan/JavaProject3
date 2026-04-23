package homework230426.airline;

public class Guest {
    private int age;
    private int desiredRoom;

    public Guest(int age, int desiredRoom){
        this.age = age;
        this.desiredRoom = desiredRoom;
    }

    public int getAge() {
        return age;
    }

    public int getDesiredRoom() {
        return desiredRoom;
    }
}
