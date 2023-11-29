class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++)
        {
            // if the ele is '- ve' then store the ele in 1st index, after that move the pointer for two step
            if(nums[i]<0)
            {
                ans[neg]=nums[i];
                neg+=2;

            }
            else{
                // if the ele is '+ ve' then store the ele in oth index, after that moving the pointer for two step
                ans[pos]=nums[i];
                pos+=2;
            }
        }

        return ans;
    }
}
