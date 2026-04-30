package homework150426;

public class RemoteControl {
    Switchable switchable;

    public RemoteControl(Switchable switchable) {
        this.switchable = switchable;
    }

    public void turnOff() {
        switchable.turnOff();
    }

    public void turnOn() {
        switchable.turnOn();

    }
}