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
 import java.math.BigInteger;
class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        // ListNode curr = head;
        ListNode rev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        // curr = curr.next;
        return rev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        String s1 = "";
        String s2 = "";
        while(l1 != null){
            s1 = s1+l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            s2 = s2+l2.val;
            l2 = l2.next;
        }
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger c = a.add(b);
        ListNode curr = new ListNode();
        ListNode dummy = curr;
        String d = "" + c;
        for(int i = d.length() - 1 ; i>=0 ; i--){
            dummy.next = new ListNode(d.charAt(i) - '0');
            // curr = curr.next;
            dummy = dummy.next;
        }
        return curr.next;
    }
}