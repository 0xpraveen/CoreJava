//https://leetcode.com/problems/maximum-subarray/ 
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int i =0 ; i<=nums.length-1;i++){
            
             sum=sum+nums[i];
        
            if(max<=sum) max=sum;
                if(sum<0) sum=0;
                
            }
        
    
        return max;
}}
