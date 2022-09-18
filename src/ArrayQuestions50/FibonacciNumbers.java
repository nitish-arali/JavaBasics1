package ArrayQuestions50;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series upto: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int fact=0;
        arr[0]=1;
        for (int i = 1; i <= arr.length-1; i++){
            arr[i]=fact+arr[i-1];
            fact=arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
