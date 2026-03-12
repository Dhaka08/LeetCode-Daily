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
    public TreeNode helper(int[] inorder, int[] postorder,int instart, int inend, int poststart, int postend){
        if(instart>inend){
            return null;
        }
        int rootval = postorder[postend];
        TreeNode root = new TreeNode(rootval);
        int i = instart;
        while(inorder[i]!=postorder[postend]) i++;

        int leftsize = i - instart;
        int rightsize = inend - i;
        
        root.left= helper(inorder,postorder,instart,i-1,poststart,poststart+leftsize-1);
        root.right=helper(inorder,postorder,i+1,inend,postend-rightsize,postend-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        return helper(inorder,postorder,0,len-1,0,len-1);
    }
}