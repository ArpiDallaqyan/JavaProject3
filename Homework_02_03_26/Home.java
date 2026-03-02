package Homework_02_03_26;

public class Home {
    private int room;
    private boolean entrance;
    private int bathroom;
    private int balcony;
    private double area;
    private String adress;

    public Home(int room, boolean welcome, int bathroom, int balcony, double area, String adress){
        setRoom(room);
        this.entrance = welcome;
        setBathroom(bathroom);
        setBalcony(balcony);
        setArea(area);
        this.adress = adress;
    }

    public Home(){

    }
    public int getRoom(){
        return room;
    }
    public void setRoom(int room) {
        if (room > 0) {
            this.room = room;
        } else {
            System.out.println("Not Possible Value For Building Home");
        }
    }
    public boolean getEntrance(){
        return entrance;
    }
    public int getBathroom(){
        return bathroom;
    }
    public void setBathroom(int bathroom){
        if (bathroom > 0){
        this.bathroom = bathroom;
    }else {
            System.out.println("Not Possible Value For Building Home");
        }
    }
    public int getBalcony(){
        return balcony;
    }
    public void setBalcony(int balcony){
        if (balcony > 0){
        this.balcony = balcony;
    }else {
            System.out.println("Not Possible Value For Building Home");
        }
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        if (area > 0){
        this.area = area;
    }else {
            System.out.println("Not Possible Value For Building Home");
        }
    }
    public String getAdress(){
        return adress;
    }
}

