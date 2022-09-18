package Arrays.Assignment;

import java.io.*;
import java.util.*;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] fr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[i] = -1;
                }
            }
                if (count > 1) {
                    System.out.print(arr[i] + " " + count);
                    System.out.println();
                }
        }
    }
}

