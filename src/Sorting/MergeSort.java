//package Sorting;
//
//import java.util.Scanner;
//
//public class MergeSort {
//        static void mergesort(int []arr){
//            mergesortutil(arr,0,arr.length-1);
//        }
//        static void mergesortutil(int []arr,int low,int high){
//        if(low>=high){
//            return;
//        }
//        int  mid=(low+high)/2;
//        mergesortutil(arr,low,mid);
//        mergesortutil(arr,mid+1,high);
//
//        merge(arr,low,mid,high);
//        }
//        static void merge(int[] arr,int low,int mid,int high){
//            int n=mid-low+1;
//            int m=high-mid;
//
//            int[] arr1=new int[n];
//            int[] arr2=new int[m];
//
//            for(int i=low,j=0;i<=mid;i++,j++){
//                arr1[j]=arr[i];
//            }
//            for(int i=mid+1,j=0;i<=high;i++,j++){
//                arr2[j]=arr[i];
//            }
//            int[] mergedarray=mergetwosortedarrays(arr1,arr2);
//        }
//
//        static int[] mergetwosortedarrays(int[] arr1,int[] arr2){
//            int n=arr1.length;
//            int m=arr2.length;
//
//        }
//
//
//
//    public static void main(String[] args) {
//        //input from user contains array length and array elements
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        mergesort(arr);
//    }
//}
