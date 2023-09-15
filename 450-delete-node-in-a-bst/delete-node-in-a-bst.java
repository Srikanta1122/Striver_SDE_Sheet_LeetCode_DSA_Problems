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
    public TreeNode deleteNode(TreeNode root, int key) {

        // Return if the tree is empty
        if(root==null)
        {
            return null;
        }
         // Find the node to be deleted
        if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key)
        {
            root.left=deleteNode(root.left,key);
        }

        else // If the node is with only one child or no child
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
              // If the node has two children
              // Place the inorder successor in position of the node to be deleted
            root.val=minval(root.right);

            // Delete the inorder successor
            root.right=deleteNode(root.right,root.val);
        }
        return root;
    }

    // Find the inorder successor
    int minval(TreeNode root)
    {
        int minv=root.val;
        while(root.left!=null)
        {
            minv=root.left.val;
            root=root.left;
        }
        return minv;
    }
}




