//https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
      
int n=nums.length;
        if(n==0||n==1)
            return;
        int right=0,left=0,temp=0;
        while(right<n){
            if(nums[right]==0)
                right++;
            else{
                 temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
            
            right++;
            left++;
        }}
    }}
        
