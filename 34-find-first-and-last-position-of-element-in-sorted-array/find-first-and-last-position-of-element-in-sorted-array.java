class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};

        int firstIndexOfTargetEle=search(nums,target,true);
        int lastIndexOfTargetEle=search(nums,target,false);

        arr[0]=firstIndexOfTargetEle;
        arr[1]=lastIndexOfTargetEle;

        return arr;

    }

    static int search(int nums[],int target,boolean StartAndLastIndex) // it will return the 1st & last index of the target ele
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else // if the taget ele is found, check for the first and the last index of target ele 
            {
                ans=mid;
                if(StartAndLastIndex)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return ans;

    }
}
