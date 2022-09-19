package ArrayQuestions50;

import java.util.Scanner;

public class SeperatePositiveNegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The positive elements are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
            System.out.println("The negative elements are: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
