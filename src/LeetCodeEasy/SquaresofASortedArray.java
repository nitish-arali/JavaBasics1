package LeetCodeEasy;
//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresofASortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int result[] =new int[nums.length];
            int left=0;
            int right=nums.length-1;
            int current=nums.length-1;
            for(int i=0;i<nums.length;i++){
                while(left<=right){
                    if(nums[left]*nums[left]>=nums[right]*nums[right]){
                        result[current--]=nums[left]*nums[left];
                        left++;
                    }
                    else{
                        result[current--]=nums[right]*nums[right];
                        right--;
                    }
                }
            }
            return result;
        }
    }
}
