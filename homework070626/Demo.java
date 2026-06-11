package homework070626;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {
    static void main(String[] args) {
        List<Customer> customerList1 = new ArrayList<>();
        customerList1.add(new Customer("Ani Grigoryan", "05.04.26", "Nor Vanqi Tap 7/2"));
        customerList1.add(new Customer("Anna Hovsepyan", "18.05.26", "Komeritmituyan 2/452"));
        customerList1.add(new Customer("Gor Simonyan", "01.03.26", "Aksel Bakunts 2/4"));
        List<Customer> customerList2 = new ArrayList<>();
        customerList2.add(new Customer("Elen Hovsepyan", "04.03.26", "Syuniqi 125"));
        customerList2.add(new Customer("Alen Avetisyan", "02.02.26", "Galstyan 2/6"));
        Technique technique1 = new Technique("Fridge", "Indesit", "200W", "Black");
        Technique technique2 = new Technique("Vacuum Cleaner", "Diamond", "3000W", "Red");
        HashMap<Technique, List<Customer>> techniqueCustomerHashMap = new HashMap<>();
        techniqueCustomerHashMap.put(technique1, customerList1);
        techniqueCustomerHashMap.put(technique2, customerList2);
        techniqueCustomerHashMap.put(technique1, customerList2);
        System.out.println(techniqueCustomerHashMap.size());
        System.out.println(techniqueCustomerHashMap.get(new Technique("Fridge", "Indesit",
                "200W", "Black")));
        System.out.println(techniqueCustomerHashMap.get(new Technique("Mixer", "Diamond",
                "800W", "White")));
        techniqueCustomerHashMap.put(null, customerList1);
        System.out.println(techniqueCustomerHashMap.get(null));
        System.out.println(techniqueCustomerHashMap.size());
        System.out.println(techniqueCustomerHashMap.remove(new Technique("Vacuum Cleaner", "Diamond",
                "3000W", "Red")));
        System.out.println(techniqueCustomerHashMap.size());
        System.out.println(techniqueCustomerHashMap.remove(new Technique("Air Grill", "Haley",
                "1500W", "Black")));
        System.out.println(techniqueCustomerHashMap.size());
    }
}
