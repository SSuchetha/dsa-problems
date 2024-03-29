/*
429. N-ary Tree Level Order Traversal

Given an n-ary tree, return the level order traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

Example 1:

          1
         /|\
        / | \
       3  2  4
      / \
     5   6
     
Input: root = [1,null,3,2,4,null,5,6]
Output: [[1],[3,2,4],[5,6]]
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0; i<s; i++)
            {
                Node n=q.poll();
                l.add(n.val);
                for(Node node : n.children)
                    q.offer(node);
            }
            list.add(l);
        }
        return list;
    }
}
