class Solution {
    public int missingNumber(int[] nums) {
          for (int i =0 ; i<= nums.length ; i++)
          {  
             int j;
             for ( j=0 ; j<nums.length ; j++)
             {
                   if (i == nums[j])
                   {
                      break ;
                   }
             }

                   if(j == nums.length)
                   {
                    return i ;
                   }
                
                
          }
          return  -1;
    }
}