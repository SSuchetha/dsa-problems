/*Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:

              3
             / \
            9   20
               /  \
              15    7

Input: root = [3,9,20,null,null,15,7]
Output: 3*/

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
class Solution 
{
    public int check(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=check(root.left);
        int right=check(root.right);
        return 1+Math.max(left,right);
    }
    public int maxDepth(TreeNode root) 
    {
        return check(root);
    }
}
