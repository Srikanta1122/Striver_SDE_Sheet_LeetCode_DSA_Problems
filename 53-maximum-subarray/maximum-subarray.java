class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum=Integer.MIN_VALUE;
        int CurrentSum=0;

        for(int i=0;i<nums.length;i++)
        {
            CurrentSum=CurrentSum+nums[i];
            if(CurrentSum > MaxSum)
            {
                MaxSum=CurrentSum;
            }
            if(CurrentSum < 0)
            {
                CurrentSum=0;
            }
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:

       /* if(MaxSum < 0)
        {
            MaxSum=0;
        } */
        return MaxSum;
    }
}

