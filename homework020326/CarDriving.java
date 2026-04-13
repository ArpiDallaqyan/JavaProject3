package homework020326;
public class CarDriving {
    static void main(String[] args) {
        Car car1 = new Car();
        for (int i = 0; i < 20; i++) {
            int drive = car1.drive();
        }
        car1.checkKm();

    }
}
