class Solution {
    public int removeElement(int[] nums, int val) {
      /*  for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                for(int j=i;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                }
            }
        }
        return nums.length; */

        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}