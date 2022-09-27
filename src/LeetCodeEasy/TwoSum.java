package LeetCodeEasy;
//https://leetcode.com/problems/two-sum/
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int res[]=new int[2];
            int i;
            int j;
            for(i=0;i<nums.length;i++){
                for(j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        res[0]=i;
                        res[1]=j;
                    }
                }
            }
            return res;
        }
    }
}
