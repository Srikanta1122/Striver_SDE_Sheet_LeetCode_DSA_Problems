class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;

        // Find the first zero element
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
         if (j == -1) 
         {
            return;
         }
        // Move non-zero elements to the left
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
