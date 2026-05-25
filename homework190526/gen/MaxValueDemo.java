package homework190526.gen;

public class MaxValueDemo {
    static void main(String[] args) {
        Integer [] arr = {15, 35, 6, 9, 12, 7 ,65};
        System.out.println(calculateMaxValue(arr));

        House[] houses = {new House(65.5), new House(46), new House(95),
                new House(72), new House(144)};
        System.out.println(calculateMaxValue(houses).getArea());
        }

    public static <T extends Comparable<T>> T calculateMaxValue (T[]arr){
        T maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(maxValue) > 0) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
