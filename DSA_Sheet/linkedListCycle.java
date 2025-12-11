class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class linkedListCycle {
    
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // 1 step
            fast = fast.next.next;    // 2 steps

            if (slow == fast) {       // cycle detected
                return true;
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next;

        System.out.println("Cycle present? : " + hasCycle(head1)); // true

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("Cycle present? :" + hasCycle(head2)); // false
    }
}
