package homework150426;

public class RemoteControlDemo {
    static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        RemoteControl object1 = new RemoteControl(lightBulb);
        object1.turnOn();
        object1.turnOff();

        Switchable fan = new Fan();
        RemoteControl object2 = new RemoteControl(fan);
        object2.turnOn();
        object2.turnOff();

        Switchable television = new Television();
        RemoteControl object3 = new RemoteControl(television);
        object3.turnOn();
        object3.turnOff();
    }
}
