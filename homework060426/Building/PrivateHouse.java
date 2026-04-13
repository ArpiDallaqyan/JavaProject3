package homework060426.Building;

public class PrivateHouse extends ResidentialBuilding{
    private boolean isGateOpen;

    public PrivateHouse(int numberOfRooms, double area){
        super(numberOfRooms, area);
    }

    public boolean isGateOpen() {
        return isGateOpen;
    }

    @Override
    public void turnOffLight() {
        System.out.println("Turn Off Light Of Private House");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Turn On Light Of Private House");
    }
    public void openGate(){
        isGateOpen = true;
        System.out.println("Open The Private House's Gates");
    }
    public void closeGate(){
        isGateOpen = false;
        System.out.println("Close The Private House's Gates");
    }
}
