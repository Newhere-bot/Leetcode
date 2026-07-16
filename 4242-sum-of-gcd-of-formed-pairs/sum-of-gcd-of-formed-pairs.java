import java.util.Arrays;

class Solution {

    // Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] prefixGcd = new int[n];

        int currentMax = nums[0];

        // Construct prefixGcd
        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);
            prefixGcd[i] = gcd(nums[i], currentMax);
        }

        // Sort
        Arrays.sort(prefixGcd);

        long sum = 0;

        int left = 0;
        int right = n - 1;

        // Pair smallest with largest
        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;
    }
}