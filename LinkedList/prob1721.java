/*
1721. Swapping Nodes in a Linked List

You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
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
    public ListNode swapNodes(ListNode head, int k) 
    {
        int size=0;
        ListNode first=null,last=null,cur=head;
        while(cur!=null)
        {
            size++;
            if(size==k)
                first=cur;
            cur=cur.next;
        }
        cur=head;
        int k1=size-k+1;
        int i=0;
        while(cur!=null)
        {
            i++;
            if(i==k1)
            {
                last=cur;
                break;
            }
            cur=cur.next;
        }
        int temp=first.val;
        first.val=last.val;
        last.val=temp;
        return head;
    }
}
