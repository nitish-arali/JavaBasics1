package TwoPointers;
import java.util.*;

public class MergingTwoSortedArray {
    public static void main(String[] args) {


    int[] arr1=new int[]{1,5,9,13};
    int[] arr2=new int[] {2,5,6,28,39,50};
    int m=arr1.length;
    int n=arr2.length;
    int [] res=new int[m+n];
    int i=0,j=0,k=0;
        while(i!=m && j!=n) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
            while(i!=m)
            {
                res[k]=arr1[i];
                k++;
                i++;
            }
            while(j!=n)
            {
                res[k]=arr2[j];
                k++;
                j++;
            }
        System.out.println(Arrays.toString(res));
//            for(int l=0;l<res.length;l++)
//            {
//                System.out.print(res[l]+" ");
//            }
    }
}
