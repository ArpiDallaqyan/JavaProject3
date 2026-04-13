package homework030426;

public class DummyAppPro extends DummyApp {
    private boolean isCameraTurnOn;

    DummyAppPro(String[] members) {
        super(members);
        if (members.length > 8) {
            throw new IllegalArgumentException("Not More Than 8 Members");
        else {
            this.members = members;
        }
    }

    public boolean getCameraTurnOn() {
        return isCameraTurnOn;
    }

    public void turnOnVideo() {
        System.out.println("You are turn on video");
        isCameraTurnOn = true;

    }

    public void turnOffVideo() {
        System.out.println("You are turn off video");
        isCameraTurnOn = false;
    }

