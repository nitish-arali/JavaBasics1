package ArrayQuestions50;

import java.util.Scanner;

public class PrintDuplicateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println("Duplicate Elements Are: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[j]);
            }
        }

    }
}