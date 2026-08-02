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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> at = new ArrayList<>();
        while(curr != null){
            a.add(curr.val);
            curr = curr.next;
        }
        int n = a.size();
        int i=0;
        while(i * k + k <= n){
            for(int j = k ; j>0 ; j--){
                at.add(a.get(j - 1 + (i*k)));
            }
            i++;
        }
        // int l = at.size();
        for(int m = i*k ; m < n ; m++){
            at.add(a.get(m));
        }
        ListNode d = new ListNode();
        ListNode v = d;
        for(int num : at){
            d.next = new ListNode(num);
            d = d.next;
        }
        return v.next;
    }
}