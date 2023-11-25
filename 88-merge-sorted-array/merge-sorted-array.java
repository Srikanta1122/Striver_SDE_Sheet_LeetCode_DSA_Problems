class Solution {
    /*
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int nums3[]=new int[m+n];
        int left=0;
        int right=0;
        int index=0;

        while(left<m && right<n)
        {
            if(nums1[left]<=nums2[right])
            {
                nums3[index]=nums1[left];
                index++;
                left++;
            }
            else if(nums1[left]>=nums2[right])
            {
                nums3[index]=nums2[right];
                index++;
                right++;
            }

            
        }

        // if element still present in the left 
        while(left<m)
        {
            nums3[index]=nums1[left];
            index++;
            left++;

        }
        // if element still present in the right
        while(right<n)
        {
            nums3[index]=nums2[right];
            index++; right++;
        }

        // push back all the element from num3 to the nums1 and nums2
        for(int i=0;i<m+n;i++)
        {
            if(i<m)
            {
                nums1[i]=nums3[i];
            }
            else
            {
                nums2[i-m]=nums3[i];
            }
        }
    }
    */

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }
}






