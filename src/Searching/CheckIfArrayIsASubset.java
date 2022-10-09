package Searching;
import java.util.*;
/*
1.sort
2.search element using binary search
3.compare with the set
4.if all the elements are present then print true
5. else false
 */
public class CheckIfArrayIsASubset {
    static int bsr(int arr1[],int arr2,int low,int high) {
            while (low<=high) {
                int mid = low + (high - low) / 2;
                if (mid == arr2) {
                    return mid;
                }
                else if (mid > arr2) {
                    bsr(arr1, arr2, low, mid - 1);
                }
                else
                    bsr(arr1, arr2, mid + 1, high);
            }
          return 0;
    }
    static int issubset(int arr1[],int arr2[],int arr3[],int m,int n){
        Arrays.sort(arr1);
        int low=arr1[0];
        int high=arr1[m-1];

        for(int i=0;i<n;i++) {
            arr3[i]=bsr(arr1, arr2[i], low, high);
        }
        for(int i=0;i<n;i++){
            if(arr3[i]>0){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr1[]={11,1,13,21,3,7};
        int arr2[]={11,1,13};
        int arr3[]=new int[arr2.length];
        int m=arr1.length;
        int n=arr2.length;

        if (issubset(arr1,arr2,arr3,m,n)==1){
            System.out.println("arr2[] is subset of arr1[]");
        }
        else{
            System.out.println("arr2[] is not a subset of arr1[]");
        }
    }
}
