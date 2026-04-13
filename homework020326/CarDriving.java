package homework020326;

import homework020326.Car;

public class CarDriving {
    static void main(String[] args) {
        homework020326.Car car1 = new Car();
        for (int i = 0; i < 20; i++) {
            int drive = car1.drive();
        }
        car1.checkKm();

    }
}
