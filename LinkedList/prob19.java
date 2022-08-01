/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/

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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int num=0;
        ListNode node=head;
        while(node!=null)
        {
            num++;
            node=node.next;
        }
        int numToRemove=num-n+1;
        if(numToRemove==1)
            return head.next;
        num=0;
        node=head;
        while(node!=null)
        {
            num++;
            if(num==numToRemove-1)
                node.next=node.next.next;
            node=node.next;
        }
        return head;
    }
}
