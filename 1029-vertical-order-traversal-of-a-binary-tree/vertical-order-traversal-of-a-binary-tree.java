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
    static class Pair
    {
        static int hd;
        static TreeNode node;
        Pair(int hd,TreeNode node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair curr=q.poll();
            if(map.containsKey(curr.hd))
            {
                map.get(curr.hd).add(curr.node.val);
            }
            else{
                ArrayList <Integer> temp=new ArrayList<>();
                temp.add(curr.node.val);
                map.put(curr.hd,temp);

            }
            if(curr.node.left!=null)
            {
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null)
            {
                q.add(new Pair(curr.hd+1,curr.node.right));
            }

        }
        for (List<Integer> list : map.values()) {
            result.add(list);
        }

        return result;

    }

}

*/


import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            int size = q.size();
            Map<Integer, List<Integer>> levelMap = new HashMap<>();

            for (int i = 0; i < size; i++) {
                Pair curr = q.poll();
                int hd = curr.hd;
                TreeNode node = curr.node;

                if (!levelMap.containsKey(hd)) {
                    levelMap.put(hd, new ArrayList<>());
                }
                levelMap.get(hd).add(node.val);

                if (node.left != null) {
                    q.add(new Pair(hd - 1, node.left));
                }
                if (node.right != null) {
                    q.add(new Pair(hd + 1, node.right));
                }
            }

            for (Map.Entry<Integer, List<Integer>> entry : levelMap.entrySet()) {
                int hd = entry.getKey();
                List<Integer> values = entry.getValue();

                if (!map.containsKey(hd)) {
                    map.put(hd, new ArrayList<>());
                }
                Collections.sort(values);
                map.get(hd).addAll(values);
            }
        }

        for (List<Integer> list : map.values()) {
            result.add(list);
        }

        return result;
    }

    static class Pair {
        int hd;
        TreeNode node;

        Pair(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }
}



