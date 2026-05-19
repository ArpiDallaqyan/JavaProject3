package homework020526.binarysearch;

public class BinarySearchDemo {
    static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        double [] arr1 = {25.5, 23, 17.6, 15.2, 13.9, 9.7, 7.6, 5.1, 3.5, -7};
        double number1 = binarySearch.binarySearch(arr1, 15.2, 0, arr1.length-1);
        System.out.println(number1);
    }
}
