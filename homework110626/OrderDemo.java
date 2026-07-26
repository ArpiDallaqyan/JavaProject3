package homework110626;

import java.util.*;

public class OrderDemo {
    static void main(String[] args) {
        Customer customer1 = new Customer("Mery", 29, "Goris");
        Customer customer2 = new Customer("Nare", 35, "Kapan");
        Customer customer3 = new Customer("Alina", 20, "Yerevan");

        Map<Customer, List<Order>> orderTreeMap = new TreeMap<>();
        orderTreeMap.put(customer1, new ArrayList<>());
        orderTreeMap.put(customer2, new ArrayList<>());
        orderTreeMap.put(customer3, new ArrayList<>());
        orderTreeMap.get(customer1).add(new Order(1122, "Fridge"));
        orderTreeMap.get(customer1).add(new Order(1123, "TV"));
        orderTreeMap.get(customer2).add(new Order(1124, "Blander"));
        orderTreeMap.get(customer1).add(new Order(1125, "Mixer"));
        orderTreeMap.get(customer1).add(new Order(1126, "Cup"));
        orderTreeMap.get(customer3).add(new Order(1127, "Table"));
        System.out.println(orderTreeMap.get(customer1));
        System.out.println(Map.entry(customer1,orderTreeMap.get(customer1)));
        System.out.println(orderTreeMap.get(customer2));
        System.out.println(Map.entry(customer2,orderTreeMap.get(customer2)));
        System.out.println(orderTreeMap.get(customer1).size());
        System.out.println(orderTreeMap.get(customer2).size());
        System.out.println(orderTreeMap);

    }
}
