package Homework_02_04_26;

public class DummyApp {
    String name1;
    String name2;
    private int duration;

    DummyApp(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
        makeCall();
        takeCall();
        turnOffCall();
    }

    public void makeCall(){
        System.out.println("You are make the call");
    }

    public void takeCall(){
        System.out.println("You are take the call");
    }

    public void turnOffCall(){
        System.out.println("You are turn off the call");

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
