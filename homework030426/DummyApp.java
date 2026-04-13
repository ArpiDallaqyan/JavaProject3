package homework030426;

public class DummyApp {
    private String name1;
    private String name2;
    String[] members = new String[8];
    private String duration = "1 min 37 sec";


    DummyApp(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
        makeCall();
        takeCall();
    }
    DummyApp(String[] members){

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

    public String getDuration() {
        return duration;
    }
    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

}

