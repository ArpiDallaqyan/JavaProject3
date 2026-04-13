package homework060426.Building;

public class Flat extends ResidentialBuilding{
    private int floor;

    Flat(int numberOfRooms, double area, int floor){
        super(numberOfRooms, area);
        this.floor = floor;
    }

    @Override
    public void turnOffLight() {
        System.out.println("Turn Off Light Of Flat");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Turn On Light Of Flat");
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor <= 5 && floor > 0) {
            this.floor = floor;
        }
    }
}

