package Arrays.Assignment;

import java.io.*;
import java.util.*;

public class MaxMinInArray {
//        static int max(int arr[],int temp){
//            temp=0;
//            for(int i=0;i<arr.length-1;i++){
//                if(arr[i]>arr[i+1]){
//                    temp=arr[i];
//                }
//            }

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            for(int i=0;i<T;i++){
                int N=sc.nextInt();
                int [] arr=new int[N];

                for(int j=0;j<N;j++){
                    arr[j]=sc.nextInt();
                }
                    Arrays.sort(arr);
                    System.out.print(arr[arr.length-1]+" "+arr[0]);
            }
        }
}
