package Homework_02_03_26;

public class BuildHome {
    static void main(String[] args) {
        Home home1 = new Home(3, true, 1, 1, 85.5, "Syuniq street 17/1");
        Home home2 = new Home(-1, true, 3, 2, 65.4, "Goris");
        Home home3 = new Home(home1.getRoom(), home1.getEntrance(), home1.getBathroom(), home1.getBalcony(), home1.getArea(), home1.getAdress());

    }

}
