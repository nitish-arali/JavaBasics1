package ArrayQuestions50;
import java.util.*;
import java.io.*;
public class PrintInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
