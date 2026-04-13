package homework060426.Building;

public class Buildings {
    static void main(String[] args) {

        ResidentialBuilding privateHouse1 = new PrivateHouse(4, 65.5);
        privateHouse1.setCeilingHeight(3.3);
        privateHouse1.setCeilingHeight(2.5);
        System.out.println(privateHouse1.getCeilingHeight());
        privateHouse1.setHasBalcony(true);
        privateHouse1.setHasBalcony(false);
        System.out.println(privateHouse1.getHasOrHasNotBalcony());
        privateHouse1.turnOnLight();
        privateHouse1.turnOffLight();
        privateHouse1.decreaseNumberOfRooms();
        System.out.println(privateHouse1.numberOfRooms);
        privateHouse1.increaseNumberOfRooms();
        System.out.println(privateHouse1.numberOfRooms);
        privateHouse1.increaseNumberOfRooms();
        System.out.println(privateHouse1.numberOfRooms);
        privateHouse1.increaseNumberOfRooms();
        System.out.println(privateHouse1.numberOfRooms);

        ResidentialBuilding flat = new Flat(2, 45.5, 3);
        flat.setCeilingHeight(2.5);
        flat.setCeilingHeight(4.5);
        System.out.println(flat.getCeilingHeight());
        flat.setHasBalcony(false);
        flat.setHasBalcony(true);
        System.out.println(flat.getHasOrHasNotBalcony());
        flat.turnOnLight();
        flat.turnOffLight();
        flat.decreaseNumberOfRooms();
        System.out.println(flat.numberOfRooms);
        flat.decreaseNumberOfRooms();
        System.out.println(flat.numberOfRooms);
        flat.increaseNumberOfRooms();
        System.out.println(flat.numberOfRooms);

        ResidentialBuilding[] residentialBuildings = {privateHouse1, flat};
        for (ResidentialBuilding b : residentialBuildings) {
            b.turnOffLight();
        }
    }

    public void turnOffLight() {
        System.out.println("Turn Off Light");

    }
}