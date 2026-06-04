package homework040626;

import java.util.ArrayList;
import java.util.List;

public class DepotDemo {
    static void main(String[] args) {
        Depot<Grocery> depot1 = new Depot<>(100.0);
        Grocery grocery1 = new Grocery("Rice", "04.06.26", "04.06.28",
                "Radmila LLC", 15.0);
        Grocery grocery2 = new Grocery("Wheat", "04.06.26", "04.06.29",
                "Radmila LLC", 13.0);
        Grocery grocery3 = new Grocery("Oats", "04.06.26", "04.06.29",
                "Radmila LLC", 8.0);
        depot1.add(grocery1, 4);
        System.out.println(depot1.getCurrentvolumeOfDepot());
        depot1.add(grocery2, 3);
        System.out.println(depot1.getCurrentvolumeOfDepot());
        depot1.remove(grocery1, 2);
        System.out.println(depot1.getCurrentvolumeOfDepot());
        depot1.add(grocery3, 6);
        double size = depot1.getCurrentvolumeOfDepot();
        System.out.println(size);
        System.out.println(depot1.getDepotVolume());


    }
}
