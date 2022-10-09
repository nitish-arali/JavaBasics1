package Hashing;

import java.util.HashSet;

public class CheckIfSubset {
    static boolean checkIfSubset(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();

        for (int j : arr1) {
            set.add(j);
        }

        for (int j : arr2) {
            if (!set.contains(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr2=new int[]{2,6,8,5};
        if(checkIfSubset(arr1,arr2)){
            System.out.println("arr2 is a subset of arr1");
        }
        else
            System.out.println("arr2 is not a subset of arr1");

    }
}
