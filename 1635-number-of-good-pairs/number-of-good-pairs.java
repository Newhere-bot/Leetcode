import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i =0; i<nums.length ; i++)
        {
            for(int j =i+1 ; j<nums.length;j++)
        {
           if(nums[i] == nums[j])
           {
            count++;
           }
        }
        
    } return count;
    }
    public static void main (String args[])
    {
        System.out.println("Size of array");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i =0 ; i<nums.length; i++)
        {
              nums[i]= sc.nextInt();
             Solution obj = new Solution();

          int result = obj.numIdenticalPairs(nums);

           System.out.println("Number of good pairs = " + result);

           sc.close();
        }
    }
}