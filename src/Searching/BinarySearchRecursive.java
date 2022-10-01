package Searching;

public class BinarySearchRecursive {
    public static int bsr(int arr[], int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return bsr(arr, low, mid - 1, key);
            } else {
                return bsr(arr, mid + 1, high, key);
            }
        } else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;
        int low = 0;
        int high = arr.length;
        int result = bsr(arr, low, high, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + result);
        }
    }
}
