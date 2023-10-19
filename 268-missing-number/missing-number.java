class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int exp_total=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];

        }

        return exp_total-sum;
    }
}