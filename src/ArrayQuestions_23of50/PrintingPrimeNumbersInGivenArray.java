package ArrayQuestions_23of50;

import java.util.Scanner;

public class PrintingPrimeNumbersInGivenArray {
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            for(int i=0;i<arr.length;i++){
                if(isPrime(arr[i]))
                    System.out.println("true");
                else System.out.println("false");
            }
        }
    }
