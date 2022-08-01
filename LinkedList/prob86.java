/*86. Partition List

Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example 1:

Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode partition(ListNode head, int x) 
    {
        ListNode left=new ListNode(-1);
        ListNode right=new ListNode(-1);
        ListNode less=left;
        ListNode more=right;
        ListNode node=head;
        while(node!=null)
        {
            if(node.val<x)
            {
                less.next=node;
                less=less.next;
            }
            else
            {
                more.next=node;
                more=more.next;
            }
            node=node.next;
        }
        more.next=null;
        less.next=right.next;
        return left.next;
    }
}
