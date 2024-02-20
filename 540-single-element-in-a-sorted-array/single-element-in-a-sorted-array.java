class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) // if 1 ele present in the array 
        {
            return nums[0];
        }
        if(nums[0]!=nums[1]) // check for the 1st ele
        {
            return nums[0];
        }
        else if(nums[n-1]!=nums[n-2]) // check for the last ele
        {
            return nums[n-1];
        }

        else
        {
            int left=1;
            int right=n-2;

            while(left<=right)
            {
                int mid=(left+right)/2;

                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                {
                    return nums[mid];
                }

                else if((mid%2==1 && nums[mid]==nums[mid+1]) || (mid%2==0 && nums[mid]==nums[mid-1])) // eleminate for the right half
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }

        return -1;
    }
}


