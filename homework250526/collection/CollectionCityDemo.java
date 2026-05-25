package homework250526.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionCityDemo {
    static void main(String[] args) {
        ArrayList<City> listCity = new ArrayList<>();
        City c1 = new City("Tavush", "Armenia", "Dilijan");
        City c2 = new City("Syunik", "Armenia", "Goris");
        City c3 = new City("Lori", "Armenia", "Dsegh");
        City c4 = new City("Aragatsotn", "Armenia", "Ashtarak");
        listCity.add(c2);
        listCity.add(c3);
        listCity.add(c4);
        Collections.sort(listCity);
        System.out.println(listCity);
        boolean contains = listCity.contains(c1);
        System.out.println(contains);
        boolean contains2 = listCity.contains(c2);
        System.out.println(contains2);

    }
}
