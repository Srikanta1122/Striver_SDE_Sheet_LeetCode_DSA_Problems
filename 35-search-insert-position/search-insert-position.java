class Solution {
    public int searchInsert(int[] nums, int target) {
      /*  for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if()
        } */

        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
            high=mid-1;
            }
        }
        return low;
    }
}

