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

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode rev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    public int size(ListNode head){
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        int n = (size(head) + 1) / 2;

        ListNode l1 = head;
        ListNode curr = head;

        // Reach the end of first half
        for(int i = 1; i < n; i++){
            curr = curr.next;
        }

        // Second half starts here
        ListNode l2 = curr.next;
        curr.next = null;

        l2 = reverse(l2);

        // Merge
        ListNode p1 = l1;
        ListNode p2 = l2;

        while(p1 != null && p2 != null){
            ListNode next1 = p1.next;
            ListNode next2 = p2.next;

            p1.next = p2;
            p2.next = next1;

            p1 = next1;
            p2 = next2;
        }
    }
}