package homework020526.binarysearch;

public class BinarySearch {
    public double binarySearch(double[] arr, double number, int left, int right ) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] < 0){
            throw new RuntimeException("Negative Number Exception");
        }
        if (arr[mid] == number) {
            return number;
        } else if (arr[mid] < number) {
            return binarySearch(arr, number, left, mid - 1);

        } else if (arr[mid] > number) {
            return binarySearch(arr, number, mid + 1, right);
        }
    return -1;
    }
}

