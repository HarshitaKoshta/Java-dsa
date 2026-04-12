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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) {
            return null; // single node case
        }

        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;

        ListNode prev = head;
        for(int i = 0; i < mid - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}