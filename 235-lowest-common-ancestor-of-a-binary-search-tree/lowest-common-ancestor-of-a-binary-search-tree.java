/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        {
            return null;
        }
        // if root value is less than the p and q val then element present in the right side
        if(root.val < p.val && root.val < q.val)  
        {
            return lowestCommonAncestor(root.right, p, q);
        }
        // if root value is grater than the p and q val then element present in the left side
        if(root.val > p.val && root.val > q.val)
        {
            return lowestCommonAncestor(root.left, p, q);
        }
        // finally return the root node, where current root is present and this is the LCA.
        return root;
    }
}