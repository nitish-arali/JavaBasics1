package Sorting;

import java.util.*;

public class MergeSort {
    static void mergesort(int arr[],int low,int high){
        int mid=low+(high-low)/2;
        if(low>=high) {
            return;
        }
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);

        merge(arr,low,mid,high);
    }
    static void merge(int arr[],int low,int mid,int high){
        int n=mid-low+1;
        int m=high-mid;

        int arr1[]=new int[n];
        int arr2[]=new int[m];

        for(int i=low,j=0;i<=mid;i++,j++){
            arr1[j]=arr[i];
        }
        for(int i=mid+1,j=0;i<=high;i++,j++){
            arr2[j]=arr[i];
        }

        int[] mergedarray=mergeTwoSortedArrays(arr1,arr2);

        for(int i=low,j=0;j<mergedarray.length;i++,j++){
            arr[i]=mergedarray[j];
        }
    }
    static int[] mergeTwoSortedArrays(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;

        int[] mergedarray=new int[m+n];
        int ptr1=0;
        int ptr2=0;
        int index=0;

        while(ptr1<n && ptr2<m){
            if(arr1[ptr1]<arr2[ptr2]){
                mergedarray[index++]=arr1[ptr1];
                ptr1++;
            }
            else{
                mergedarray[index++]=arr2[ptr2];
                ptr2++;
            }
        }
        while(ptr1<n){
            mergedarray[index++]=arr1[ptr1];
            ptr1++;
        }
        while(ptr2<m){
            mergedarray[index++]=arr2[ptr2];
            ptr2++;
        }
        return mergedarray;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,58,5,47,93,161,3134,13,650,0};
        int n=arr.length;
        int low=0;
        int high=n-1;
        mergesort(arr,low,high);
        System.out.print(Arrays.toString(arr));
    }
}
