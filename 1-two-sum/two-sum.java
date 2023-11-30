
/* import java.util.*;

class Solution {
    /*public int[] twoSum(int[] nums, int target) {
        // Create a map to store the original indices of elements
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                // We've found the two elements that add up to the target
                int index1 = indexMap.get(nums[left]);
                int index2 = indexMap.get(nums[right]);
                
                int[] result = {index1, index2};
                return result;
            }
        }

        // If no solution is found, return an empty array
        return new int[0];
    } */
/*

    public int[] twoSum(int[] nums, int target) {
            int n=nums.length;
          // int ans[]=new int[n];
          Arrays.sort(nums);

            int left=0;
            int right=n-1;

            while(left<right)
            {
                int sum=nums[left]+nums[right];
                if(sum<target)
                {
                    left++;
                }
                else if(sum>target)
                {
                    right--;
                }
                else
                {
                    return new int[]{left,right};
                }
            }

            return new int[]{-1,-1};

    }
} */


import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // Create a list of indices to keep track of the original indices
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        // Sort the indices based on the corresponding values in nums
        indices.sort((a, b) -> Integer.compare(nums[a], nums[b]));

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = nums[indices.get(left)] + nums[indices.get(right)];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                // Return the original indices
                return new int[]{indices.get(left), indices.get(right)};
            }
        }

        // If no such pair is found, return an array with both values set to -1
        return new int[]{-1, -1};
    }
}





