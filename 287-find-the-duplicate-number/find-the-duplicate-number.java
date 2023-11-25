class Solution {
   /* public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    return nums[i];
                }
            }
        }
        return -1;
    } */

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
                if(nums[i]==nums[i-1])
                {
                    return nums[i];
                }
        }
        return -1;
    }
}







