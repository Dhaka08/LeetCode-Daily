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
    public List<Integer> dfs(List<Integer> list, TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) list.add(root.val);
        dfs(list,root.left);
        dfs(list,root.right);
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = dfs(list1,root1);
        list2 = dfs(list2,root2);
        return list1.equals(list2);
    }
}