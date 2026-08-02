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
    public int size(ListNode head){
        if(head == null) return 0;
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        if(head.next == null && n == 1){
            return null;
        }
        int m = size(head) - n;
        ListNode curr = head;
        if(m == 0){
            head = head.next;
            // curr = head.next;
        }
        for(int i=1 ; i<m ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
