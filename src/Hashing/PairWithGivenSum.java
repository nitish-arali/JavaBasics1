package Hashing;

import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int nums[]={ 1, 4, 45, 6, 10, 8 };
        int target=16;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(set.contains(temp))
            {
                System.out.print(nums[i]+" "+temp+"   ");
                System.out.println();
            }
            set.add(nums[i]);
        }
    }
}
