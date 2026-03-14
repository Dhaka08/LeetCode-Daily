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
     public int helper(TreeNode root, int num)
    {
        if(root==null) 
        return 0;

        num=num*10 + root.val;//calculate the sum 

        if(root.left==null && root.right==null)
        return num;// if last node then return sum

        return helper(root.left, num) + helper(root.right,num);
    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
}