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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1) ;
        dummy.next = head;

        ListNode leftprev = dummy;
        for(int i = 0 ; i < left-1;i++){
            leftprev = leftprev.next;
        }
        ListNode start = leftprev.next;
        ListNode curr = start.next;
        for(int i= 0 ;i<right-left;i++){
            start.next =curr.next;
            curr.next = leftprev.next;
            leftprev.next =curr;
            curr = start.next;
        }
        return dummy.next;
        
    }
}