public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode findMid(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        // Step 1: Find mid
        ListNode middle = findMid(head);

        // Step 2: Reverse second half
        ListNode secondHalfStart = reverse(middle.next);

        // Step 3: Compare both halves
        ListNode firstHalfStart = head;
        ListNode tempSecond = secondHalfStart;

        boolean isPalin = true;

        while(tempSecond != null){
            if(firstHalfStart.val != tempSecond.val){
                isPalin = false;
                break;
            }
            firstHalfStart = firstHalfStart.next;
            tempSecond = tempSecond.next;
        }

        // Step 4: Optional — restore the original list
        middle.next = reverse(secondHalfStart);

        return isPalin;
    }
}
class Main {
    public static void main(String[] args) {
        // Creating a palindrome list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);
        System.out.println("Is Palindrome: " + result);
    }
}
