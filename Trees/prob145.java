/*145. Binary Tree Postorder Traversal
Easy

Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example 1:

Input: root = [1,null,2,3]

          1
           \
            \
             2
            /
           /
          3

Output: [3,2,1]*/

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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> list=new ArrayList<>();
        helper(list,root);
        return list;
    }
    public void helper(List<Integer> list,TreeNode node)
    {
        if(node==null)
            return;
        helper(list,node.left);
        helper(list,node.right);
        list.add(node.val);
    }
}
