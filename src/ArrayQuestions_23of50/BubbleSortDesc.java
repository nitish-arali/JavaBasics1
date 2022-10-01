package ArrayQuestions_23of50;

import java.util.Scanner;

public class BubbleSortDesc {
    public static void main(String args[]){
        System.out.println("Number of Elements in the Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Array Elements to be sorted in Descending Order");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Bubble Sort
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Elements:\t");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
