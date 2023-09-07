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
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> arr=new ArrayList<>();

        inorder(root,arr);
        return arr;
    }
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}
