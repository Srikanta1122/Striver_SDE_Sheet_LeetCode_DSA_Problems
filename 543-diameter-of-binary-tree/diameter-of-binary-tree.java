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
 /*
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int dl=diameterOfBinaryTree(root.left);
        int dr=diameterOfBinaryTree(root.left);
        int diameterThroughRoot = height(root.left) + height(root.right);

        return Math.max(diameterThroughRoot,Math.max(dl,dr));
    }
     int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}

*/

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        int diameterThroughRoot = height(root.left) + height(root.right);

        return Math.max(diameterThroughRoot, Math.max(dl, dr));
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
