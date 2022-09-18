package Arrays.Assignment;

import java.util.Scanner;

public class AssignmentDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        int first = arr2[0];
        for (int i = 1; i < n; i++) {
            if (first > arr[i]) {
                arr2[i] = 1;
                first=arr[i];
            }
            else
                arr[i]=0;

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
