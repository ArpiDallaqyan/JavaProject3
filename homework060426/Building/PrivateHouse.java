package homework060426.Building;

public class PrivateHouse extends ResidentialBuilding{

    public PrivateHouse(int numberOfRooms, double area){
        super(numberOfRooms, area);
    }

    @Override
    public void turnOffLight() {
        System.out.println("Turn Off Light");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Turn On Light");
    }
    public void openGate(){
        System.out.println("Open The Gates");
    }
    public void closeGate(){
        System.out.println("Close The Gates");
    }
}
