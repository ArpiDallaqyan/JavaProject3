package homework250526.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionCityDemo {
    static void main(String[] args) {
        ArrayList<City> listCity = new ArrayList<>();
        City c1 = new City("Armenia", "Tavush", "Dilijan");
        City c2 = new City("Armenia", "Syunik", "Goris");
        City c3 = new City("Armenia", "Lori", "Dsegh");
        City c4 = new City("Armenia", "Aragatsotn", "Ashtarak");
        City c5 = new City("Armenia", "Lori", "Dsegh");
        listCity.add(c2);
        listCity.add(c3);
        listCity.add(c4);
        Collections.sort(listCity);
        System.out.println(listCity);
        boolean contains = listCity.contains(c1);
        System.out.println(contains);
        boolean contains2 = listCity.contains(c2);
        System.out.println(contains2);
        boolean contains3 = listCity.contains(c5);
        System.out.println(contains3);

    }
}
