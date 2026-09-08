class Solution {
    public int maxSubArray(int[] nums) {
       int sum =0;
       int maxi = Integer.MIN_VALUE;
       for (int i =0; i<nums.length ; i++){
        // Step 1: sum create krte h
        sum = sum + nums[i];
        // Step 2: maxi ki value update krte h 
        maxi = Math.max(maxi,sum);
        // Step 3: check for neagative value of sum
        if (sum <0){
            sum =0;
        } 
       } 
       return maxi;
    }
}