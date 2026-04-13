package homework060426.Building;

public abstract class ResidentialBuilding {
    protected int numberOfRooms;
    protected final double area;
    protected double ceilingHeight;
    protected boolean hasBalcony;
    protected final int numberOfRoomsInitial;
    public ResidentialBuilding [] residentialBuilding ;

    public ResidentialBuilding(int numberOfRooms, double area){
        this.numberOfRoomsInitial = numberOfRooms;
        this.numberOfRooms = numberOfRooms;
        this.area = area;

    }

    public void increaseNumberOfRooms() {
        if (numberOfRooms < numberOfRoomsInitial + 1) {
            numberOfRooms++;
        }
        else {
            System.out.println("You cant increase more than 1 rooms");
        }
    }
    public void decreaseNumberOfRooms() {
        if (numberOfRooms > numberOfRoomsInitial - 1){
            numberOfRooms--;
        }
        else {
            System.out.println("You cant decrease more than 1 rooms");
        }
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    private boolean isSetHeight;
    public void setCeilingHeight(final double ceilingHeight) {
        if (isSetHeight){
            System.out.println("Is already defined");
            return;
        }
        this.ceilingHeight = ceilingHeight;
        isSetHeight = true;

    }

    public boolean getHasOrHasNotBalcony() {
        return hasBalcony;
    }

    private boolean isSetHasBalcony;
    public void setHasBalcony(boolean hasBalcony) {
        if (isSetHasBalcony){
            System.out.println("Is already defined");
            return;
        }
        this.hasBalcony = hasBalcony;
        isSetHasBalcony = true;
    }

    public abstract void turnOnLight();
    public abstract void turnOffLight();

    public void turnOffLight(ResidentialBuilding [] residentialBuildings){
        System.out.println("Turn Off Light");

    }
}

