package AssignmentQuestions;

import java.util.*;

public class ImplementingInsertionSort {
    public static void main(String[] args) {
        System.out.println("Number of elements in the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input the array elements to be sorted");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {          // a[0]>a[1]
                arr[j + 1] = arr[j];                // so we swap a[0] & a[1]
                j = j - 1;
            }
            arr[j + 1] = key;                       // we set a[1] which is greater than a[0] as key
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
