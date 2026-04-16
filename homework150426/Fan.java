package homework150426;

public class Fan implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("Turn OFF Fan");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Fan");

    }
}
