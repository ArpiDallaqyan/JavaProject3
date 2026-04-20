package homework150426;

public class Television implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("Turn OFF Television");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Television");
    }
}
