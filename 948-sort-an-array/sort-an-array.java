class Solution {
    static void mergesort(int nums[],int low,int mid,int high)
    {
        int n=nums.length;
        int left=low;
        int right=mid+1;
        int temp[]=new int[n];
        int k=0;
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                temp[k]=nums[left];
                left++;
                k++;
            }
            else
            {
                temp[k]=nums[right];
                right++;
                k++;
            }
        }

        while(left<=mid)
        {
            temp[k]=nums[left];
            left++;
            k++;
        }
        while(right<=high)
        {
            temp[k]=nums[right];
            right++;
            k++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i]=temp[i-low];
        }

    }
    static void ms(int nums[],int low,int high)
    {
        if(low==high)
        {
            return;
        }
        int mid=(low+high)/2;
        ms(nums,low,mid);
        ms(nums,mid+1,high);
        mergesort(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        ms(nums,0,n-1);
        return nums;
    }
}

