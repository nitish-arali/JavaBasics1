package Hashing;
import java.util.*;
import java.io.*;


public class CountUniqueElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Create Hashset
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
