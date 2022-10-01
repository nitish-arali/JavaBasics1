package ArrayQuestions_23of50;

import java.util.Scanner;

public class CubeofArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1=new int[arr.length];
        System.out.println("Input the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            for(int j=0;j<arr1.length;j++){
                arr1[j]=arr[j]*arr[j]*arr[j];
            }
        for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
        }
    }
}
