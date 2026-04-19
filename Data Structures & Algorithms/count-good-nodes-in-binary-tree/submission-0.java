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
    List<Integer> res = new ArrayList<>();
    public int goodNodes(TreeNode root) {
        dfs(root , root.val);
        return res.size();
    }
    public void dfs(TreeNode root, int max){
        if(root==null) return;
         if(root.val>=max ) res.add(root.val);
         int maxVal = Math.max(root.val, max);
         dfs(root.left,maxVal );
         dfs(root.right, maxVal);


    }
}
