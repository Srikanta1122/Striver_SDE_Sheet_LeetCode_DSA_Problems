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


 // Here we use the reverse preOrder travarsal  ---> root->right->left

class Solution {
    public List<Integer> rightSideView(TreeNode root) 
    {

        ArrayList<Integer> arr=new ArrayList<>();
        rightview(root,arr,0); // first level is '0'
        return arr; // return the final list of the answer.
    }

    void rightview(TreeNode root,ArrayList<Integer> arr,int level)
    {
        if(root==null)
        {
            return;  // when it is return, it will go back from where it was called.
        }
        if(level==arr.size()) // if level is equal to the value present in list then we add the value in list 
        {
            arr.add(root.val);
        }
        rightview(root.right,arr,level+1); // recursive call for the right sub-tree
        rightview(root.left,arr,level+1); // recursive for the left sub-tree
    }
}
