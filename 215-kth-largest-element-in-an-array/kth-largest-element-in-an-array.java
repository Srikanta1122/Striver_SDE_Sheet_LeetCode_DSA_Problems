class Solution {
    public int findKthLargest(int[] nums, int k) {
      /*  if(nums.length==1)
        {
            return nums[0];
        } */
        Arrays.sort(nums);
        /*
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] < nums[j]) 
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            } */
           /* if(i==k-1)
            {
                return nums[i];
            } */

          //  return nums[k-1];
            return nums[nums.length - k];
        }
        // 
        

}
