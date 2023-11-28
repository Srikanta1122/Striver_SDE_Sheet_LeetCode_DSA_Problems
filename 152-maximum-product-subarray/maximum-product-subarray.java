class Solution {
    public int maxProduct(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int srafix=1;
        int prefix=1;
        for(int i=0;i<nums.length;i++)
        {  
            if(srafix==0)
            {
                srafix=1;
            }     
            if(prefix==0)
            {
                prefix=1;
            }
            srafix=srafix*nums[i];
            prefix=prefix*nums[nums.length-i-1];
            maxi=Math.max(maxi,Math.max(srafix,prefix));
        }

        return maxi;
    }
}

