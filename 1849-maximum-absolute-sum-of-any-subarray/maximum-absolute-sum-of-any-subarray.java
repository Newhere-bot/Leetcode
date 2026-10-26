class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int prefixSum = 0; 
        int ans = 0;
        for (int num : nums){
            prefixSum += num;
        ans = Math.max(ans , Math.max(Math.abs(prefixSum - minSum),Math.abs(prefixSum - maxSum)));
        minSum = Math.min(minSum,prefixSum);
        maxSum = Math.max(maxSum,prefixSum);
       } 
       return ans;
    }
}