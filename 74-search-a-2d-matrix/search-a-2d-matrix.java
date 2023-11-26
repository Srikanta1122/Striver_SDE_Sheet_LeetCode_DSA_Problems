class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int i=0;
        int j=matrix[0].length-1;

        while(i<n && j>=0)
        {
            // if the target ele is exist 
            if(matrix[i][j]==target)
            {
                return true;
            }
            // if the target ele is greater than the matrix ele then ele present in the top to down, so that we sould perfrom i++ ;
            else if(matrix[i][j] < target)
            {
                i++;
            }
            // if the target ele is lesser than the matrix ele then ele present in the right to left, so that we sould perfrom j-- ;
            else if(matrix[i][j] > target)
            {
                j--;
            }
        }
        // if the target ele is not exist 
        return false;
    }
}
