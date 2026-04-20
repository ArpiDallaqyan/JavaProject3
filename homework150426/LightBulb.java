package homework150426;

public class LightBulb implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("Turn OFF Light Bulb");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Light Bulb");

    }
}
