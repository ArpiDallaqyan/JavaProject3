package homework250526.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
    static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(15);
        listInt.add(7);
        listInt.add(9);
        listInt.add(14);
        System.out.println(sum(listInt));
        LinkedList<Double> listDouble = new LinkedList<>();
        listDouble.add(3.5);
        listDouble.add(4.7);
        listDouble.add(7.6);
        listDouble.add(-5.5);
        System.out.println(sum(listDouble));

    }
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        return sum;
    }

}
