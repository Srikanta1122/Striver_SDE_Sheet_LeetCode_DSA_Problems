/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) // if root is null then return null
        {
            return null;
        }
        if(root.val==val)
        {
            return root;
        }
        if(root.val<val) // if the val is greater then it's present in the right side
        {
            return searchBST(root.right,val);
        }
        else   // if the val is greater then it's present in the right side
        {
            return searchBST(root.left,val);
        }
            
    }
}
